package com.company;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws Exception {
        Thread typeOne = new Thread()
        {
            @Override
            public void run() {
                try {
                    Menu menu=new Menu();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Thread typeTwo = new Thread()
        {
            @Override
            public void run() {
                try {
                    Menu menu=new Menu();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        if (Menu.answer== 1 || Menu.answer==3  || Menu.answer==5 || Menu.answer==7 ||Menu.answer==9)
        {
            typeOne.start();
        }else typeTwo.start();

    }
}
