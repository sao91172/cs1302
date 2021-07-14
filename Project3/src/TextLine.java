package edu.uga.cs1302.txtbuff;

/**
 * Represents a line of text of characters.
 * The first character is at position (index) 0 and
 * the last is at line length -1 (just as in a Java array).
 */
public class Textline {

    /**
     * Specifies the default capacity of a {@code TextLine}
     * (set to 80).
     */
    public static final int DEFAULT_SIZE = 80;

    private char[] charArray = new char[0];
    private int length; // private bc encapulsation
    private int capacity;

    /**
     * Constructs an empty {@code TextLine}.
     * The line length should be set to 0, but
     * the capcity of the internal array should be set to {@code DEFAULT_SIZE}.
     */
    public TextLine() {
        length = 0;
        capacity = DEFAULT_SIZE;
        charArray = new char[capacity];
    } // default constructor

    /**
     * Constructs a {@code TextLine} object intitialized to contain the same characters
     * as in the argument {@code line}. The line length should be set to the length of
     * the arguments string, but the capacity of the internal array should be set to the
     * smallest multiple of {@code DEFAULT_SIZE}, sufficient to store the entire line.
     */
    public TextLine(String line) {
        length = line.length();
        while (capacity < length) {
            // adds 80 more cells to DEFAULT_SIZE when word is bigger than 80 characters
            capacity += DEFAULT_SIZE;
            for (i = 0, i < line.length(); i++) {
                charArray[i] = line.charAt(i); //creating the String line char by char
            } //for
        } // while
    } // constructor

    /**
     * Returns the length of this {@code TextLine}
     */
    public int length() {
        returns this.length;
    } // int length

    /**
     * Returns the current capacity of this {@code TextLine}
     */

    public int capacity () {
        returns this.capacity;
    } // capacity

    /**
     * Returns the index position of the first occurence of the
     * {@code fragment} substring in this {@code TextLine}, or
     * returns -1, if the {@code fragment} is not found.
     *
     * @param fragment
     */
    public int indexOf (String fragment) {
        //fragment is a substring
        int placement = -1; // position (where char is at)
        boolean found = false; //fragment isn't found

        //for-loop to pass through the array(position) to find occurence of substring
        for (int i = 0; i <charArray.length; i++) {
            //charAt- locates char at that index
            if (charArray.charAt(i) == fragment.charAt(i) {
                found = true;
                return placement;
            } //if
        } //for
        return placement;
    } // indexOf

    /**
     * Returns the index position of the first occurence of the
     * {@code fragment} substring in this {@code TextLine}, or
     * returns -1, if the {@code fragment} is not found.
     * @throws TextLineIndexOutOfBoundsException
     * if the supplied {@code fromIndex} is out of this TextLine (0 to {@code length()-1}
     *
     * @param fragment
     * @param fromIndex
     *
     */
    public int indexOf (String fragment, int fromIndex) throws TextLineOutOfBoundsException {
        int placement = -1; // boolean to mkae sure the character has been replaced
        if(lengt
        else if (fromIndex) {
            throw new TextLineOutOfBoundsException("");
        }// else if
        return placement;

    } // indexOf-execption

    /**
     * Returns {@code true} only if {@code TextLine} has the same charcters as the argument
     * {@code obj}
     *
     * @param obj
     */
    public boolean equals (Object obj) {
        if (obj instanceof TextLine) {
            return true;
        } //if
        return false;
    } // equals

    /**
     * Returns the contents of this {@code TextLine} represented as a Java {@code String}
     */
    public String toString() {
        return line;
    } // toString
} // TextLine
