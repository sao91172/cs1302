package edu.uga.cs1302.vehicles;

public class MagicSchoolBus extends Vehicle implements Flyable, Floatable {

    private int magicPower; // how much magic it takes to power the bus
    private int maxAltitude; // all instance variables are private bc encapuslation
    private int maxRange;
    private int tonnage;

    public MagicSchoolBus () {
        super();
        magicPower = 0;
    } // default constructor

    public MagicSchoolBus(String name, String manufacturer, int modelYear, int maxPassengers,
    int topSpeed, int maxAltitude, int maxRange, int tonnage, int magicPower) {
        super(name, manufacturer, modelYear, maxPassengers, topSpeed);
        this.maxAltitude = maxAltitude;
        this.maxRange = maxRange;
        this.tonnage = tonnage;
        this.magicPower = magicPower;
    } // MagicSchoolBus constructor

    public int getMaxAltitude() { // retrieves maxAltitude
        return maxAltitude;
    } // getMaxAltitude

    public void setMaxAltitude(int maxAltitude) { // mutator method for maxAltitude
        this.maxAltitude = maxAltitude;
    } // setMaxAltitude

    public int getMaxRange() { // retrieves maxRange
        return maxRange;
    } // getMaxRange

    public void setMaxRange(int maxRange) { // mutator method for maxRange
        this.maxRange = maxRange;
    } // setMaxRange

    public int getTonnage() { // retrieves tonnage
        return tonnage;
    } // getTonnage

    public void setTonnage(int tonnage) { // mutator method for tonnage
        this.tonnage = tonnage;
    } // setTonnage

    public int getMagicPower() { // retrieves magicPower
        return magicPower;
    } // getMagicPower

    public void setMagicPower(int magicPower) { // mutator method for magicPower
        this.magicPower = magicPower;
    } // setMagic Power

    public String toString() {
        return "Type: MagicSchoolBus \n" +
            "Name: " + getName() + "\n" +
            "Manufacturer: " + getManufacturer() + "\n" +
            "Manufacture year: " + getModelYear() + "\n" +
            "Max altitude: " + getMaxAltitude() + " ft\n" +
            "Max Range: " + getMaxRange() + " mi\n" +
            "Tonnage: " + getTonnage() + "\n" +
            "Max Passengers: " + getMaxPassengers() + "\n" +
            "Magic Power: " + getMagicPower() + " mp\n" +
            "Top Speed: " + getTopSpeed() + " mph";
    } // toString
} // MagicSchoolBus
