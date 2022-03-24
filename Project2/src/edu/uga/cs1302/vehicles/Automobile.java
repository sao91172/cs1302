package edu.uga.cs1302.vehicles;

public class Automobile extends Vehicle {

    private int horsepower; //private bc variable is specifc to this class only

    public Automobile() {
        super ();
        horsepower = 0;
    } // default constructor

    public Automobile(String name, String manufacturer, int modelYear,
    int maxPassenger, int topSpeed, int horsepower) {
        super(name, manufacturer, modelYear, maxPassenger,topSpeed);
        this.horsepower = horsepower;
    } // Automobile constructor

    public int getHorsePower() { // retrieves value of horsepower
        return horsepower;
    } // getHorsePower

    public void setHorsePower(int horsepower) { // mutator method for horsepower
        this.horsepower = horsepower;
    } //setHorsePower

    public String toString() {
        return "Type: Automobile \n" +
        "Name: " + getName() + "\n" +
        "Manufacturer :" + getManufacturer() + "\n" +
        "Manuacture year: " + getModelYear() + "\n" +
        "Engine power: " + getHorsePower() + " hp\n" +
        "Max Passengers: " + getMaxPassengers() + "\n" +
        "Top Speed: " + getTopSpeed() + " mph";
    } //toString

} //Automobile
