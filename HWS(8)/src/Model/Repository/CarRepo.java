package Model.Repository;

import Model.Entity.CarEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CarRepo implements AutoCloseable {
    private PreparedStatement preparedStatement;
    private Connection connection;
    public CarRepo() throws Exception{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "admin", "myjava123");
        connection.setAutoCommit(false);
    }
    public void insert(CarEntity carEntity)throws Exception{
        preparedStatement=connection.prepareStatement("insert into customertable(customers,carid,carnameid)values (?,?,?)");
        preparedStatement.setString(1,carEntity.getCustomer());
        preparedStatement.setString(2, carEntity.getCarID());
        preparedStatement.setString(3, carEntity.getCarNameID());
        preparedStatement.executeUpdate();
    }
    public void commit()throws Exception{
        connection.commit();
    }
    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close ();
    }
}