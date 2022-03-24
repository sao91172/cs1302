package edu.uga.cs1302.quiz;

import javafx.application.Application;
import javafx.application.Platform;
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
import edu.uga.cs1302.quiz.*;

public class GeograhyQuiz extends Application {

    private Stage primaryStage;

    @Override
    public void start (Stage primaryStage) throws Exception {

        primaryStage.setTitle("Geography Quiz");

        //Creates 4 buttons
        Button startQuiz = new Button("Start Quiz");
        Button pastResults = new Button("View Past Results");
        Button help = new Button("Help");
        Button exit = new Button("Exit");

        startQuiz.setOnAction(e -> {
            Quiz quiz1 = new Quiz();
         });
        pastResults.setOnAction(e -> {
            PastResult.display();
        });
        help.setOnAction(e -> {
            Help.display();
        });

        //terminates program and closes window
        exit.setOnAction(e -> {
            Platform.exit();
            primaryStage.close();
        });

        VBox layout = new VBox();

        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(30);
        layout.setStyle("-fx-background-color: LIGHTCYAN");

        Label description = new Label("How well do you know your Geography? "
             + "Take this quiz to find out! "
             + "There are 6 questons on various countries around the world"
             + " and 3 possible contients "
             + "that the countries reside. Select the correct continent to earn a point! "
             + "At the end of the quiz, your score will be displayed.");

        description.setFont(new Font("Verdana",18));

          //creates label to wrap text and align it
          description.setWrapText(true);
          description.setTextAlignment(TextAlignment.JUSTIFY);
          description.setMaxWidth(550);
          layout.getChildren().addAll(description,startQuiz,pastResults,help,exit);

        this.primaryStage = primaryStage;

        Scene scene = new Scene(layout, 600, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }// start

    public static void main (String [] args) {
        //call method that goes into Application class and sets up program
        //as an javafx application then calls the start method
        launch(args);
    } //main
} //GeograhyQuiz
