PROGRAMMING PROJECT 4: SIMPLE LINKED LIST AND MAVEN
Creator: Sarah Orji
Date: July 23, 2021

INTRODUCTION:
This project contains a partial implementation of the SimpleLinkedList<E> generic class
and also a JUnit-based testclass both created using the Maven build.

REQUIREMENTS:
This program requires an up-to-date installation of Java. A UNIX terminal or an internal
development environment is also highly recommended.

It also requires the installation of Maven and the proper configurations to the pom.xml file.

CONFIGURATION:
The program contents are stored in the following package: edu.uga.cs1302.list.
However the JUnit test is in the different subdirectory of src/test/java while the SimpleLinkedList.java file
is in the src/main/java subdirectory
To compile the Java files, execute the following Maven command in the Project4 directory:
	$ mvn compile
Next start up the application with the following command in the Project4 directory:
	$ mvn test
To generate the online documentation use the Maven command:
    $ mvn site
