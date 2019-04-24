package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class controllerKontaktPerson implements Initializable {
    @FXML
    private TextField txtNavnKontakt;

    @FXML
    private TextField txtTelefonKontakt;

    @FXML
    private TextField txtEpostKontakt;

    @FXML
    private TextField txtNettsideKontakt;

    @FXML
    private TextField txtFirmaKontakt;

    @FXML
    private TextField txtOpplysningerKontakt;

    @FXML
    private TableView<Kontaktperson> kontaktView;

    @FXML
    private TableColumn<Kontaktperson, String> navnKontaktKolonne;

    @FXML
    private TableColumn<Kontaktperson, String> telefonKontaktKolonne;

    @FXML
    private TableColumn<Kontaktperson, String> epostKontaktKolonne;

    @FXML
    private TableColumn<Kontaktperson, String> nettsideKontaktKolonne;

    @FXML
    private TableColumn<Kontaktperson, String> firmaKontaktKolonne;

    @FXML
    private TableColumn<Kontaktperson, String> opplysningerKontaktKolonne;

    ObservableList<Kontaktperson> kontaktpersonObservableList= FXCollections.observableArrayList();

    public void btnRegistrerKontaktPerson(ActionEvent actionEvent) {

        Kontaktperson kontaktperson=new Kontaktperson(txtNavnKontakt.getText(),txtTelefonKontakt.getText(),txtEpostKontakt.getText(),txtNettsideKontakt.getText(),txtFirmaKontakt.getText(),txtOpplysningerKontakt.getText());
        kontaktpersonObservableList.add(new Kontaktperson(txtNavnKontakt.getText(),txtTelefonKontakt.getText(),txtEpostKontakt.getText(),txtNettsideKontakt.getText(),txtFirmaKontakt.getText(),txtOpplysningerKontakt.getText()));

    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        navnKontaktKolonne.setCellValueFactory(new PropertyValueFactory<Kontaktperson,String>("personNavn"));
        telefonKontaktKolonne.setCellValueFactory(new PropertyValueFactory<Kontaktperson,String>("personNummer"));
        epostKontaktKolonne.setCellValueFactory(new PropertyValueFactory<Kontaktperson,String>("personEmail"));
        nettsideKontaktKolonne.setCellValueFactory(new PropertyValueFactory<Kontaktperson,String>("personSide"));
        firmaKontaktKolonne.setCellValueFactory(new PropertyValueFactory<Kontaktperson,String>("personFirma"));
        opplysningerKontaktKolonne.setCellValueFactory(new PropertyValueFactory<Kontaktperson,String>("personTekst"));
        kontaktView.setItems(kontaktpersonObservableList);


    }


}
