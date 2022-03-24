
package edu.uga.cs1302.quiz;

import java.lang.IndexOutOfBoundsException;
import java.util.ArrayList;

import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class QuestionCollection {

    public static ArrayList <Country> locations = new ArrayList<Country>();

    public QuestionCollection () {
        //try-catch method in case the file isn't found
        try {
            //Reads the CSV file
            Reader reader =
                new FileReader("/home/myid/sao91172/cs1302/Project5/country_continent.csv");
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(reader);
            for (CSVRecord record: records) {
                //parses the countries and puts them at index 0
                // and puts the Continents at index 1
                locations.add(new Country(record.get(0), record.get(1)));
            }//for
        }//try
        catch (IOException e) {
            System.out.println(e);
        }//catch
    }//nations

    public Country getCountry (int index) throws IndexOutOfBoundsException {
        //if the current index is less than 0 or bigger than the size
        if (index < 0 || index >= locations.size()) {
            throw new IndexOutOfBoundsException();
        }//if

        //returns the current index
        return locations.get(index);
    }//getCountry

    public int getSize() {
        return this.locations.size();
    }//getSize

    public void print() { //prints the format of the CSV Reader
        for (int i = 0; i < locations.size(); i++) {
            Country current = locations.get(i);
            System.out.println(current.getCountry() + "," + current.getContinent());
        }//for
    }//print
}//QuestionCollection
