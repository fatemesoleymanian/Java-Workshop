package com.company;


import java.util.Scanner;

public class ControllProduct {
    Scanner scanner=new Scanner(System.in);

    ControllProduct() throws Exception {
        ProductInformation productInformation=new ProductInformation();
        switch (Menu.answer){
            case 1:
                productInformation.setName("Computer Headset");
                productInformation.setCost("44$");
                productInformation.setBrand("Tesco");
                productInformation.setGuarantee("12months");
                break;
            case 2:
                productInformation.setName("External Hard");
                productInformation.setCost("1298$");
                productInformation.setBrand("Western");
                productInformation.setGuarantee("18months");
                break;
            case 3:
                productInformation.setName("Wireless Headphones");
                productInformation.setCost("4849$");
                productInformation.setBrand("Apple");
                productInformation.setGuarantee("12months");
                break;
            case 4:
                productInformation.setName("Tablet");
                productInformation.setCost("36990$");
                productInformation.setBrand("Samsung");
                productInformation.setGuarantee("12months");
                break;
            case 5:
                productInformation.setName("WIRELESS Speaker");
                productInformation.setCost("1289$");
                productInformation.setBrand("MONSTER");
                productInformation.setGuarantee("7days");
                break;
            case 6:
                productInformation.setName("Internal SSD Drive 120GB");
                productInformation.setCost("6000$");
                productInformation.setBrand("Western");
                productInformation.setGuarantee("24months");
                break;
            case 7:
                productInformation.setName("Smart Watch");
                productInformation.setCost("1298$");
                productInformation.setBrand("Xiaomi");
                productInformation.setGuarantee("12months");
                break;
            case 8:
                productInformation.setName("Computer");
                productInformation.setCost("77000$");
                productInformation.setBrand("Apple");
                productInformation.setGuarantee("18months");
                break;
            case 9:
                productInformation.setName("Camera");
                productInformation.setCost("900$");
                productInformation.setBrand("Canon");
                productInformation.setGuarantee("18months");
                break;
            case 10:
                productInformation.setName("Printer");
                productInformation.setCost("2799$");
                productInformation.setBrand("Hp");
                productInformation.setGuarantee("18months");
                break;
            default:
                System.out.println("not found product !");
        }
        System.out.println("are you sure to buy?" );
        String ans=scanner.next();
        if (ans.equals("yes") || ans.equals("Y")|| ans.equals("Yes")||ans.equals("YES")) {
            System.out.println("Redirecting to Payment section\njust waite for 90 seconds ...");
            SaveProduct saveProduct=new SaveProduct();
            saveProduct.insert(productInformation);
            saveProduct.commit();
            saveProduct.close();
        }
        else {Menu menu=new Menu();}
    }
}
