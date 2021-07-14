/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp3;

import java.awt.Button;
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
import javafx.application.Platform;
import javafx.event.Event;
import javafx.scene.Node;
import javafx.scene.paint.Paint;
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
    private void Nehan(ActionEvent event) {

        Stage newWindow = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Nehan.fxml"));

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
    public void handlePlayGameButton() {
        System.out.println("F");
        Stage newWindow = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Generate.fxml"));
        Parent root2 = null;
        try {
            root2 = fxmlLoader.load();
            Scene scene = new Scene(root2, 500, 600);
            newWindow.setTitle("Generate");
            newWindow.setScene(scene);
            newWindow.initModality(Modality.APPLICATION_MODAL);
            newWindow.setResizable(false);
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
    @FXML
    public void loginButtonAction(ActionEvent event) throws Exception{
        System.out.println("Login button is pressed");
        Stage newWindow = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UI_02.fxml"));
        Parent view2 = null;
        try {
            view2 = fxmlLoader.load();
            Scene scene = new Scene(view2, 600, 400);

            newWindow.setScene(scene);
            newWindow.setResizable(false);
            newWindow.initModality(Modality.APPLICATION_MODAL);
            newWindow.show();



        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    @FXML
    //public Button playButton, instructionsButton, leadersButton, quitButton, levelButton;
    //@FXML
    //public void handleMouseEnterForButton(Event e){
        //Button button = (Button)e.getSource();
        //button.setTextFill(Paint.valueOf("crimson"));
        //button.setScaleX(1.2);
        //button.setScaleY(1.2);
    //}

    //@FXML
    //public void handleMouseExitForButton(Event e){
        //Button button = (Button)e.getSource();
        //button.setTextFill(Paint.valueOf("blue"));
        //button.setScaleX(1.0);
        //button.setScaleY(1.0);
    //}

    //@FXML
    //public void handleQuitButton(){
        //Platform.exit();
    //}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
