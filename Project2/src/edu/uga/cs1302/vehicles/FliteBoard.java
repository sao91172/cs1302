package edu.uga.cs1302.vehicles;

public class FliteBoard extends Vehicle implements Flyable, Floatable {

    private int waterPressure; // how much water it takes to power the fliteboard
    private int maxAltitude; // all instance variables are private bc encapuslation
    private int maxRange;
    private int tonnage;

    public FliteBoard () {
        super();
        waterPressure = 0;
    } // default constructor

    public FliteBoard(String name, String manufacturer, int modelYear, int maxPassengers,
    int topSpeed, int maxAltitude, int maxRange, int tonnage, int waterPressure) {
        super(name, manufacturer, modelYear, maxPassengers, topSpeed);
        this.maxAltitude = maxAltitude;
        this.maxRange = maxRange;
        this.tonnage = tonnage;
        this.waterPressure = waterPressure;
    } // MagicSchoolBus constructor

    public int getMaxAltitude() { // accessor method for maxAltitude
        return maxAltitude;
    } // getMaxAltitude

    public void setMaxAltitude(int maxAltitude) { // mutator method for maxAltitude
        this.maxAltitude = maxAltitude;
    } // setMaxAltitude

    public int getMaxRange() { // accessor method for maxRange
        return maxRange;
    } // getMaxRange

    public void setMaxRange(int maxRange) { // mutator method for maxRange
        this.maxRange = maxRange;
    } // setMaxRange

    public int getTonnage() { // accessor method for tonnage
        return tonnage;
    } // getTonnage

    public void setTonnage(int tonnage) { // mutator method for tonnage
        this.tonnage = tonnage;
    } // setTonnage

    public int getWaterPressure() { // accessor method for waterPressure
        return waterPressure;
    } // getWaterPressure

    public void setWaterPressure(int waterPressure) { // mutator method for waterPressure
        this.waterPressure = waterPressure;
    } // setWaterPressure

    public String toString() {
        return "Type: FliteBoard \n" +
            "Name: " + getName() + "\n" +
            "Manufacturer: " + getManufacturer() + "\n" +
            "Manufacture year: " + getModelYear() + "\n" +
            "Max altitude: " + getMaxAltitude() + " ft\n" +
            "Max Range: " + getMaxRange() + " mi\n" +
            "Tonnage: " + getTonnage() + "\n" +
            "Max Passengers: " + getMaxPassengers() + "\n" +
            "Water Pressure: " + getWaterPressure() + " torr\n" +
            "Top Speed: " + getTopSpeed() + " mph";
    } // toString
} // MagicSchoolBus
