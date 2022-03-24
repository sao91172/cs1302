
package edu.uga.cs1302.quiz;


public class Country {
    private String country;
    private String continent;

    public Country (String country, String continent) {
        this.country = country;
        this.continent = continent;
    }//default
    public String getCountry() {
        return country;
    }//getCountry

    public void setCountry(String country) {
        this.country = country;;
    }//setCountry

    public String getContinent() {
        return continent;
    }//getContinent

    public void setContinent(String continent) {
        this.continent = continent;
    }//setContinent
    public String toString() {
        return this.country + "," + this.continent;
    }//toString
}//Country
