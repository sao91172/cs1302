package edu.uga.cs1302.quiz;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Question {

    public static ArrayList<String> correctAnswers = new ArrayList<String>(2);

    public static ArrayList<String> continents = new ArrayList<String>();

    //created to have variations within the answer selections
    //Ex: Africa shouldn't always be placed in the first radio button
    public static ArrayList<Integer> orderOfAnswers = new ArrayList<Integer>(3);

    Quiz quiz = new Quiz();

        //makes the answer selection
        public static void makeAnswers() {
            if(correctAnswers != null) {
                correctAnswers.clear();
            }//if

            continents.add("Asia");
            continents.add("Africa");
            continents.add("Antartica");
            continents.add("Europe");
            continents.add("North America");
            continents.add("South America");
            continents.add("Oceania");


            int iterator2 = 0; //to keep track of duplicates (continents)
            while(iterator2 < 2) {
                int randomIndex = ThreadLocalRandom.current().nextInt(7);
                if(!correctAnswers.contains(continents.get(randomIndex))) {
                    correctAnswers.add(continents.get(randomIndex));
                    iterator2++;
                }//if
            }//while

            //creates 3 variations of the answer placements
            int order = 0;
            if (orderOfAnswers != null) {
                orderOfAnswers.clear();
            }//if
            while (order < 3) {
                int rand = ThreadLocalRandom.current().nextInt(3);
                orderOfAnswers.add(rand);
                order++;
            }//while
        }//makeAnswers
}//Question
