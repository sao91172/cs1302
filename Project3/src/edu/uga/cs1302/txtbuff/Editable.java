package edu.uga.cs1302.txtbuff;

/**
 * Contains methods to manipulate the TextLine.
 */

public interface Editable {
    /**
     * Appends the given string {@code fragment} at the end of a  {@code TextLine}
     *
     * @param fragment - the substring of line
     */
    public void append (String fragment); //abstract method

    /**
     * Inserts the given string {@code fragment} at the specified {@code index} position
     * of a {@code TextLine}. It is legal to insert at the end of a {@code TextLine}
     * ({@code index} value given as {@code length()}. It is equivalent to appending
     * to a {@code TextLine}.
     *
     * @throws TextLineIndexOutOfBoundsException
     * if the supplied {@code index} is out of bounds of a
     * TextLine (0 to {@code length}.
     *
     * @param index - the position of the  given string
     * @param fragment - substring of line
     */
    //abstract method that throws exception
    public void insert (int index, String fragment) throws TextLineIndexOutOfBoundsException;

    /**
     * Replaces the characters between {@code start} (inclusive) and {@code end} (exclusive,
     * i.e characters up to index {@code end-1} are to be replaced) in this {@code TextLine} with
     * characters in the specified {@code fragment}.
     *
     * @throws TextLineIndexOutOfBoundsException
     * if the supplied {@code start} or {@code end} index
     * is out of bounds of this {@code TextLine} (0 to {@code length()}), or if {@code start}
     * greater than  {@code end}
     *
     * @param start - start of the string
     * @param end - end of the string
     * @param fragment - substring
     */
    //abstract method that throws exception
    public void replace (int start, int end, String fragment)
        throws TextLineIndexOutOfBoundsException;
} // Editable
