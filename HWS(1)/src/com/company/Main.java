package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter The Radius...");
        int radius=scanner.nextInt();
        Circle MyObj=new Circle();
        MyObj.area(radius);
        MyObj.env(radius);

    }
}
