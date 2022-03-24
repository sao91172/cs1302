package edu.uga.cs1302.txtbuff;

/**
 * Represents a line of text of characters.
 * The first character is at position (index) 0 and
 * the last is at line length -1 (just as in a Java array).
 */
public class TextLine {

    /**
     * Specifies the default capacity of a {@code TextLine}
     * (set to 80).
     */
    public static final int DEFAULT_SIZE = 80;

    // protected so I can access these variables in different classes within the same package
    // originally I had the variables as private (when in doubt private) but that wouldn't
    // have worked because variables wouldn't have been accessbile to other classes
    // compared to the last project which had SUB-classes which
    // had accesibility to private variables
    protected char[] txtLine = new char[0];
    protected int length = 0;
    protected int capacity = 0;

    /**
     * Constructs an empty {@code TextLine}.
     * The line length should be set to 0, but
     * the capcity of the internal array should be set to {@code DEFAULT_SIZE}.
     */
    public TextLine() {
        length = 0;
        capacity = DEFAULT_SIZE;
        txtLine = new char[capacity]; //array of a line of text of characters
    } // default constructor

    /**
     * Constructs a {@code TextLine} object intitialized to contain the same characters
     * as in the argument {@code line}. The line length should be set to the length of
     * the arguments string, but the capacity of the internal array should be set to the
     * smallest multiple of {@code DEFAULT_SIZE}, sufficient to store the entire line.
     *
     * @param line - argument
     */
    public TextLine(String line) {
        length = line.length();
        while (capacity < length) {
            // adds 80 more cells to DEFAULT_SIZE when word is bigger than 80 characters
            capacity += DEFAULT_SIZE;
        } // while
        txtLine = new char[capacity];
        for (int i = 0; i < line.length(); i++) {
            txtLine[i] = line.charAt(i); //creating the String line char by char
        } // for
    } // constructor

    /**
     * Returns the length of this {@code TextLine}
     * @return length
     */
    public int length() {
        return length;
    } // int length

    /**
     * Returns the current capacity of this {@code TextLine}
     * @return capacity
     */

    public int capacity () {
        return capacity;
    } // capacity

    /**
     * Returns the index position of the first occurence of the
     * {@code fragment} substring in this {@code TextLine}, or
     * @return -1, if the {@code fragment} is not found.
     *
     * @param fragment - substring of line
     */
    public int indexOf (String fragment) {
        //fragment is a substring
        int placement = -1; // position (where char is at)
        boolean found = false; //fragment isn't found

        //first to check to see if array is long enough to have fragment
        //as a substring
        if(length < fragment.length()) {
            return placement;
        } //if
        //for-loop to pass through the array(position) to find occurence of substring
        for (int i = 0; i < txtLine.length; i++) {
            //charAt- locates char at that index
            if (txtLine[i] == fragment.charAt(0)) { // finds the fragment @ index 0
                found = true;
                // going through every char in fragment and txtLine bc we don't have a variable that
                // accounts for both fragment's length and txtLine's length so the loop has to
                // check to see if fragment is inside txtLine @ that moment
                for (int j = 0; j < fragment.length() && i + j < txtLine.length;j++) {
                    if (txtLine[i+j] != fragment.charAt(j)) { //for when fragment isn't found
                        found = false;
                    } // if
                } //for
                if (found) { // confirms the index is found @ index "i"
                    placement = i;
                } //if
            } //if
        } //for
        return placement;
    } // indexOf

    /**
     * Returns the index position of the first occurence of the
     * {@code fragment} substring in this {@code TextLine}, or
     * @return -1, if the {@code fragment} is not found.
     * @throws TextLineIndexOutOfBoundsException
     * if the supplied {@code fromIndex} is out of this TextLine (0 to {@code length()-1}
     *
     * @param fragment - substring of line
     * @param fromIndex - out of TextLine
     *
     */
    public int indexOf (String fragment, int fromIndex) throws TextLineIndexOutOfBoundsException {
        int placement = -1;
        if (fromIndex < 0 || fromIndex > txtLine.length-1) { //checks to see if excedded range
            throw new TextLineIndexOutOfBoundsException (fromIndex);
        } //if

        //reading the txtLine from the index we chose
        for (int i = fromIndex; i < txtLine.length; i++) {
            if (txtLine[i] == fragment.charAt(0)) {
                boolean found = true;
                for (int j = 0; j < fragment.length() && i + j < txtLine.length;i++) {
                    if (txtLine[i+j] != fragment.charAt(j)) {
                        found = false;
                    } //if
                } //for
                if (found) {
                    placement = i;
                } //if
            }//if
        } //for
        return placement;

    } // indexOf-execption

    /**
     * Returns {@code true} only if {@code TextLine} has the same charcters as the argument
     * {@code obj}
     *
     * @param obj - argument
     */
    public boolean equals (Object obj) {
        if (obj instanceof TextLine) { //checks to see if instanceof class
            for(int i = 0; i < txtLine.length;i++) { //compares every character
                if(txtLine[i] != ((TextLine)obj).txtLine[i]) {
                    return false;
                } //if
            }//for
            return true;
        } //if
        else
        return false; // class isnt equal
    } // equals

    /**
     * Returns the contents of this {@code TextLine} represented as a Java {@code String}
     */
    public String toString() { //toString object from Object class
        String stringVersion = ""; //empty String representation
        for(int i = 0; i < length; i++){ // fills the string char by char
        stringVersion += txtLine[i];
        }
        return stringVersion; //result
    } // toString
} // TextLine
