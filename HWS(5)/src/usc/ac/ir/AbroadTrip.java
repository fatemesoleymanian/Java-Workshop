package usc.ac.ir;


import java.util.ArrayList;
import java.util.List;

public class AbroadTrip extends Tour {
    List<String> tourPlacesList=new ArrayList<>();

    public AbroadTrip() {
        System.out.println("Showing Details ...");

        try {
            Thread.sleep(6 * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        System.out.println("i)Special Suggestions\nii)Normal Tours");
    }
    AbroadTrip(int p){}

    @Override
    public String  date() {

        return super.date()+" "+"10 day trip";


    }
    public String  specialSuggestion1(int a){
        setDestinationName("Italy");
        setAirplaneFactoryName("Simorgh");
        setHotelName("Belvedere Hotel");
        setStarNumber("*****");
        setTourCapacity((int)(Math.random() * 21));
        setCost("3000$");
        setTourismPlaces("Rome");

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
    public String  specialSuggestion2(int a){
        setDestinationName("Spain");
        setAirplaneFactoryName("Simorgh");
        setHotelName("Arts Barcelona Hotel");
        setStarNumber("*****");
        setTourCapacity((int)(Math.random() * 21));
        setCost("4000$");
        setTourismPlaces("Madrid");

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
    public String  tourPlace1(int a){
        setDestinationName("France");
        setAirplaneFactoryName("Simorgh");
        setHotelName("Ritz Paris Hotel");
        setStarNumber("****");
        setTourCapacity((int)(Math.random() * 31));
        setCost("2500$");
        setTourismPlaces("Paris");

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
    public String  tourPlace2(int a){
        setDestinationName("Trkey");
        setAirplaneFactoryName("Simorgh");
        setHotelName("Akra Hotel");
        setStarNumber("****");
        setTourCapacity((int)(Math.random() * 21));
        setCost("3500$");
        setTourismPlaces("Antalya");

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
    public String  tourPlace3(int a){
        setDestinationName("South Africa");
        setAirplaneFactoryName("Simorgh");
        setHotelName("Radisson Blu Hotel");
        setStarNumber("***");
        setTourCapacity((int)(Math.random() * 16));
        setCost("2500$");
        setTourismPlaces("Johannesburg");

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
        System.out.println("destination |  airline  |  hotel  |  star  |  capacity  |  places  | cost for 2 people  |  departure date");

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
        bookAndException.abroad_special();

    }
    public void normalMenu() throws Exception {
        System.out.println("*****Normal Tours*****");
        System.out.println("destination |  airline  |  hotel  |  star  |  capacity  |  places  | cost for 2 people  |  departure date");

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
        bookAndException.abroad_normal();

    }
}
