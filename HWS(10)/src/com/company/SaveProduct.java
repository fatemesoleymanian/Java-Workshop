package com.company;

import java.sql.*;

public class SaveProduct implements AutoCloseable{
    private  Connection connection;
    private  PreparedStatement preparedStatement;
    SaveProduct() throws ClassNotFoundException, SQLException {

        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "hanie", "h13");
       connection.setAutoCommit(false);
    }


    public  void insert(ProductInformation productInformation) throws SQLException {

        preparedStatement = connection.prepareStatement("INSERT INTO shop(name, cost, brand, guarantee) VALUES (?,?,?,?)");
        preparedStatement.setString(1, productInformation.getName());
        preparedStatement.setString(2, productInformation.getCost());
        preparedStatement.setString(3, productInformation.getBrand());
        preparedStatement.setString(4, productInformation.getGuarantee());
        preparedStatement.executeUpdate();

        try {
            Thread.sleep(90000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("you own it now :)");
    }
    public void commit() throws Exception{
        connection.commit ();
    }

    public void rollBack()throws Exception{
        connection.rollback();
    }

    @Override
    public void close() throws Exception {
        preparedStatement.close ();
        connection.close ();


    }
}
