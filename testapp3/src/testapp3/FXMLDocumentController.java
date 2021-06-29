/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.*;
/**
 *
 * @author thayalanpraveen
 */
public class FXMLDocumentController implements Initializable {
   
    
    @FXML
    private void Praveen(ActionEvent event) {
        
        Stage newWindow = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Praveen.fxml"));
        
        Parent root2 = null;
        try {
            root2 = fxmlLoader.load();
            Scene scene = new Scene(root2, 500, 500);
        
            newWindow.setScene(scene);
            newWindow.initModality(Modality.APPLICATION_MODAL);
            newWindow.show();
           
           
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
    @FXML
    public void Hamdaan (ActionEvent event) {
        Stage newWindow = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Hamdaan.fxml"));

        Parent root1 = null;
        try {
            root1 = fxmlLoader.load();
            Scene scene = new Scene(root1, 600, 400);

            newWindow.setScene(scene);
            newWindow.setResizable(false);
            newWindow.setTitle("BLAST-OFF!");
            newWindow.initModality(Modality.APPLICATION_MODAL);
            newWindow.show();



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
