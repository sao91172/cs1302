package edu.uga.cs1302.txtbuff;

/**
 * This class contains the customizable exceptions
 * useful for the EditableTextLine class
 *
 * @author Sarah Orji
 */
public class TextLineOutOfBoundsException extends Exception {

    /**
     * Constructs a {@codeTextLineIndexOutOfBoundsException} object with
     * no detailed object.
     *
     * It simply calls the default constructor of its superclass.
     */
    public TextLineOutOfBoundsException() {
        super();
    } // default constructor

    /**
     * Constructs a {@code TextLineOutOfBoundsException} object with
     * the specified message given as the argument.
     *
     * This constructor should call the one-parameter constrcutor
     * of its superclass passing {@code errMsg} as the argument
     *
     * @param errMsg
     */
    public TextLineIndexOutOfBoundsException (String errMsg) {
        super (errMsg);
    } // constructor

    /**
     * Constructs a new {@code TextLineOutOfBoundsException} object
     * with an argument indicating the illegal index.
     *
     * It should call the one-parameter constructor of its passing
     * the follwing string as the argument.
     *
     * @param index
     */
    public TextLineIndexOutOfBoundsException (int index) {

        System.out.println("TextLine index out of range: " + index);

    } // TextLineIndexOutOfBounds

} // TextLineOutOfBoundsException
