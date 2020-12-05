package Model.Entity;

public class CarEntity {
    String carID;
    String customer;
    String carNameID;

    public String getCarNameID() {
        return carNameID;
    }

    public CarEntity setCarNameID(String carNameID) {
        this.carNameID = carNameID;
        return this;
    }

    public String getCarID() {

        return carID;
    }

    public CarEntity setCarID(String carID) {

        this.carID = carID;
        return this;
    }

    public String getCustomer() {

        return customer;
    }

    public CarEntity setCustomer(String customer) {

        this.customer = customer;
        return this;
    }



}
