 PROGRAMMING PROJECT 3: EditableTextLine
 Creator: Sarah Orji
 Date: July 16, 2021

INTRODUCTION:
The Vehicle Information System (VIS) is a program containing a database of vehicles.
An interactive menu is provided to explore the database.

REQUIREMENTS:
This program requires an up-to-date installation of Java. A UNIX terminal or an internal
development environment is also highly recommended.

CONFIGURATION:
The program contents are stored in the following package: edu.uga.cs1302.txtbuff.
The tester class is stroed in the following package: edu.uga.cs1302.test

To compile the Java files, execute the following UNIX commands in the Project3 directory in this order:
Exception class:
    $ javac -d bin src/edu/uga/cs1302/txtbuff/TextLineIndexOutOfBoundsException.java
Interfaces:
    $ javac -d bin -cp bin src/edu/uga/cs1302/txtbuff/Editable.java
Files:
    $ javac -d bin -cp bin src/edu/uga/cs1302/txtbuff/TextLine.java
    $ javac -d bin -cp bin src/edu/uga/cs1302/txtbuff/EditableTextLine.java
    $ javac -d bin -cp src/junit-4.13.2.jar:bin/edu/uga/cs1302/txtbuff/*.java src/edu/uga/cs1302/txtbuff/*.java src/edu/uga/cs1302/test/EditableTextLineTester.java
Next start up the application with the following command in the Project3 directory:
 $ java -cp ./bin:src/junit-4.13.2.jar:src/hamcrest-core-1.3.jar org.junit.runner.JUnitCore edu.uga.cs1302.test.EditableTextLineTester
