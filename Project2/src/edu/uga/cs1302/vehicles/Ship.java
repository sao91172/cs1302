package edu.uga.cs1302.vehicles;

public class Ship extends Vehicle implements Floatable {

    private int tonnage; //private bc encapulastion
    private String shipOwner; //shipping line owner

    public Ship() {
        super ();
        tonnage = 0;
        shipOwner = " ";
    } //default constructor

    public Ship (String name, String manufacturer, int modelYear,
    int maxPassengers, int topSpeed, int tonnage, String shipOwner) {
        super(name, manufacturer, modelYear, maxPassengers, topSpeed);
        this.tonnage = tonnage;
        this.shipOwner = shipOwner;
    } // Ship constructor

    public int getTonnage() { // retrieves tonnage
        return tonnage;
    } // getTonnage

    public void setTonnage(int tonnage) { // mutator method for tonnage
        this.tonnage = tonnage;
    } // setTonnage

    public String getShipOwner() { // retrieves shipOwner
        return shipOwner;
    } // getShipOwner

    public void setShipOwner(String shipOwner) { // mutator method for shipOwmer
        this.shipOwner = shipOwner;
    } //setShipOwner

    public String toString() {
        return "Type: Ship \n" +
            "Name: " + getName() + "\n" +
            "Manufacturer :" + getManufacturer() + "\n" +
            "Manuacture year: " + getModelYear() + "\n" +
            "Tonnage: " + getTonnage() + "\n" +
            "Owner: " + getShipOwner() + "\n" +
            "Max Passengers: " + getMaxPassengers() + "\n" +
            "Top Speed: " + getTopSpeed() + " mph";
    } //toString

} // Ship
