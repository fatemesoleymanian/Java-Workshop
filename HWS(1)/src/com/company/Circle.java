package com.company;

public class Circle {

    static double pi=3.14d;
    public void area(int radius){
        System.out.println("The Area Is:"+(radius*radius)*pi);
    }
    public void env(int radius){
        System.out.println("The Enviroment Is:"+(radius*2)*pi);
    }
}
