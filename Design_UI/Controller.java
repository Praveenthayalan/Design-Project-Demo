package sample;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.paint.Color;
import java.awt.*;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.scene.control.TextField;

public class Controller {
    public void loginButtonAction(ActionEvent event) throws Exception{
        System.out.println("Login button is pressed");
        Stage newStage = new Stage();
        Parent view2 = FXMLLoader.load(getClass().getResource("UI_02.fxml"));
        newStage.setScene(new Scene(view2, 500, 550));
        newStage.show();

        Stage previousStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        previousStage.close();
    }
}
