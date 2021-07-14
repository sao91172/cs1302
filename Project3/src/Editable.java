package edu.uga.cs1302.txtbuff;

public interface Editable {
    /**
     * Appends the given string {@code fragment} at the end of a  {@code TextLine}
     */
    public void append (String fragment);

    /**
     * Inserts the given string {@code fragment} at the specified {@code index} position
     * of a {@TextLine}. It is legal to insert at the end of a {@code TextLine}
     * ({@code index} value given as {@code length()}. It is equivalent to appending
     * to a {@code TextLine}.
     * @throws TextLineOutOfBoundsException if the supplied {@code index} is out of bounds of a
     * TextLine (0 to {@code length}.
     *
     * @param index
     * @param fragment
     */
    public void insert (int index, String fragment) throws TextLineIndexOutOfBoundsException;

    /**
     * Replaces the characters between {@code start} (inclusive) and {@code end} (exclusive,
     * i.e characters up to index {@code end-1} are to be replaced) in this {@code TextLine} with
     * characters in the specified {@code fragment}.
     *
     * @throws TextLineOutOfBoundException if the supplied {@code start} or {@code end} index
     * is out of bounds of this {@code TextLine} (0 to {@code length()}), or ig {@code start}
     * > {@code end}
     *
     * @param start
     * @param end
     * @param fragment
     */
    public void replace (int start, int end, String fragment)
        throws TextLineIndexOutOfBoundsException;
} // Editable
