package usc.ac.ir;
import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class DocumentControlling {
    Scanner scanner=new Scanner(System.in);
    public DocumentControlling(){
        System.out.println(" *** welcome to documents office ****");
        System.out.println("choose one option please");
        System.out.println("1) save document");
        System.out.println("2)show document");
        System.out.println("3)update document");
        System.out.println("4)delete document");

    }
    public void createDoc(){
        System.out.println(" owner name:");
        String ownerName=scanner.next();
        System.out.println("document type :");
        String docTyp=scanner.next();
        System.out.println(" document number(xxx/xx/xxxxx) :");
        String nuMDoc=scanner.next();
        System.out.println("document date ( xxxx/xx/xx) :");
        String docdaTe=scanner.next();
        System.out.println("description :");
        String  docDescription= scanner.next();
        System.out.println("document ID :");
        int docID=scanner.nextInt();
        try {
            DocumentRepository userRepo=new DocumentRepository();
            userRepo.insert(new DocumentRequirments ().setOwnerName (ownerName).setDocType (docTyp).setDocNum (nuMDoc).setDocDate(docdaTe).setDescriptions(docDescription).setID(docID));
            System.out.println("save info? (y/n)");
            String ans=scanner.next();
            if (ans.equals("y") || ans.equals("Y")) {userRepo.commit(); userRepo.close();}
            if (ans.equals("n") || ans.equals("N")){userRepo.rollback(); userRepo.close(); }

        }
        catch (Exception e){
            System.out.println ("fail to save!!!"+e.getMessage ());
        }}
    public void show(){
        System.out.println("owner name");
        String owner=scanner.next();
        System.out.println("document ID");
        int docID=scanner.nextInt();
        if(docID==12345 && owner.equals("hanieSoleymani")){
            System.out.println("you entered to system as manager");
            System.out.println("you can see tables info");
            try {
                DocumentRepository userRepo=new DocumentRepository();
                List<DocumentRequirments> userList = userRepo.selectForManager();
                for (DocumentRequirments userEntity : userList) {
                    System.out.print("owner:\t"+userEntity.getOwnerName());
                    System.out.print("type:\t"+userEntity.getDocType());
                    System.out.print("date:\t"+userEntity.getDocDate());
                    System.out.print("number:\t"+userEntity.getDocNum());
                    System.out.print("ID:\t"+userEntity.getID());
                    System.out.print("descriptions:\t"+userEntity.getDescriptions()+"\n");
                }
            }
            catch (Exception e){
                System.out.println ("Fail to login !"+e.getMessage ());
            }

        }else {
            try {
                DocumentRepository userRepo=new DocumentRepository();
                List<DocumentRequirments> userList = userRepo.selectForPeople(owner,docID);
                if (userList!=null){
                    for (DocumentRequirments userEntity : userList) {
                        System.out.print("owner:\t"+userEntity.getOwnerName());
                        System.out.print("type:\t"+userEntity.getDocType());
                        System.out.print("date:\t"+userEntity.getDocDate());
                        System.out.print("number:\t"+userEntity.getDocNum());
                        System.out.print("ID:\t"+userEntity.getID());
                        System.out.print("descriptions:\n"+userEntity.getDescriptions());

                }}else{
                    System.out.println("wrong input");

                }
            }
            catch (Exception e){
                System.out.println ("Fail to login !"+e.getMessage ());
            }

        }


    }
    public void changes(){

        System.out.println("  owner name");
        String owner=scanner.next();
        System.out.println("doc ID");
        int docID=scanner.nextInt();
        System.out.println("choose one:\n1)owner name\t2)type\t3)number\t4)date\t5)description\t6)all");
        int choose=scanner.nextInt();
        if (choose!=6){
        System.out.println("enter the replacement");
        String replacement=scanner.next();
        try {
            DocumentRepository userRepo=new DocumentRepository();
            userRepo.update(new DocumentRequirments ().setID(docID),choose,replacement);
            System.out.println("save changes?(y/n)");
            String ans=scanner.next();
            if (ans.equals("y") || ans.equals("Y")) {userRepo.commit(); userRepo.close();}
            if (ans.equals("n") || ans.equals("N")){userRepo.rollback(); userRepo.close(); }

        }
        catch (Exception e){
            System.out.println ("fail to save!!!"+e.getMessage ());
        }}
        else {
            System.out.println("enter the replacement (no right to change ID)");
            String replacement="null";
            String reDes,reDat,reNum,reName,reType;

            System.out.println("owner name");
            reName=scanner.next();
            System.out.println("date");
            reDat=scanner.next();
            System.out.println("description");
            reDes=scanner.next();
            System.out.println("number");
            reNum=scanner.next();
            System.out.println("type");
            reType=scanner.next();
            try {
                DocumentRepository userRepo=new DocumentRepository();
                userRepo.update(new DocumentRequirments ().setID(docID).setDescriptions(reDes).setDocDate(reDat).setDocNum(reNum).setOwnerName(reName).setDocType(reType),choose,replacement);
                System.out.println("save changes ?");
                String ans=scanner.next();
                if (ans.equals("y") || ans.equals("Y")) {userRepo.commit(); userRepo.close();}
                if (ans.equals("N") || ans.equals("n")){userRepo.rollback(); userRepo.close(); }

            }
            catch (Exception e){
                System.out.println ("fail to save!!!"+e.getMessage ());
            }

        }
    }
    public void delete(){
        System.out.println("  owner name");
        String owner=scanner.next();
        System.out.println("ID");
        int docID=scanner.nextInt();
        System.out.println("are you sure to delete?");
        String choose=scanner.next();
        if (choose.equals("Y")|| choose.equals("y")){
            try {
                DocumentRepository userRepo=new DocumentRepository();
                userRepo.delete(new DocumentRequirments ().setID(docID));

                userRepo.commit();
                userRepo.close();
            }
            catch (Exception e){
                System.out.println ("fail to save!!!"+e.getMessage ());
            }

        }else return;

    }

}
