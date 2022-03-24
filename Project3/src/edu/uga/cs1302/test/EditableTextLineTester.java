package edu.uga.cs1302.test;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import edu.uga.cs1302.txtbuff.*;


public class EditableTextLineTester {
    @Before
    public void SetUp() {
        EditableTextLine line = new EditableTextLine();
    }//setUp
    @After
    public void tearDown() {
        EditableTextLine line = null;
    } //tearDown

//Test Case 1: testing the length and capacity
        @Test
            public void lengthCapacityTest() {
            TextLine line = new TextLine ("HEISREMA2468");
            assertEquals(line.length(),12); //line length should be 12
            assertEquals(line.capacity(),80); // capacity should be 80
        }//lengthCapacity

//Test Case 2: testing the indexOf method (LEGAL TEST)
        @Test
            public void indexOfTest() {
            EditableTextLine line = new EditableTextLine ("HEISREMA2468");
            EditableTextLine line2 = new EditableTextLine("SAO91172");
            assertEquals(line.indexOf("R"),4); // index should be 4
            assertEquals(line.indexOf("4"),9); // index should be 9

            assertEquals(line2.indexOf("O"),2); // index should be 2
            assertEquals(line2.indexOf("1"),5); // index should be 5
        } //indexOf

//Test Case 3: testing the equals method
        @Test
            public void equalsTest () {
            EditableTextLine line = new EditableTextLine ("HEISREMA2468");
            assertEquals(line.equals("NICKI"),false); //should be false
        } //equalsTest

//Test Case 4: testing the append method
        @Test
            public void appendTest () {
            EditableTextLine line = new EditableTextLine ("HEISREMA2468");
            line.append("12");
            EditableTextLine line2 = new EditableTextLine ("HEISREMA246812");
            assertEquals(line,line2);
        } //appendTest
//Test Case 5: testing the append method on a larger size string greater than the default size
                @Test
                public void largeAppendTest() {
                EditableTextLine line =
                    new EditableTextLine ("Hey, hey, you, you I don't like your girlfriend. ");
                line.append("I think you need a new one.");
                EditableTextLine line2 = new
  EditableTextLine ("Hey, hey, you, you I don't like your girlfriend. I think you need a new one.");
                assertEquals(line,line2);
            } //largeAppendTest

//Test Case 6: testing the insert method
        @Test
            public void insertTest () {
            EditableTextLine line = new EditableTextLine ("HEISREMA2468");
            line.insert(2,"biggity"); //line should be HEbiggityISREMA2468
            EditableTextLine line2 = new EditableTextLine ("HEbiggityISREMA2468");
            assertEquals(line,line2);
        } //insertTest

//Test Case 7: testing the insert method with illegal values
    @Test(expected = java.lang.IndexOutOfBoundsException.class)
    public void illegalInsertTest () {
        EditableTextLine line = new EditableTextLine ("HEISREMA2468");
        line.insert(-1,"&");
    } //illegalInsertTest

//Test Case 8: testing the replace method
        @Test
        public void replaceTest() {
            EditableTextLine line = new EditableTextLine ("HEISREMA2468");
            line.replace(0,1,"%");
            EditableTextLine line2 = new EditableTextLine("%EISREMA2468");
            assertEquals(line,line2);
        }
//Test Case 9: testing the replace method with illegal values
    @Test(expected = java.lang.IndexOutOfBoundsException.class)
    public void illegalReplaceTest () {
        EditableTextLine line = new EditableTextLine ("HEISREMA2468");
        line.replace(-2, -4,"SWV");  // index refers to a non-existing position
    } //illegalReplaceTest
} //EditableTextLineTester
