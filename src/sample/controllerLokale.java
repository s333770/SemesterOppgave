package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class controllerLokale implements Initializable {
    @FXML
    private AnchorPane rootPane;

    @FXML
    private TextField txtLokale;

    @FXML
    private TextField txtType;

    @FXML
    private TextField txtAntall;

    @FXML
    private TableView<Lokale> lokaleView;
    @FXML
    TableColumn<Lokale, String> lokaleNavnKolonne;
    @FXML
    TableColumn<Lokale, String> lokaleTypeKolonne;
    @FXML
    TableColumn<Lokale, String> lokaleAntallKolonne;

    ObservableList<Lokale> lokaleObservableList= FXCollections.observableArrayList();



    @FXML
    void btnRegistrer(ActionEvent event) throws IOException {
        //Vi skriver både til ett lokale objekt og et observable arraylist
        Lokale lokale= new Lokale(txtLokale.getText(),txtType.getText(),txtAntall.getText());
        lokaleObservableList.add(new Lokale(txtLokale.getText(),txtType.getText(),txtAntall.getText()));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lokaleNavnKolonne.setCellValueFactory(new PropertyValueFactory<Lokale,String>("lokaleNavn"));
        lokaleTypeKolonne.setCellValueFactory(new PropertyValueFactory<Lokale,String>("typeLokale"));
        lokaleAntallKolonne.setCellValueFactory(new PropertyValueFactory<Lokale,String>("antallPlasser"));
        lokaleView.setItems(lokaleObservableList);

       //lokaleView.setItems(getLokaler());


    }
    /*
    public ObservableList<Lokale> getLokaler(){
        ObservableList<Lokale> lokaleObservableList= FXCollections.observableArrayList();
        lokaleObservableList.add(new Lokale("sfsf","sfsf","sffs"));
        return lokaleObservableList;

    }
    */

}