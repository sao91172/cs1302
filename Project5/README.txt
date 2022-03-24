PROGRAMMING PROJECT 5: GEOGRAPHY QUIZ
Creator: Sarah Orji
Date: August 3, 2021

INTRODUCTION:
This project contains a simple quiz game with a Graphical User Interface (GUI). The program
will test the player's knowledge of countries and continents on which they are located.

REQUIREMENTS:
This program requires an up-to-date installation of Java. A UNIX terminal or an internal
development environment is also highly recommended.

It also requires the installation of Maven and the proper configurations to the pom.xml file.

CONFIGURATION:
The program contents are stored in the following package: edu.uga.cs1302.quiz.

The follwing confugurations must be applied to the bash profile:

PATH=/usr/local/alt-java/bin:$PATH:$HOME/.local/bin:$HOME/bin
export PATH
JAVA_HOME=/usr/local/alt-java
export JAVA_HOME

CLASSPATH=$CLASSPATH:/home/myid/sao91172/cs1302/Project5/target/classes/:commons-csv-1.8.jar
export CLASSPATH

To compile the Java files, execute the following Maven command in the Project5 directory:
	$ mvn compile
Next start up the application with the following command in the Project5 directory:
	$ java -Dprism.order=sw edu.uga.cs1302.quiz.GeograhyQuiz
