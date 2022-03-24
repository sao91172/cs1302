
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
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import javafx.scene.text.Text;
public class Quiz {



    //Submit button that takes user to the next question
    Button submit = new Button("Submit");

    //Returns to the home screen
    Button quizExit = new Button("Return to Main Menu");

    Label answerA = new Label();
    Label answerB = new Label();
    Label answerC = new Label();
    VBox quizLayout = new VBox();

    TextField textField = new TextField();
    TextArea textArea = new TextArea();

    ToggleGroup group = new ToggleGroup();

    RadioButton buttonOne = new RadioButton();
    RadioButton buttonTwo = new RadioButton();
    RadioButton buttonThree = new RadioButton();

    Label questions = new Label();
    public Quiz () {
           Stage quizStage = new Stage();

        QuestionCollection countryList = new QuestionCollection();

        generateRandomList();

        quizStage.initModality(Modality.APPLICATION_MODAL);
        quizStage.setTitle("Quiz");

        submit.setOnAction(e -> nextQuestion());
        quizExit.setOnAction(e -> quizStage.close());

        questions.setText(generateQuestion());
        questions.setAlignment(Pos.CENTER);

        answerA.setAlignment(Pos.CENTER_LEFT);
        answerB.setAlignment(Pos.CENTER_LEFT);
        answerC.setAlignment(Pos.CENTER_LEFT);
        quizLayout.setStyle("-fx-background-color: PAPAYAWHIP");

        quizLayout.getChildren().addAll(questions,answerA,answerB,answerC,submit,quizExit);
        Scene quizScene = new Scene(quizLayout,700,600);

        quizStage.setScene(quizScene);
        quizStage.showAndWait();


    }//Quiz

    //6 questions = 6x the quiz should randomize the questions
    ArrayList<Integer> randomList = new ArrayList<Integer>(6);
    public void generateRandomList() {
        //keeps track of how many times we've gone through randomList
        int iterator = 0;
        while(iterator < 6) {
            //generates a random index value within the range of 0 - countryList.getSize()
            int randomIndex = ThreadLocalRandom.current().
                nextInt(QuestionCollection.locations.size());
            if(!randomList.contains(randomIndex)) {
                randomList.add(index,randomIndex);
                iterator++;
            }//if
        }//while
    }//generateRandomList

    public String generateQuestion() {
        selection = QuestionCollection.locations.get(randomList.get(index)).getContinent();
        return "Which continent is " + QuestionCollection.locations
            .get(randomList.get(index)).getCountry() + " located in?";
    }//generateQuestion

    int correctGuesses;

    String selection;

    public void processRadioButtonAction(ActionEvent event) {
        if(buttonOne.isSelected()) {
            if(selection.equalsIgnoreCase(answerA.getText())) {
                System.out.println("That is correct!");
                correctGuesses++;
            }//if
            else {
                System.out.println("Incorrect! The answer is " + selection + " !");
            }//else

            //disables the button
            buttonOne.setDisable(true);
            buttonOne.setManaged(false);

            buttonTwo.setDisable(true);
            buttonTwo.setManaged(false);

            buttonThree.setDisable(true);
            buttonThree.setManaged(false);

            nextQuestion();
        }//if-1
        else if(buttonTwo.isSelected()) {
            if(selection.equalsIgnoreCase(answerB.getText())) {
                System.out.println("That is correct!");
                correctGuesses++;
            }//if
            else {
                System.out.println("Incorrect! The answer is " + selection + " !");
            }//else

            buttonOne.setDisable(true);
            buttonOne.setManaged(false);

            buttonTwo.setDisable(true);
            buttonTwo.setManaged(false);

            buttonThree.setDisable(true);
            buttonThree.setManaged(false);

            nextQuestion();
        }//elseif-2
        else if (buttonThree.isSelected()) {
            if(selection.equalsIgnoreCase(answerC.getText())) {
                System.out.println("That is correct!");
                correctGuesses++;
            }//if
            else {
                System.out.println("Incorrect! The answer is " + selection + " !");
            }//else

            buttonOne.setDisable(true);
            buttonOne.setManaged(false);

            buttonTwo.setDisable(true);
            buttonTwo.setManaged(false);

            buttonThree.setDisable(true);
            buttonThree.setManaged(false);

            nextQuestion();
        }//elseif-3
    }//processRadioButtonAction

    int index;
    int totalQuestions = 6;
    int result;

    public void nextQuestion() {
        if(index >= totalQuestions) {
            results();
        }//if
        else {
            Question.makeAnswers();
            //textField.setText("Question "+(index+1));
			questions.setText(generateQuestion());
			answerA.setText(Question.correctAnswers.get(Question.orderOfAnswers.get(0)));
			answerB.setText(Question.correctAnswers.get(Question.orderOfAnswers.get(1)));
			answerC.setText(Question.correctAnswers.get(Question.orderOfAnswers.get(2)));
        }//else

    }//nextQuestion

    public void results() {
        buttonOne.setDisable(true);
        buttonOne.setVisible(false);
        buttonOne.setManaged(false);

        buttonTwo.setDisable(true);
        buttonTwo.setVisible(false);
        buttonTwo.setManaged(false);

        buttonThree.setDisable(true);
        buttonThree.setVisible(false);
        buttonThree.setManaged(false);

        submit.setDisable(true);
        submit.setVisible(false);
        submit.setManaged(false);

        result = (int)((correctGuesses/(double)totalQuestions)*100);
    }//Results
}//Quiz
