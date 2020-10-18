package usc.ac.ir;
import java.util.Scanner;

public class MainMenu {
    public MainMenu(String s){
        System.out.println("**Hello and welcome to the BMW Company**");
    }
    public MainMenu(){}
    public void menu() throws SellExceptions {
        Cars cars=new Cars();
        Sell sell=new Sell();
        SellExceptions sellExceptions=new SellExceptions();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose a number for your desired option:");
        System.out.println("1.Store");
        System.out.println("2.Contact Us");
        int optionNum=Integer.parseInt(scanner.nextLine());
        switch (optionNum){
            case 1:
                System.out.println("Do You want SUV or normal cars?");
                String ans=scanner.nextLine();
                System.out.println("Here are the results:");
                if(ans.equals("SUV")||ans.equals("Suv")||ans.equals("suv")){
                    System.out.print("1. ");
                    cars.shasiBoland1();
                    System.out.println("----------");
                    System.out.print("2. ");
                    cars.shasiBoland2();
                    System.out.println("----------");
                    System.out.print("3. ");
                    cars.shasiBoland3();
                    int ansNum;
                    System.out.println("Which one do you desire?");
                    ansNum=Integer.parseInt(scanner.nextLine());
                }
                else if(ans.equals("normal")||ans.equals("Normal")){
                    System.out.print("1. ");
                    cars.savari1();
                    System.out.println("----------");
                    System.out.print("2. ");
                    cars.savari2();
                    System.out.println("----------");
                    System.out.print("3. ");
                    cars.savari3();
                    int ansNum;
                    System.out.println("Which one do you desire?");
                    ansNum=Integer.parseInt(scanner.nextLine());
                }
                sell.sell();
                break;
            case 2:
                System.out.println("You can contact us on:");
                System.out.println("https://iamlilsanne@gmail.com");
                break;
        }
    }
}
