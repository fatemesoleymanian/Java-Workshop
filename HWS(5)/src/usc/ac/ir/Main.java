package usc.ac.ir;


import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DomesticTrips domesticTrips=new DomesticTrips(0);
        AbroadTrip abroadTrip=new AbroadTrip(0);




        System.out.println("-----hello and welcome to our airline-----");
        System.out.println("*** we thank you for choosing us ***");

        System.out.println("i)Our Tours\nii)Contact Us");
        String option = scanner.next();

        if (option.equals("i") || option.equals("I")) {
            System.out.println("here are our tours :\ni)Domestic Trips.\nii)Overseas Trips.");
            option = scanner.next();
            if (option.equals("i") || option.equals("I")) {
                Tour showDomesticTrips = new DomesticTrips();
                option = scanner.next();
                if (option.equals("i") || option.equals("I")) {
                    domesticTrips.specialMenu();
                }
                else domesticTrips.normalMenu();

            }
            else{
                Tour showAbroadTrip=new AbroadTrip();
                option = scanner.next();
                if (option.equals("i") || option.equals("I")){
                    abroadTrip.specialMenu();

                }
                else {
                    abroadTrip.normalMenu();

                }
            }
        }

        else {
                System.out.println("Follow Us");
                System.out.println("AirlineTourFactory");
                System.out.println("And You Can Contact Us On");
                System.out.println("Airline.com");
            }




    }
}
