package Controller;

import Model.Entity.CarEntity;
import Model.Service.CarService;
import Model.Service.SellService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to our Car factory!\nFeel free to choose a number:");
        try {
            CarService.getInstance().mainMenu();
        }catch(Exception e){
            System.out.println("Failed to show main-menu!"+e.getMessage());
        }
        String num=scanner.nextLine();
        try{

            CarService.getInstance().showOptions(Integer.parseInt(num));
        }catch (Exception e){
            System.out.println("Failed to show!"+e.getMessage());
        }
        System.out.println("Choose a number for buying:");
        String num1=scanner.nextLine();
        System.out.println("Now Enter Customer's name and  the car name ID respectively to continue!");
        try {
            SellService.getInstance().saveCustomer(num1,new CarEntity().setCustomer(scanner.nextLine()).setCarID(num).setCarNameID(scanner.nextLine()));
        }catch (Exception e){
            System.out.println("Failed to sell!"+e.getMessage());
        }
    }
}
