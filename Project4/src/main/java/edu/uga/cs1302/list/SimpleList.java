package edu.uga.cs1302.list;

import java.util.ListIterator;



/**
 * This class provides a simple generic list interface, similar
 * to Java's List interface, but much simpler.
 *
 * The first element of the list is at position 0 and the
 * last element is at position list.size() - 1.
 */
public interface SimpleList<E> {

    /**
     * Checks if this SimpleList is empty.
     * @return true if and only if the list is empty.
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements in this SimpleList
     * @return the number of elements in this list.
     */
    public int size();

    /**
     * Returns the element of the list at the indicated position.
     * @param index the position of the list element to return.
     * @return the element at position index.
     * throws IndexOutOfBoundsException if the index is "&lt;" 0 or "&gt;"= the size of the list.
     */
    public E get( int index );

    /**
     * Adds an element at the end of the list.
     * @param e the element to be added to the list.
     * @return true
     */
    public boolean add( E e );

    /**
     * Adds an element to the list at the specified position.
     * @param index the position where the element should be added.
     * @param e the element to be added to the list.
     * @return true
     * throws IndexOutOfBoundsException if the index out of range, i.e.
     * index "&lt;" 0 or index "&gt;"= the size().
     */
    public boolean add( int index, E e );

    /**
     * Removes an element from the list at the specified position.
     * @param index the position where the element should be removed.
     * @return the removed element
     * throws IndexOutOfBoundsException if the index out of range, i.e.
     * index "&lt;"0 or index "&gt;"= the size().
     */
    public E remove( int index );

    /**
     * Returns the index of the first occurrence of a given element on the list equal
     * or -1 if the given element is not on the list.  If the argument element is null,
     * the method returns the index of the first null elment on the list, or -1 if the list
     * has no null elements.
     * @param e the element to be located on the list.
     * @return the index of the first occurrence of a given element on the list equal
     * or -1 if the given element is not on the list.
     */
    public int indexOf( E e );

    /**
     * Returns a ListIterator of the list elements, starting at the given position in this list.
     * @param index the position of the first element on the list to be returned from the iterator.
     * @return the created ListIterator
     * throws IndexOutOfBoundsException if the index is "&lt;" 0 or "&gt;"n= the size of the list.
     */
    public ListIterator<E> listIterator( int index );

}
