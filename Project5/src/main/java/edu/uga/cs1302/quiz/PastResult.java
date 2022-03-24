package edu.uga.cs1302.quiz;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import javafx.scene.layout.FlowPane;
//import javafx.scene.layout.StackPane;

public class PastResult {

    public static void display() {
        Stage pastStage = new Stage();
        pastStage.initModality(Modality.APPLICATION_MODAL);

        pastStage.setTitle("View Past Results");

        //Close button that returns to the home button
        Button pastExit = new Button ("Return to Main Menu");
        pastExit.setOnAction(e -> pastStage.close());

        FlowPane pastLayout = new FlowPane();
        pastLayout.setAlignment(Pos.CENTER);
        pastLayout.setHgap(40);
        pastLayout.setStyle("-fx-background-color: HONEYDEW");

        pastLayout.getChildren().addAll(pastExit);
        Scene pastScene = new Scene(pastLayout,700,600);
        pastStage.setScene(pastScene);
        pastStage.showAndWait();
    }//display



}//PastResult
