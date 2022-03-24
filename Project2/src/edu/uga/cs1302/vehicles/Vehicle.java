package edu.uga.cs1302.vehicles;

abstract class Vehicle implements Transporter {

    private String name; // private bc encapuslation
    private String manufacturer;
    private int modelYear;
    static int count; //static to be class-wide; counts instances

    private int  maxPassengers;
    private int topSpeed;

    public Vehicle() {
    } // default constructor

    public Vehicle (String name, String manufacturer, int modelYear, int maxPassengers,
    int topSpeed) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.modelYear = modelYear;
        this.maxPassengers = maxPassengers;
        this.topSpeed = topSpeed;
        count++;
    } // Vehicle constructor

    public String getName() { // retrieves name
        return name;
    } // getName

    public void setName(String name) { //mutator method for name
        this.name = name;
    } // setName

    public String getManufacturer() { // retrieves manufacturer
        return manufacturer;
    } //getManufacturer

    public void setManufacturer( String manufacturer) { //mutator method for manufacturer
        this.manufacturer = manufacturer;
    } // setManufacturer

    public int getModelYear() { // retrieves year of manufacture
        return modelYear;
    } // getModelYear

    public void setModelYear(int modelYear) { // mutator method for modelYear
        this.modelYear = modelYear;
    } // setModelYear

    public int getMaxPassengers() { // retrieves value of max Passengers
        return maxPassengers;
    } //getMaxPassengers

    public void setMaxPassengers(int maxPassengers) { // mutator method for maxPassengers
        this.maxPassengers = maxPassengers;
    } //setMaxPassengers

    public int getTopSpeed() { // retrieves value of topSpeed
        return topSpeed;
    } //getTopSpeed

    public void setTopSpeed(int topSpeed) { // mutator method for topSpeed
        this.topSpeed = topSpeed;
    } //setTopSpeed

    public static int getCount() { // retrieves value of count
        return count;
    } // getCount

    public static void setCount(int count) { // mutator for count
        count = count;
    } // setCount

    public String typeToString() {
		if (this instanceof Automobile)
			return "Automobile";
		else if (this instanceof Airplane)
			return "Airplane";
		else if (this instanceof Ship)
			return "Ship";
		else if (this instanceof MagicSchoolBus)
			return "MagicSchoolBus";
		else if (this instanceof FliteBoard)
			return "FliteBoard";
		else
			return "";
	}
} // Vehicle
