package edu.uga.cs1302.list;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

// java.util.List is imported in SimpleLinkedList
// java.util.LinkedList is imported in SimpleLinkedList
// java.util.ListIterator is imported in SimpleLinkedList

public class SimpleLinkedListTest {
    @Before
    public void SetUp() {
        SimpleLinkedList list = new SimpleLinkedList();
    } //SetUP
    @After
    public void tearDown() {
        SimpleLinkedList list = null;
    } //TearDown

    // Test Case 1: Appending an element at the end of the list
    @Test
    public void addTestEnd() {
        SimpleLinkedList list = new SimpleLinkedList();
        list.add("Chocolate Chip Cookie Dough");
        list.add(1,"Vanilla");
        list.add(2,"Strawberry");
        list.add(3,"Mint");

        // list should contain these contents in respective indexes

        assertEquals("Chocolate Chip Cookie Dough", list.get(0));
        assertEquals("Vanilla", list.get(1));
        assertEquals("Strawberry", list.get(2));
        assertEquals("Mint", list.get(3));

    } //addTestEnd

    //Test Case 2: Appending an element at the beginning of a list
    @Test
    public void addTestBegin() {
        SimpleLinkedList list = new SimpleLinkedList();
        list.add("2");
        list.add("3");
        list.add("4");

        list.add(0,"1"); // adds a 1 at the beginning of the list

        assertEquals("2", list.get(1));
        assertEquals("3", list.get(2));
        assertEquals("4", list.get(3));

        assertEquals(4, list.size());
    } //addTestBegin

    // Test Case 3: Appending an element in between two indexes of a list
    @Test
    public void addTestBetween() {
        SimpleLinkedList list = new SimpleLinkedList();
        list.add("2");
        list.add("4");
        list.add("6");
        list.add("8");

        list.add(0,"1");
        list.add(2,"3");
        list.add(4,"5");
        list.add(6,"7");

        assertEquals("2", list.get(1));
        assertEquals("4", list.get(3));
        assertEquals("6", list.get(5));
        assertEquals("8", list.get(7));

        assertEquals(8,list.size());
    } //addTestBetween

    //Test Case 4: Appending an element with illegal values
    @Test(expected = java.lang.IndexOutOfBoundsException.class)
    public void illegalAddTest() {
        SimpleLinkedList list = new SimpleLinkedList();
        list.add(-7,"Coco"); //index refers to a non-existing position
    } //illegalAddTest

    //Test Case 5: Removing an element at the beginning of the list
    @Test
    public void removeTestBegin() {
        SimpleLinkedList list = new SimpleLinkedList();
        list.add("1");
        list.add("0");
        list.add("2");
        list.add("3");

        list.remove(0); //should remove 1

        assertEquals("0", list.get(0));
        assertEquals("2", list.get(1));
        assertEquals("3", list.get(2));

        assertEquals(3,list.size());

    } //removeTestBegin

    //Test Case 6: Removing an element in between two positions
    @Test
    public void removeTestBetween() {
        SimpleLinkedList list = new SimpleLinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        list.remove(2); //should remove C

        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
        assertEquals("D", list.get(2));

        assertEquals(3,list.size());

    }//removeTestBetween

    //Test Case 7: Removing an element at the end of a list
    @Test
    public void removeTestEnd() {
        SimpleLinkedList list = new SimpleLinkedList();
        list.add("X");
        list.add("Y");
        list.add("Z");
        list.add("&%*");

        list.remove(list.size()-1); //should remove &%*

        assertEquals("X", list.get(0));
        assertEquals("Y", list.get(1));
        assertEquals("Z", list.get(2));

        assertEquals(3,list.size());
    } //removeTestEnd

    //Test Case 8: Removing an element using illegal values
    @Test(expected = java.lang.IndexOutOfBoundsException.class)
    public void illegalRemoveTest() {
        SimpleLinkedList list = new SimpleLinkedList();
        list.add("A");
        list.remove(-3); //index refers to a non-existing position
    }//illegalRemoveTest

} //SimpleLinkedListTester
