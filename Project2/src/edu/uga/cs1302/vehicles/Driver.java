package edu.uga.cs1302.vehicles;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // menu
        System.out.println("Press 1 to see how many vehicles are in the system.");
        System.out.println("Press 2 to see the name and the class of each vehicle.");
        System.out.println("Press 3 to see which vehicles can fly.");
        System.out.println("Press 4 to see which can float.");
        System.out.println("Press 5 to which float AND fly.");
        System.out.println("Press 6 to see a description of each vehicle.");
        System.out.println("Press h to see a brief help information for your system");
        System.out.println("Press q to terminate the program");


            Vehicle v [] = new Vehicle [15];
            // Automobiles
            v[0] = new Automobile("Mustang Shelby GT350R", "Ford", 2017, 2, 175, 526);
            v[1] = new Automobile("Rav 4", "Toyota", 2021, 4, 200, 500);
            v[2] = new Automobile("GLA SUV", "Mercedez-Benz", 2019, 4, 210, 550);

            // Airplanes
            v[3] = new Airplane("Boeing 787", "Boeing", 2014, 280, 587, 43000, 8500, 2);
            v[4] = new Airplane("Airbus A350", "Delta Airlines", 2015, 200, 689, 33000, 34789, 4);
            v[5] = new Airplane("Sweet Baby Jesus", "Spirit Airlines", 2020, 550, 899,
            100000, 2000000, 0);

            // Ship
            v[6] = new Ship("Queen Mary 2", "Chantiers de Atlantique", 2004, 2695, 35, 149215,
            "Carnival");
            v[7] = new Ship("Atlantis", "Disney", 2001, 3784, 40, 158215, "Milo Thatch");
            v[8] = new Ship("Odyssey", "Homer", 1614, 30, 40, 0,  "Odysseus");

            //MagicSchoolBus
            v[9] = new MagicSchoolBus("The Bus", "Ms.Frizzle", 1994, 15, 90, 333300, 450, 56, 83);
            v[10] = new MagicSchoolBus("The Busigator", "Arnold", 1997, 13, 80, 42000, 290, 77,67);
            v[11] = new MagicSchoolBus("Rocket", "Lizard", 1996, 8, 57, 1500, 230, 30, 230);

            //FliteBoard
            v[12] = new FliteBoard("SkaterBoi", "Avril Lavagne", 2009, 1, 39, 50, 40, 75, 150);
            v[13] = new FliteBoard("Ocean Flyer", "Penny Board", 2014, 1, 75, 50, 100,  200, 300);
            v[14] = new FliteBoard("Eath", "Wind & Fire", 1989, 1, 45, 125, 145, 2255, 230);



           boolean on = true; // as long as the user doesn't press q the program runs
           while (on == true) {
            String user = keyboard.nextLine();
            if (user.equals("1")) { // displays # of vehicles in the system
                System.out.println("There are " + Vehicle.getCount() + " vehicles in the system.");
            } // if

            else if (user.equals("2")) { // displays name and kind of each vehicle
                for(int i = 0; i < v.length; i++) {
                    System.out.println(v[i].getName() + " is a(n) " +
                    v[i].getClass().getSimpleName() + ".");
                } // for
            } // else-if-2

            else if (user.equals("3")) { // displays which vehicles can fly
                System.out.println("These vehicles can fly: ");
                System.out.printf("%-20s%s%n", "TYPE", "NAME"); // aligned columns
                for(int i = 0; i < v.length; i++) {
                    if (v[i] instanceof Flyable) {
                        System.out.printf("%-20s%s%n", v[i].typeToString(), v[i].getName());
                    } // if
                } // for
            }// else-if-3

            else if(user.equals("4")) { // displays which vehicles can float
                System.out.println("These vehicles can float: ");
                System.out.printf("%-20s%s%n", "TYPE", "NAME");
                for(int i = 0; i < v.length; i++) {
                    if(v[i] instanceof Floatable) {
                         System.out.printf("%-20s%s%n", v[i].typeToString(), v[i].getName());
                    } // if
                } // for
            } // else-if-4

            else if (user.equals("5")) { // displays which vehicles can float and fly
                System.out.println("These vehicles can float & fly: ");
                System.out.printf("%-20s%s%n", "TYPE", "NAME");
                for(int i = 0; i < v.length; i++) {
                    if(v[i] instanceof Flyable && v[i] instanceof Floatable) {
                         System.out.printf("%-20s%s%n", v[i].typeToString(), v[i].getName());
                    } // if
                } // for
            } // else-if-5

            else if (user.equals("6")) { // displays description of each vehicle
                for( int i = 0; i < v.length; i++) {
                    System.out.println(v[i].toString());
                    System.out.println();
                } // for
            } // else-if-6

            else if (user.equals("h")) { // displays help information
                System.out.println("Please enter a valid command from the list below.");
            } // else-if-h

            else if (user.equals("q")) { // termination of the progra,
                System.out.println("Terminating program...");
                  on = false;
            System.exit(0);
            } // else-if-q

            else {
            System.out.println("Improper command: Please re-enter a number (1-6)");
            System.out.print(" or the letters 'h' (for help) or 'q' to quit");
            } //else
           }// while

        } //main
} //Driver
