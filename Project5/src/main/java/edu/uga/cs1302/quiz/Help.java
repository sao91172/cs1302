
package edu.uga.cs1302.quiz;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Help {



    //creates a new window
    public static void display () {
            Stage helpStage = new Stage();
        //Blocks events to other windows
        helpStage.initModality(Modality.APPLICATION_MODAL);

        helpStage.setTitle("Help");

        //Close button that returns to the home screen
        Button closeButton = new Button ("Return to Main Menu");
        closeButton.setOnAction(e -> helpStage.close());

        VBox newLayout = new VBox();
        newLayout.setAlignment(Pos.CENTER);
        newLayout.setSpacing(40);
        newLayout.setStyle("-fx-background-color: SALMON");

        Label about = new Label("Click \"Start Quiz\" to begin the quiz. "
           + "Remeber there are 6 random questions on countries around the world "
           + "with 3 possible continents being the answer. One of the answers is correct. "
           + "Select the correct answer to earn a point. Once the quiz is finished, your score will"
           + " be displayed at the end. "
           + "Click \"View Past Results\" to see a log of past scores. "
           + "Click \"Exit\" to close terminate the program.");

        about.setFont(new Font("Helvetica",18));
        about.setWrapText(true);
        about.setTextAlignment(TextAlignment.JUSTIFY);
        about.setMaxWidth(560);
        newLayout.getChildren().addAll(about,closeButton);

        Scene newScene = new Scene(newLayout,600,500);
        helpStage.setScene(newScene);

        //displays stage and waits for it to be closed
        // before returning to the caller
        helpStage.showAndWait();
    }//display
}//Help
