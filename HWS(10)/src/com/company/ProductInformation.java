package com.company;

public class ProductInformation {
   private String name,brand,guarantee,cost;

    public String getName() {
        return name;
    }

    public ProductInformation setName(String name) {
        this.name = name;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public ProductInformation setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public ProductInformation setGuarantee(String guarantee) {
        this.guarantee = guarantee;
        return this;
    }

    public String getCost() {
        return cost;
    }

    public ProductInformation setCost(String cost) {
        this.cost = cost;
        return this;
    }
}
