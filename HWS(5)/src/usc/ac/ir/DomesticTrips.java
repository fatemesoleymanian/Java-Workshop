package usc.ac.ir;

import java.util.ArrayList;
import java.util.List;

public class DomesticTrips extends Tour{

    List<String> tourPlacesList=new ArrayList<>();

    public DomesticTrips() {
        System.out.println("Showing Details ...");

        try {
            Thread.sleep(6 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        System.out.println("i)Special Suggestions\nii)Normal Tours");
    }
    DomesticTrips(int p){}

    @Override
    public String  date() {
         return super.date()+" "+"5 day trip";

    }
    public String specialSuggestion1(int a) {
        setDestinationName("Shiraz");
        setAirplaneFactoryName("Simorgh");
        setHotelName("Arg Hotel");
        setStarNumber("**");
        setTourCapacity((int) (Math.random() * 41));
        setCost("250 Tomans");
        setTourismPlaces("Shiraz");

        if (a==0)
            return (String) getDestinationName();
        if (a==1)
            return (String) getAirplaneFactoryName();
        if (a==2)
            return (String) getHotelName();
        if (a==3)
            return (String) getStarNumber();
        if (a==4)
            return String.valueOf((int) getTourCapacity());
        if (a==5)
            return (String)getTourismPlaces();
        if (a==6)
            return (String) getCost();
        else return null;
    }

    public String  specialSuggestion2(int a) {
        setDestinationName("Isfahan");
        setAirplaneFactoryName("Simorgh");
        setHotelName("Partikan Motel");
        setStarNumber("****");
        setTourCapacity((int) (Math.random() * 31));
        setCost("388 Tomans");
        setTourismPlaces("Isfahan");

        if (a==0)
            return (String) getDestinationName();
        if (a==1)
            return (String) getAirplaneFactoryName();
        if (a==2)
            return (String) getHotelName();
        if (a==3)
            return (String) getStarNumber();
        if (a==4)
            return String.valueOf((int) getTourCapacity());
        if (a==5)
            return (String)getTourismPlaces();
        if (a==6)
            return (String) getCost();
        else return null;
    }

    public String tourPlace1(int a) {
        setDestinationName("Kish");
        setAirplaneFactoryName("Simorgh");
        setHotelName("Dariush Hotel");
        setStarNumber("****");
        setTourCapacity((int) (Math.random() * 31));
        setCost("400 Tomans");
        setTourismPlaces("Kish Island");

        if (a==0)
            return (String) getDestinationName();
        if (a==1)
            return (String) getAirplaneFactoryName();
        if (a==2)
            return (String) getHotelName();
        if (a==3)
            return (String) getStarNumber();
        if (a==4)
            return String.valueOf((int) getTourCapacity());
        if (a==5)
            return (String)getTourismPlaces();
        if (a==6)
            return (String) getCost();
        else return null;
    }

    public String  tourPlace2(int a) {
        setDestinationName("North");
        setAirplaneFactoryName("Simorgh");
        setHotelName("KadUs Grand Hotel");
        setStarNumber("***");
        setTourCapacity((int) (Math.random() * 31));
        setCost("385 Tomans");
        setTourismPlaces("Gilan");

        if (a==0)
            return (String) getDestinationName();
        if (a==1)
            return (String) getAirplaneFactoryName();
        if (a==2)
            return (String) getHotelName();
        if (a==3)
            return (String) getStarNumber();
        if (a==4)
            return String.valueOf((int) getTourCapacity());
        if (a==5)
            return (String)getTourismPlaces();
        if (a==6)
            return (String) getCost();
        else return null;

    }

    public String tourPlace3(int a) {
        setDestinationName("Yazd");
        setAirplaneFactoryName("Simorgh");
        setHotelName("Parsian Grand Hotel");
        setStarNumber("****");
        setTourCapacity((int) (Math.random()*31));
        setCost("450 Tomans");
        setTourismPlaces("Center Of City");

        if (a==0)
           return (String) getDestinationName();
        if (a==1)
           return (String) getAirplaneFactoryName();
        if (a==2)
           return (String) getHotelName();
        if (a==3)
           return (String) getStarNumber();
        if (a==4)
           return String.valueOf((int) getTourCapacity());
        if (a==5)
           return (String)getTourismPlaces();
        if (a==6)
           return (String) getCost();
        else return null;



    }

    public void specialMenu() throws Exception {
        System.out.println("*****Special Suggestion For You*****");
        System.out.println("destination |  airline  |  hotel  |  star  |  capacity  |  places  |  cost for 2 people  |  departure date ");

        for (int i=0 ;i<7 ;i++) {
            tourPlacesList.add(specialSuggestion1(i));
        }
        tourPlacesList.add(date());

        for (int i=0 ;i<7 ;i++) {
            tourPlacesList.add(specialSuggestion2(i));
        }
        tourPlacesList.add(date());

        for (int i=0 ; i<8 ;i++){
            System.out.print(tourPlacesList.get(i)+" "+"\t\t\t");
        }
        System.out.println(" ");
        for (int i=8 ; i<16 ;i++){
            System.out.print(tourPlacesList.get(i)+"\t\t\t");
        }

        System.out.println("\n\n\n\n_________________________________________\n\n");
        BookAndException bookAndException=new BookAndException();
        bookAndException.domestic_special();

    }
    public void normalMenu() throws Exception {
        System.out.println("*****Normal Tours*****");
        System.out.println("destination |  airline  |  hotel  |  star  |  capacity  |  places  |  cost for 2 people  |  departure date ");

        for (int i=0 ;i<7 ;i++) {
            tourPlacesList.add(tourPlace1(i));
        }
        tourPlacesList.add(date());
        for (int i=0 ;i<7 ;i++) {
            tourPlacesList.add(tourPlace2(i));
        }
        tourPlacesList.add(date());
        for (int i=0 ;i<7 ;i++) {
            tourPlacesList.add(tourPlace3(i));
        }
        tourPlacesList.add(date());

        for (int i=0 ; i<8 ;i++){
            System.out.print(tourPlacesList.get(i)+"\t\t\t");
        }
        System.out.println(" ");
        for (int i=8 ; i<16 ;i++){
            System.out.print(tourPlacesList.get(i)+"\t\t\t");
        }
        System.out.println(" ");
        for (int i=16 ; i<24 ;i++){
            System.out.print(tourPlacesList.get(i)+"\t\t\t");
        }

        System.out.println("\n\n\n\n_________________________________________\n\n");
        BookAndException bookAndException=new BookAndException();
        bookAndException.domestic_normal();


    }

}
