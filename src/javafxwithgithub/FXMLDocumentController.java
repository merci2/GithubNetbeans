/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxwithgithub;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author ak
 */
public class FXMLDocumentController  {
    
    public Dao dao;
    
   
    
    @FXML
    private Label lblHeadlineIMS;
    
    @FXML
    private TableView<Datensatz> tableViewIMS;
    @FXML
    private TableColumn<Datensatz, String> colDt;
    @FXML
    private TableColumn<Datensatz, String> colEn;
    
    @FXML
    private TextField tfDt;
    @FXML
    private TextField tfEn;
    
    @FXML
    private Button btnSpeichern, btnKorrigieren, btnLoeschen;
    
    @FXML
    private void btnSpeichernAction(ActionEvent event) {
        System.out.println("Speichern geklickt.");
        //label.setText("Welcome Github. I came from Mac!");  
        dao.saveDatensatz(new Datensatz(tfDt.getText(), tfEn.getText()));
        tableViewIMS.setItems(FXCollections.observableArrayList(dao.findAll()));
    }
    
    @FXML
    private void btnKorrigierenAction(ActionEvent event) {
        System.out.println("Korrigieren geklickt.");
        //label.setText("Welcome Github. I came from Mac!");
    }
    
        @FXML
    private void btnLoeschenAction(ActionEvent event) {
        System.out.println("Löschen geklickt.");
        //label.setText("Welcome Github. I came from Mac!");
    }
    
     @FXML
    public void initialize() 
    {
        // TODO
        dao = new Dao();
        tableViewIMS.setItems(FXCollections.observableArrayList(dao.findAll()));//??
        colDt.setCellValueFactory(new PropertyValueFactory<>("vocD"));//String = wie in json = wie in Datensatz
        colEn.setCellValueFactory(new PropertyValueFactory<>("vocE"));
    }  
    
}
