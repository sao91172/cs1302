PROGRAMMING PROJECT 2: VEHICLE INFORMATION SYSTEM
Creator: Sarah Orji
Date: July 2, 2021

INTRODUCTION:
The Vehicle Information System (VIS) is a program containing a database of vehicles.
An interactive menu is provided to explore the database.

REQUIREMENTS:
This program requires an up-to-date installation of Java. A UNIX terminal or an internal
development environment is also highly recommended.

CONFIGURATION:
The program contents are stored in the following package: edu.uga.cs1302.vehicles.
To compile the Java files, execute the following UNIX commands in the Project2 directory in this order:
Interfaces:
	$ javac -d bin src/edu/uga/cs1302/vehicles/Transporter.java
    $ javac -d bin src/edu/uga/cs1302/vehicles/Flyable.java
    $ javac -d bin src/edu/uga/cs1302/vehicles/Floatable.java
Files:
    $ javac -d bin -cp bin src/edu/uga/cs1302/vehicles/Vehicle.java
    $ javac -d bin -cp bin src/edu/uga/cs1302/vehicles/Automobile.java
    $ javac -d bin -cp bin src/edu/uga/cs1302/vehicles/Airplane.java
    $ javac -d bin -cp bin src/edu/uga/cs1302/vehicles/Ship.java
    $ javac -d bin -cp bin src/edu/uga/cs1302/vehicles/MagicSchoolBus.java
    $ javac -d bin -cp bin src/edu/uga/cs1302/vehicles/FliteBoard.java
    $ javac -d bin -cp bin src/edu/uga/cs1302/vehicles/Driver.java
Next start up the application with the following command in the Project2 directory:
	$ java -cp bin  edu.uga.cs1302.vehicles.Driver
Follow the on-screen prompt for further instructions.
