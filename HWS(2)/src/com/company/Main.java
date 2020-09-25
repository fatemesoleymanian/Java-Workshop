package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here+
        Scanner scanner=new Scanner(System.in);
        String string = null;
        System.out.println("plz enter a string");
        Countvowels count=new Countvowels();
        string=scanner.next();
        count.countVowels(string);
    }
}
