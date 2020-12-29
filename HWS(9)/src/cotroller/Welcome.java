package cotroller;


import com.jfoenix.controls.*;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.entity.ClientInfo;
import model.repository.ClientRepo;
import model.service.ClientServ;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Welcome {

    @FXML
    private JFXTextField originCardTxt;

    @FXML
    private JFXTextField destinationCardTxt;

    @FXML
    private JFXTextField amountTxt;

    @FXML
    private JFXTextField originCardDTxt;

    @FXML
    private JFXTextField destinationCardDTxt;

    @FXML
    private JFXTextField transactionCodeDTxt;

    @FXML
    private JFXTextField originCardTExt;

    @FXML
    private JFXTextField transactionCodeETxt;

    @FXML
    private JFXTextField destinationCardTExt;

    @FXML
    private JFXTextField replaceAmountTxt;

    @FXML
    private JFXTextField CVV2Txt;

    @FXML
    private JFXPasswordField PInCardTxt;


    @FXML
    private JFXButton transfer;

    @FXML
    private JFXButton editBtn;

    @FXML
    private JFXButton deleteBtn;


    @FXML
    private JFXButton goToSystemBtn;


    @FXML
    private JFXButton deleteTransferBtn;

    @FXML
    private JFXButton editTransferBtn;




    @FXML
    void goToSystemBtn(ActionEvent event) throws IOException {
        Stage primarystage=new Stage();
        AnchorPane root= FXMLLoader.load(getClass().getClassLoader().getResource("view/CashCardSystem.fxml"));
        primarystage.setTitle("");
        Scene scene=new Scene(root,600,555);
        primarystage.setScene(scene);
        primarystage.show();

    }

    @FXML
    void deleteTransferBtn(ActionEvent event) throws IOException {
        Stage primarystage=new Stage();
        AnchorPane root= FXMLLoader.load(getClass().getClassLoader().getResource("view/DeleteTransfer.fxml"));
        primarystage.setTitle("");
        Scene scene=new Scene(root,530,363);
        primarystage.setScene(scene);
        primarystage.show();


    }

    @FXML
    void editTransferBtn(ActionEvent event) throws IOException {
        Stage primarystage=new Stage();
        AnchorPane root= FXMLLoader.load(getClass().getClassLoader().getResource("view/EditTransfer.fxml"));
        primarystage.setTitle("");
        Scene scene=new Scene(root,543,422);
        primarystage.setScene(scene);
        primarystage.show();


    }
    @FXML
    void deleteBtn(ActionEvent event) throws Exception {
        if (originCardDTxt.getText().length()!=12 || destinationCardDTxt.getText().length()!=12 ||
        transactionCodeDTxt.getText().length()!=2)
        {
            allert();
        }else {


            ClientRepo clientRepo=new ClientRepo();
            if(clientRepo.check(transactionCodeDTxt.getText(),originCardDTxt.getText(),destinationCardDTxt.getText())==true){
                ClientServ.getInstance().delete(transactionCodeDTxt.getText(),destinationCardDTxt.getText()
                ,originCardDTxt.getText());
                Stage stage = (Stage) deleteBtn.getScene().getWindow();
                stage.close();
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("");
                alert.setHeaderText(null);
                alert.setContentText("Transaction With Code "+transactionCodeDTxt.getText()+" Has Been Deleted !");
                alert.showAndWait();
            }else {allert();}
        }
    }

    @FXML
    void editBtn(ActionEvent event) throws Exception {
        if (originCardTExt.getText().length()!=12 || destinationCardTExt.getText().length()!=12
        || transactionCodeETxt.getText().length()!=2 || replaceAmountTxt.getText().compareTo("")==0)
        { allert(); }
        else {
            ClientRepo clientRepo=new ClientRepo();
            if(clientRepo.check(transactionCodeETxt.getText(),originCardTExt.getText(),destinationCardTExt.getText())==true)
            {
                ClientServ.getInstance().update(transactionCodeETxt.getText(),replaceAmountTxt.getText());
                Stage stage = (Stage) editBtn.getScene().getWindow();
                stage.close();
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("");
                alert.setHeaderText(null);
                alert.setContentText("Transaction With Code "+transactionCodeETxt.getText()+" Has Been Updated !");
                alert.showAndWait();
            }else {allert();}

        }

    }

    @FXML
    void transferBtn(ActionEvent event) throws Exception {
        if (originCardTxt.getText().length()!=12 || PInCardTxt.getText().length()<6
                || CVV2Txt.getText().length()!=3 || destinationCardTxt.getText().length()!=12 ||
                amountTxt.getText().compareTo("")==0)
        {
            allert();

        }else {ClientInfo clientInfo=new ClientInfo();
            clientInfo.setAmount(amountTxt.getText());
            clientInfo.setDestinationCard(destinationCardTxt.getText());
            clientInfo.setOriginCard(originCardTxt.getText());

            String ct=ClientServ.getInstance().transfer(clientInfo);
            Stage stage = (Stage) transfer.getScene().getWindow();
            stage.close();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("!!! TRANSACTION CODE !!!");
            alert.setHeaderText("Your Transaction Code Is "+ct);
            alert.setContentText(null);
            alert.setHeight(140);
            alert.showAndWait();


        }

    }
    public void allert(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("!!! WARNING !!!");
        alert.setHeaderText(null);
        alert.setContentText("something is missing or invalid !");
        alert.showAndWait();
    }

}
