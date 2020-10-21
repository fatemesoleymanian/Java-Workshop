package usc.ac.ir;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Tour<DestinationName,HotelName,StarNumber,AirplaneFactoryName,TourismPlaces,Cost,TourCapacity> {

    DestinationName destinationName;
    HotelName hotelName;
    StarNumber starNumber;
    AirplaneFactoryName airplaneFactoryName;
    TourismPlaces tourismPlaces;
    Cost cost;
    TourCapacity tourCapacity;

    Tour(){}

    public void setDestinationName(DestinationName destinationName) {
        this.destinationName = destinationName;
    }

    public void setHotelName(HotelName hotelName) {
        this.hotelName = hotelName;
    }

    public void setStarNumber(StarNumber starNumber) {
        this.starNumber = starNumber;
    }

    public void setAirplaneFactoryName(AirplaneFactoryName airplaneFactoryName) {
        this.airplaneFactoryName = airplaneFactoryName;
    }

    public void setTourismPlaces(TourismPlaces tourismPlaces) {
        this.tourismPlaces = tourismPlaces;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    public void setTourCapacity(TourCapacity tourCapacity) {
        this.tourCapacity = tourCapacity;
    }

    public DestinationName getDestinationName(){return destinationName;}

    public HotelName getHotelName() {
        return hotelName;
    }

    public StarNumber getStarNumber() {
        return starNumber;
    }

    public AirplaneFactoryName getAirplaneFactoryName() {
        return airplaneFactoryName;
    }

    public TourismPlaces getTourismPlaces() {
        return tourismPlaces;
    }

    public Cost getCost() { return cost;
    }

    public TourCapacity getTourCapacity() {
        return tourCapacity;
    }

    public void tourInformation(){ }

    public String  date(){


        LocalDateTime departureDate = LocalDateTime.of(2020, 10, 30, 9, 0);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = departureDate.format(myFormatObj);
        return "departure date is" + " " +formattedDate+" "+"p.m";

    }


}
