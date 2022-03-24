package edu.uga.cs1302.vehicles;

public class Airplane extends Vehicle implements Flyable {

    private int numberOfEngines; //private bc encapuslation
    private int maxAltitude;
    private int maxRange;

    public Airplane() {
        super ();
        numberOfEngines = 0;
    } // default constructor

    public Airplane(String name, String manufacturer, int modelYear,
    int maxPassengers, int topSpeed, int maxAltitude, int maxRange, int numberOfEngines) {
        super(name, manufacturer, modelYear, maxPassengers, topSpeed);
        this.maxAltitude = maxAltitude;
        this.maxRange = maxRange;
        this.numberOfEngines = numberOfEngines;
    } // Airplane constructor

    public int getMaxAltitude() { // retrieves maxAltitude
        return maxAltitude;
    } // getMaxAltitude

    public void setMaxAltitude(int maxAltitude) { // mutator method for maxAltitude
        this.maxAltitude = maxAltitude;
    } //setMaxAltitude

    public int getMaxRange() { // retrieves maxRange
        return maxRange;
    } //getMaxRange

    public void setMaxRange(int maxRange) { // mutator method for maxRange
        this.maxRange = maxRange;
    } //setMaxRange

    public int getNumberOfEngines() { // retrieves numberOfEngines
        return numberOfEngines;
    } //getNumberOfEngines

    public void setNumberOfEngines(int numberOfEngines) { // mutator method for numberOfEngines
        this.numberOfEngines = numberOfEngines;
    } //setNumberOfEngines

    public String toString() {
        return "Type: Airplane \n" +
            "Name: " + getName() + "\n" +
            "Manufacturer :" + getManufacturer() + "\n" +
            "Manuacture year: " + getModelYear() + "\n" +
            "Number Of Engines: " + getNumberOfEngines() + "\n" +
            "Max altitude: " + getMaxAltitude() + " ft\n" +
            "Max Range: " + getMaxRange() + " mi\n" +
            "Max Passengers: " + getMaxPassengers() + "\n" +
            "Top Speed: " + getTopSpeed() + " mph";
    }// toString

} // Airplane
