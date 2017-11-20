/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxwithgithub;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author ak
 */
public class FXMLDocumentController  {
    
    @FXML
    private Label lblHeadlineIMS;
    
    @FXML
    private TableView tableViewIMS;
    @FXML
    private TableColumn colDt;
    private TableColumn colEn;
    
    @FXML
    private TextField tfDt;
    private TextField tfEn;
    
    @FXML
    private Button btnSpeichern, btnKorrigieren, btnLoeschen;
    
    @FXML
    private void btnSpeichernAction(ActionEvent event) {
        System.out.println("Speichern geklickt.");
        //label.setText("Welcome Github. I came from Mac!");
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
    public void initialize() {
        // TODO
    }    
    
}
