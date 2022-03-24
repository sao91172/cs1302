package edu.uga.cs1302.txtbuff;

/**
 * This class contains the customizable exceptions
 * useful for the EditableTextLine class
 */
public class TextLineIndexOutOfBoundsException extends java.lang.IndexOutOfBoundsException {

    /**
     * Constructs a {@code TextLineIndexOutOfBoundsException} object with
     * no detailed object.
     *
     * It simply calls the default constructor of its superclass.
     */
    public TextLineIndexOutOfBoundsException() {
        super();
    } // default constructor

    /**
     * Constructs a {@code TextLineIndexOutOfBoundsException} object with
     * the specified message given as the argument.
     *
     * This constructor should call the one-parameter constrcutor
     * of its superclass passing {@code errMsg} as the argument
     *
     * @param errMsg - the constructed message
     */
    public TextLineIndexOutOfBoundsException (String errMsg) {
        super(errMsg); //calls on superclass constructor errMsg
    } // constructor

    /**
     * Constructs a new {@code TextLineIndexOutOfBoundsException} object
     * with an argument indicating the illegal index.
     *
     * It should call the one-parameter constructor of its passing
     * the follwing string as the argument.
     *
     * @param index - indicates illegal position
     */
    public TextLineIndexOutOfBoundsException (int index) {
        //calls on superclass and passes a message
        super("TextLine index out of range: " + index);

    } // TextLineIndexOutOfBounds

} // TextLineOutOfBoundsException
