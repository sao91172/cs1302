package edu.uga.cs1302.txtbuff;
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
     *
     */
    public EditableTextLine(String line) {
        super (line);
    } // constructor

    public void append (String fragment) {
        line.length += fragment.length;
    } // append

    public void insert(int index, String fragment) throws TextLineIndexOutOfBoundsException {
    } // exception

    public void replace (int start, int end, String fragment)
        throws TextLineIndexOutOfBoundsExceptions {
    }


} // EditableTextLine
