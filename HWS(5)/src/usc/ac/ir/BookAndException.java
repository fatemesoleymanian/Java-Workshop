package usc.ac.ir;

import java.util.Scanner;

public class BookAndException extends Exception{
    Scanner scanner=new Scanner(System.in);
    String booK;
    String answer;
    public  BookAndException()throws Exception {

        System.out.println("to book a tour enter the destination name .");

         booK = scanner.next();
    }
    public void domestic_special() throws Exception {
        switch (booK) {
            case "Isfahan":
                System.out.println("are you sure to book Isfahan tour?");
                answer = scanner.next();
                if (answer.equals("Yes") || answer.equals("yes") || answer.equals("y") || answer.equals("Y"))
                    System.out.println("Isfahan tour is booked fo you !\n***have a nice trip***");
                else return;
                break;
            case "Shiraz":
                System.out.println("are you sure to book Shiraz tour?");
                answer = scanner.next();
                if (answer.equals("Yes") || answer.equals("yes") || answer.equals("y") || answer.equals("Y"))
                    System.out.println("Shiraz tour is booked for you !\n***have a nice trip***");
                else return;
                break;
            default:
                throw new Exception("tour not found!");


        }
    }
    public void domestic_normal() throws Exception {
        switch (booK) {
            case "Kish":
                System.out.println("are you sure to book Kish tour?");
                answer = scanner.next();
                if (answer.equals("Yes") || answer.equals("yes") || answer.equals("y") || answer.equals("Y"))
                    System.out.println("Kish tour is booked for you !\n***have a nice trip***");
                else return;
                break;
            case "North":
                System.out.println("are you sure to book North tour?");
                answer = scanner.next();
                if (answer.equals("Yes") || answer.equals("yes") || answer.equals("y") || answer.equals("Y"))
                    System.out.println("North tour is booked for you !\n***have a nice trip***");
                else return;
                break;
            case "Yazd":

                System.out.println("are you sure to book Yazd tour?");
                answer = scanner.next();
                if (answer.equals("Yes") || answer.equals("yes") || answer.equals("y") || answer.equals("Y"))
                    System.out.println("Yazd tour is booked for you !\n***have a nice trip***");
                else return;
                break;
            default:
                throw new Exception("tour not found!");
        }
    }
    public void  abroad_special() throws Exception {
        switch (booK) {
            case "Italy":
                System.out.println("are you sure to book Italy tour?");
                answer = scanner.next();
                if (answer.equals("Yes") || answer.equals("yes") || answer.equals("y") || answer.equals("Y"))
                    System.out.println("Italy tour is booked fo you !\n***have a nice trip***");
                else return;
                break;
            case "Spain":
                System.out.println("are you sure to book Spain tour?");
                answer = scanner.next();
                if (answer.equals("Yes") || answer.equals("yes") || answer.equals("y") || answer.equals("Y"))
                    System.out.println("Spain tour is booked for you !\n***have a nice trip***");
                else return;
                break;
            default:
                throw new Exception("tour not found!");


        }
    }
    public void abroad_normal() throws Exception {
        switch (booK) {
            case "France":
                System.out.println("are you sure to book France tour?");
                answer = scanner.next();
                if (answer.equals("Yes") || answer.equals("yes") || answer.equals("y") || answer.equals("Y"))
                    System.out.println("France tour is booked for you !\n***have a nice trip***");
                else return;
                break;
            case "Turkey":
                System.out.println("are you sure to book Turkey  tour?");
                answer = scanner.next();
                if (answer.equals("Yes") || answer.equals("yes") || answer.equals("y") || answer.equals("Y"))
                    System.out.println("Turkey tour is booked for you !\n***have a nice trip***");
                else return;
                break;
            case "South Africa":

                System.out.println("are you sure to book South Africa tour?");
                answer = scanner.nextLine();
                if (answer.equals("Yes") || answer.equals("yes") || answer.equals("y") || answer.equals("Y"))
                    System.out.println("South Africa tour is booked for you !\n***have a nice trip***");
                else return;
                break;
            default:
                throw new Exception("tour not found!");
        }
    }

}




