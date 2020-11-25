package usc.ac.ir;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class DocumentRepository implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public DocumentRepository() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hanie","h13");
        connection.setAutoCommit(false);
    }
    public void insert(DocumentRequirments documentRequirments) throws Exception{
        preparedStatement=connection.prepareStatement("insert into document(num,type,owner,descript,datee,id)values(?,?,?,?,?,?)");
        preparedStatement.setString(1, documentRequirments.getDocNum());
        preparedStatement.setString(2, documentRequirments.getDocType());
        preparedStatement.setString(3, documentRequirments.getOwnerName());
        preparedStatement.setString(4, documentRequirments.getDescriptions());
        preparedStatement.setString(5, documentRequirments.getDocDate());
        preparedStatement.setInt(6, documentRequirments.getID());
        preparedStatement.executeUpdate();
    }
    public void update(DocumentRequirments documentRequirments,int choose,String replacement) throws Exception{
        switch (choose){
            case 1:
                preparedStatement=connection.prepareStatement("update document set owner=? where id=?");
                preparedStatement.setString(1, replacement);
                preparedStatement.setInt(2, documentRequirments.getID());
                break;
            case 2:
                preparedStatement=connection.prepareStatement("update document set type=? where id=?");
                preparedStatement.setString(1, replacement);
                preparedStatement.setInt(2, documentRequirments.getID());
                break;
            case 3:
                preparedStatement=connection.prepareStatement("update document set num=? where id=?");
                preparedStatement.setString(1, replacement);
                preparedStatement.setInt(2, documentRequirments.getID());
                break;
            case 4:
                preparedStatement=connection.prepareStatement("update document set datee=? where id=?");
                preparedStatement.setString(1, replacement);
                preparedStatement.setInt(2, documentRequirments.getID());
                break;
            case 5:
                preparedStatement=connection.prepareStatement("update document set descript=? where id=?");
                preparedStatement.setString(1, replacement);
                preparedStatement.setInt(2, documentRequirments.getID());
                break;
            case 6:
                preparedStatement=connection.prepareStatement("update document set descript=? ,datee=?, num=?, type=?, owner=? where id=?");
                preparedStatement.setString(1, documentRequirments.getDescriptions());
                preparedStatement.setString(2, documentRequirments.getDocDate());
                preparedStatement.setString(3, documentRequirments.getDocNum());
                preparedStatement.setString(4, documentRequirments.getDocType());
                preparedStatement.setString(5, documentRequirments.getOwnerName());
                preparedStatement.setInt(6, documentRequirments.getID());
                break;
            default:
                System.out.println("wrong answer !!!");
        }preparedStatement.executeUpdate();

    }
    public List<DocumentRequirments> selectForPeople(String owner, int ID)throws Exception{
        preparedStatement=connection.prepareStatement("SELECT * from document where id=?");
        DocumentRequirments documentRequirments=new DocumentRequirments();
        preparedStatement.setInt(1, documentRequirments.getID());
        ResultSet resultSet=preparedStatement.executeQuery();

        List<DocumentRequirments> entityList=new ArrayList<>();
        while(resultSet.next()){
            DocumentRequirments entity=new DocumentRequirments();
            if (owner==resultSet.getString("owner") && ID==resultSet.getInt("id")){
            entity.setOwnerName(resultSet.getString("owner"));
            entity.setDocType(resultSet.getString("type"));
            entity.setDocNum(resultSet.getString("num"));
            entity.setDocDate(resultSet.getString("datee"));
            entity.setID(resultSet.getInt("id"));
            entity.setDescriptions(resultSet.getString("descript"));
                entityList.add(entity);


        }else {
                entityList.add(null);
            } }
        return entityList;
    }
    public List<DocumentRequirments> selectForManager()throws Exception{
        preparedStatement=connection.prepareStatement("SELECT * from document");

        ResultSet resultSet=preparedStatement.executeQuery();
        List<DocumentRequirments> entityList=new ArrayList<>();
        while(resultSet.next()){
            DocumentRequirments entity=new DocumentRequirments();

            entity.setOwnerName(resultSet.getString("owner"));
            entity.setDocType(resultSet.getString("type"));
            entity.setDocNum(resultSet.getString("num"));
            entity.setDocDate(resultSet.getString("datee"));
            entity.setID(resultSet.getInt("id"));
            entity.setDescriptions(resultSet.getString("descript"));
            entityList.add(entity);
        }
        return entityList;
    }
    public void delete(DocumentRequirments documentRequirments) throws Exception{
        preparedStatement=connection.prepareStatement ("DELETE FROM document WHERE id=?");
        preparedStatement.setInt(1, documentRequirments.getID());
        preparedStatement.executeUpdate ();
    }
    public void commit() throws Exception{
        connection.commit();
    }
    public void rollback()throws Exception{
        connection.rollback();
    }


    @Override
    public void close() throws Exception {
        preparedStatement.close ();
        connection.close ();

    }
}
