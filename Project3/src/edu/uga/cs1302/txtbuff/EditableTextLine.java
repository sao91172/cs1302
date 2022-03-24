package edu.uga.cs1302.txtbuff;

/**
 * Implements the methods provided by Editable and retains the attributes
 * and actions of its superclass, TextLine.
 */
public class EditableTextLine extends TextLine implements Editable {
    /**
     * Constructs an empty {@code EditableTextLine}. You should rely on the parent constructor.
     */
    public EditableTextLine() {
        super();
    } // default

    /**
     * Constructs an {@code EditableTextLine} object initialized to contain the same characters
     * as in the argument string {@code line}. You should rely on the parent constructor
     *
     * @param line - argument string
     */
    public EditableTextLine(String line) {
        super (line);
    } // constructor

    /**
     * Appends the given string {@code fragment} at the end of {@code TextLine}
     *
     * @param fragment - substring appended to the end of line
     */
    public void append (String fragment) {
        length = length + fragment.length();
        while (capacity < length) {
            capacity = capacity + DEFAULT_SIZE;
        }//while
        char[] f = new char[capacity]; // array to hold fragment with the max amount of capacity
        int fragLength = length - fragment.length();
        for(int i = 0; i < fragLength; i++) {//creats char array-fragment added
            f[i] = txtLine[i];
        } //for
        for (int i = fragLength, j = 0; i < length; i++, j++) { //array:txtLine + fragment
            f[i] = fragment.charAt(j);
        }//for
        txtLine = f;
    } // append

    /**
     * Inserts the given string {@code fragment} at the specificed {@code index} position of a
     * {@code TextLine}. It is legal to insert at the end of a {@code TextLine} ({@code index}
     * value given as {@code lenght()}. It is equivalent to appending to a {@code TextLine}.
     * @throws TextLineIndexOutOfBoundsException if the supplied {@code index}
     * is out of bounds of a {@code TextLine} (0 to {@code length()}.
     *
     * @param index - position of fragment
     * @param fragment - substring of line
     */
    public void insert(int index, String fragment) throws TextLineIndexOutOfBoundsException {
        int place = 0; //a placement holder for inserting fragment
        if(index < 0 || index > length) { //exception
            throw new TextLineIndexOutOfBoundsException(index);
        } //if
        if (index > length) { //sets up place
            place = index - length;
        }// if
        //length is adjusted to add the spot where txtLine opens
        length = length + fragment.length() + place;
        while (capacity < length) {
            capacity = capacity + DEFAULT_SIZE;// when exceeded
        } //while
            char [] f = new char[capacity];
            for (int i = 0; i < index; i++) { //creates txtLine until index specified
                f[i] = txtLine[i];
            } //for
            //creates fragment to where it was inserted
            for (int i = index, j = 0; i < index + fragment.length(); i++, j++) {
                f[i] = fragment.charAt(j);
            } //for
            if (index < length) { //index is less than length
                //creats the rest of string after it reads the fragment inserted
                for (int i = index + fragment.length(), j = index; i < length; i++, j++) {
                    f[i] = txtLine[j];
                } //for
            } //if
            txtLine = f; //new txtLine
    } // exception

    /**
     * Replaces the characters between {@code start} (inclusive) and {@code end} (exclusive,
     * i.e characters up to index {@code end-1} are to be replaced) in this {@code TextLine} with
     * characters in the specified {@code fragment}.
     *
     * @throws TextLineIndexOutOfBoundsException
     * if the supplied {@code start} or {@code end} index
     * is out of bounds of this {@code TextLine} (0 to {@code length()}), or if {@code start}
     * greather than  {@code end}
     *
     * @param start - the start of the string to be replaced
     * @param end - the end of the string to be replaced
     * @param fragment - substring of line
     */

    public void replace (int start, int end, String fragment)
        throws TextLineIndexOutOfBoundsException {
        if(start < 0 || start > length()-1 || start > end) {
            throw new TextLineIndexOutOfBoundsException(start);
        } //if
        if(end < 0 || end > length()-1) {
            throw new TextLineIndexOutOfBoundsException(end);
        } //if
        while(capacity < length) {
            capacity = capacity + DEFAULT_SIZE;
        } //while
        char f [] = new char[capacity];
        for (int i = 0; i < start; i++) {
            f[i] = txtLine[i];
        }//for
        //creates the txtLine array of the fragment being replaced
        for (int i = start,j = 0; i < start + fragment.length(); i++, j++) {
            f[i] = fragment.charAt(j);
        } //for
        //creates txtLine array until the end of the txtLine + fragment replaced
        for (int i = start + fragment.length(), j = end; i < length; i++, j++) {
            f[i] = txtLine[j];
        }//for
        txtLine = f;
    }//replace


} // EditableTextLine
