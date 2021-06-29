package sample;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Paint;
import javafx.stage.Modality;
import javafx.scene.Parent;

import java.io.IOException;

public class Controller {

    @FXML
    public Button playButton, instructionsButton, leadersButton, quitButton, levelButton;


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
    public void handleMouseEnterForButton(Event e){
        Button button = (Button)e.getSource();
        button.setTextFill(Paint.valueOf("crimson"));
        button.setScaleX(1.2);
        button.setScaleY(1.2);
    }

    @FXML
    public void handleMouseExitForButton(Event e){
        Button button = (Button)e.getSource();
        button.setTextFill(Paint.valueOf("blue"));
        button.setScaleX(1.0);
        button.setScaleY(1.0);
    }

    @FXML
    public void handleQuitButton(){
        Platform.exit();
    }
}
