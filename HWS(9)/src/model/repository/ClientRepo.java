package model.repository;

import com.sun.javafx.collections.MappingChange;
import model.entity.ClientInfo;

import java.rmi.Naming;
import java.sql.*;
import java.util.*;

public class ClientRepo implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public ClientRepo() throws ClassNotFoundException, SQLException {
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "hanie", "h13");
        connection.setAutoCommit (false);
    }
    public String  inserting(ClientInfo clientInfo)throws Exception{
        String ct=clientInfo.getTransactionCode();
        preparedStatement=connection.prepareStatement ("INSERT INTO cart(origin, destination, code, amount,time) VALUES (?,?,?,?,?)");
        preparedStatement.setString (1,clientInfo.getOriginCard());
        preparedStatement.setString (2,clientInfo.getDestinationCard());
        preparedStatement.setString (3,ct);
        preparedStatement.setString (4,clientInfo.getAmount());
        preparedStatement.setString (5,clientInfo.getTime());
        preparedStatement.executeUpdate ();
        return ct;
    }
    public void deleting(String code,String dC,String Oc)throws Exception
    {
        preparedStatement=connection.prepareStatement ("delete from cart where origin=? and destination=? and code=?");
        preparedStatement.setString (1,Oc);
        preparedStatement.setString (2,dC);
        preparedStatement.setString (3,code);
        preparedStatement.executeUpdate ();

    }
    public void editing(String code,String amount)throws Exception
    {  ClientInfo clientInfo=new ClientInfo();
        preparedStatement=connection.prepareStatement ("update cart set amount=? ,time=? where  code=?");
        preparedStatement.setString (1,amount);
        preparedStatement.setString (2,clientInfo.getTime());
        preparedStatement.setString (3,code);
        preparedStatement.executeUpdate ();


    }
    public boolean check(String code,String origin,String destination)throws Exception{
        boolean compare=false;
        preparedStatement=connection.prepareStatement ("select origin , destination from cart where code=?");
        preparedStatement.setString (1,code);
        ResultSet resultSet=preparedStatement.executeQuery ();

        while (resultSet.next())
        {
          String or= resultSet.getString("origin");
          String des=resultSet.getString("destination");
          if (or.equals(origin) && des.equals(destination)) {compare=true; break;}
        } return compare;

    }
    public void commit() throws Exception{
        connection.commit ();
    }
    public void close() throws Exception {
        preparedStatement.close ();
        connection.close ();
    }
}
