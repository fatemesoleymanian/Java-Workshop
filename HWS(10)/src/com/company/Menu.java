package com.company;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    Scanner scanner=new Scanner(System.in);
    public static int answer;
    public Menu() throws Exception {

        System.out.println("\t\t\t\t\t\t\t*******HELLO AND WELCOME TO OUR SHOP*******\n\tTHANK YOU FOR CHOOSING US ! ");
        mainMenu();
    }
    public void mainMenu() throws Exception {
                 String p1="Computer Headset             44$                   Tesco             12months";
                 String p2="External Hard                1298$                 Western           18months";
                 String p3="Wireless Headphones          4849$                 Apple             12months";
                 String p4="Tablet                       36990$                Samsung           12months";
                 String p5="WIRELESS Speaker             1289$                 MONSTER           7days";
                 String p6="Internal SSD Drive 120GB     6000$                 Western           24months";
                 String p7="Smart Watch                  1298$                 Xiaomi            12months";
                 String p8="Computer                     77000$                Apple             18months";
                 String p9="Camera                       900$                  Canon             18months";
                 String p10="Printer                     2799$                 Hp                18months";

        System.out.println("HERE ARE OUR PRODUCTS :");
        System.out.println("name                          cost                    brand              Guarantee");
        System.out.println("1"+p1+"\n"+"2"+p2+"\n"+"3"+p3+"\n"+"4"+p4+"\n"+"5"+p5+"\n"+"6"+p6+"\n"+"7"+p7+"\n"+"8"+p8+"\n"+"9"+p9+"\n"+"10"+p10);
        System.out.println("choose what you need !");
        answer=scanner.nextInt();
        ControllProduct controllProduct=new ControllProduct();


    }
}
