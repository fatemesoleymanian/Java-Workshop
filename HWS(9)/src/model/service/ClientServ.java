package model.service;

import model.entity.ClientInfo;
import model.repository.ClientRepo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class ClientServ {
    private ClientServ(){}

    private static ClientServ clientServ=new ClientServ();
    String result;

    public static ClientServ getInstance(){
        return clientServ;
    }

    public String  transfer(ClientInfo clientInfo) throws Exception {
        ClientRepo clientRepo=new ClientRepo();
            String ct=clientRepo.inserting(clientInfo);
            clientRepo.commit();
            clientRepo.close();
            return ct;
    }


    public void update(String code,String amount)throws Exception
    {
        ClientRepo clientRepo=new ClientRepo();
        clientRepo.editing(code,amount);
        clientRepo.commit();
        clientRepo.close();

    }
    public void delete(String code,String des,String ori)throws Exception
    {
        ClientRepo clientRepo=new ClientRepo();
        clientRepo.deleting(code,des,ori);
        clientRepo.close();
        clientRepo.close();
    }

}
