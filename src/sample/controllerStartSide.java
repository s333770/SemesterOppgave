package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class controllerStartSide implements Initializable {

    @FXML
    private TextField txtLokale;

    @FXML
    private TextField txtType;

    @FXML
    private TextField txtAntall;

    /*Dette er de tre startknappene fra startsiden*/
    public void leggTilLokale(javafx.event.ActionEvent actionEvent) throws IOException { // Dette er registreringsknappen
        Parent parent= FXMLLoader.load(getClass().getResource("/sample/registrerLokale.fxml"));
        Scene scene = new Scene(parent,600,550);
        
        //Denne metoden brukes for å bytte scener:
        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    public void leggTilKontaktPerson(javafx.event.ActionEvent actionEvent) throws IOException{
        Parent parent= FXMLLoader.load(getClass().getResource("/sample/registrerLokale.fxml"));
        Scene scene = new Scene(parent);
        //Denne metoden brukes for å bytte scener:
        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }


    public void bestillBilletter(javafx.event.ActionEvent actionEvent) throws IOException { // Dette er registreringsknappen
        System.out.println("Hello world");
    }
    public void opprettArrangement(javafx.event.ActionEvent actionEvent) throws IOException { // Dette er registreringsknappen
        System.out.println("Hello world");
    }

    @Override // Dette brukes for å legge initaliseringen til i systemet
    public void initialize(URL location, ResourceBundle resources) {

    }

}
