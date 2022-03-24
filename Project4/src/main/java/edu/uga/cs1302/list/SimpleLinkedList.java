// Greatly simplified, but similar to the LinkedList class in OpenJDK.

package edu.uga.cs1302.list;

import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.Iterator;
import java.io.Serializable;



/**
 * This class provides a simple generic list implmented as a doubly linked list.
 * It is similar to the LinkedList class included in the java.util package.
 *
 * The elements on the list are ordered, and the first element of the list
 * is at position 0 and the last element is at position list.size() - 1.
 */
public class SimpleLinkedList<E>
    implements SimpleList<E>, Iterable<E>, Serializable
{
    private Node<E> first;        // first node of the list
    private Node<E> last;         // last node of the list
    private int     count;	  // number of list elements
    private int     modCount;     // the total number of modifications
    			          // (add and remove calls)

    /**
     * Creates an empty SimpleLinkedList.
     */
    public SimpleLinkedList()
    {
	first = null;
	last = null;
	count = 0;
	modCount = 0;
    }

    /**
     * Checks if this SimpleLinkedList is empty.
     * @return true if and only if the list is empty
     */
    public boolean isEmpty()
    {
	return count == 0;
    }

    /**
     * Returns the number of elements in this SimpleLinkedList.
     * @return the number of elements in this list
     */
    public int size()
    {
	return count;
    }

    /**
     * Adds an element at the end of this list.
     * @param e the element to be added to the end of this list
     * @return true
     */
    public boolean add( E e )
    {
	Node<E> node = new Node<E>( e, last, null );

	if( last == null )  // list is empty
	    first = node;
	else
	    last.next = node;
	last = node;
	count++;
	modCount++;     // increase modification count; element added
	return true;
    }

    /**
     * Adds an element {@code e} at a specified {@code index} position in the list.
     * @throws IndexOutOfBoundsException if the supplied {@code index} is out of bounds
     * i.e., if {@code index} "&lt;" 0
     * or {@code index} "&gt;" {@code size()}. If {@code index} is equal to
     * {@code size()}, the new element is added at the end of the list (it's appended).
     * @return true if e is added
     *
     * @param index - positon of the list element to return
     * @param e - an element
     */
    public boolean add( int index, E e )
    {
        if(index < 0 || index > size()) { //exception
            throw new IndexOutOfBoundsException();
        }//if
        else if (index == 0) { //for beginning of the list
            // tells node to point to first in place of first
            Node <E> node = new Node <E> (e,null,first);
            first = node; // the new first is the node that was created and placed
            count++; // count for the size of the list
            modCount++; // # of modifications to the list
            return true;
        }//else if
        else if (index == size()) { // for the end of the list
            return add(e); //returns the appended element to the end of the list
        }//else if
        else { //for in between the list
            Node <E> originalNode = getNodeAt(index); // node for specified index
            Node <E> previousNode = getNodeAt(index -1); // previous node so that a new node is made
           //node points to originalNode to shift it to the right while previousNode points to node
            Node <E> node = new Node <E> (e,previousNode,originalNode);
            previousNode.next = node; //inserts node after previousNode
            node.next = originalNode; //inserts orignalNode after node
            count++;
            modCount++;
            return true;
        } //else
    }

    /**
     * Returns the element of the list at the indicated position.
     * @param index the position of the list element to return
     * @return the element at position index
     * @throws IndexOutOfBoundsException if the index is "&lt;"0 or "&gt;"= size()
     */
    public E get( int index )
    {
	validateIndex( index, count-1 ); // must be an index of an existing element
	Node<E> node = getNodeAt( index );
	return node.elem;
    }

    /**
     * Removes and returns an element at a specified index position in the list.
     * @throws IndexOutOfBoundsException if the supplied {@code index} is out of bounds,
     * i.e, if {@code index} "&lt;"0 || {@code index} "&gt;"= {@code size()}
     *
     * @param index - position of the list element to return
     */
    public E remove( int index )
    {
        if(index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }//if
        else if(index == 0) {
            E e = first.elem; //intialized to the first element
            //makes a new first meaning so previous first node will be removed
            first = first.next;
            count--; //decreases bc element is removed
            modCount++;
        } //elseif
        else if(index == size()) {
            E e = last.elem; //gets the data of the last element before it's removed
            //intializes the previous node to the last one
            Node <E> nodePrevious = getNodeAt(index-1);
            //previous node points to null as indicating that element has been removed
            nodePrevious.next = null;
            last = nodePrevious; // previous node is now the new last
            count--;
            modCount++;
        }//else if
        else {
            Node <E> node1 = getNodeAt(index-1); //made node1 a given list
            Node <E> node2 = node1.next; //sets node1 to the next link
            Node <E> node3 = node2.next;//sets node2 to the next link
            node1.next = node3; // sets new link for node1 indicates node2 has been removed
            E e = node2.elem; //gets data of node2 and where the index specified
            count--;
            modCount++;
        } //else

	return null;  // you need to modify this return statement
    }

    /**
     * Returns the index of an element {@code e} or -1 if it is not on the list.
     *
     * @param e - element
     */
    public int indexOf( E e )
    {
        Node <E> loop = first;//starts to iterates through list
        E eCurrent = null;//element
        int currentIndex = 0; //current position
        while(true) {
            loop = loop.next;//itetrates through the list as long as it is
            if (loop == null) { //if e isn't found
                return -1;
            }//if
            eCurrent = loop.elem;//setting a new element to find e
            if(eCurrent == e) { //if e is found
                return currentIndex;//returns the position in which e is found
            }//if
            currentIndex++;
        }//while
    }

    /**
     * Returns an Iterator of the list elements, starting at the beginning of this list.
     * @return the created Iterator
     */
    public Iterator<E> iterator()
    {
        return new SimpleLinkedListIterator( 0 );
    }

    /**
     * Returns a ListIterator of the list elements, starting at the given position in this list.
     * @param index the position of the first element on the list to be returned from the iterator
     * @return the created ListIterator
     * throws IndexOutOfBoundsException if the index is "&lt;" 0 or "&gt;"= the size of the list
     */
    public ListIterator<E> listIterator( int index )
    {
	validateIndex( index, count ); // must be possible to insert after the last element
        return new SimpleLinkedListIterator( index );
    }

    // The methods and inner classes below are private, and are intended for internal use only.

    // Return the node at a given index.
    // The argument, index, must be verified to be a legal index into this list.
    private Node<E> getNodeAt( int index )
    {
	Node<E> curr = first;
	for( int i = 0; i < index; i++ )
	    curr = curr.next;
	return curr;
    }

    // Verify that a given index is within bounds 0 through end.
    // The second argument, end, should be either count-1, if the given index must
    // be a valid index of an existing element, or count, if an insert is to be at
    // the end of a list, or an iterator starting at the right end of the list.
    private void validateIndex( int index, int end )
    {
	if( index < 0 || index > end )
	    throw new IndexOutOfBoundsException( "Illegal list index: " + index );
    }

    // This is a private inner class implementing a doubly-linked list node.
    // It makes sense for this class to be private, as it is only useful internally to
    // the SimpleLinnkedList class.
    // Because this class is private, so it is accessible only to the host class SimpleLinkedList,
    // therefore, there is no need to define the variables as private.
    private static class Node<E> {
        E       elem;
        Node<E> next;
        Node<E> prev;

        Node( E elem, Node<E> prev, Node<E> next ) {
            this.elem = elem;
            this.next = next;
            this.prev = prev;
        }
    }

    /**
     * This class provides an iterator for the SimpleLinkedList.
     * Some methods have not been implemented intentaionlly;  you
     * are not expected to implement them.
     */
    private class SimpleLinkedListIterator
	implements ListIterator<E>
    {
	private Node<E> currNode;
	private Node<E> previouslyReturned;
	private int     currPos; // index of the element to be returned next
        private int     expectedModCount; // the count of modifications at the time of this iteractor creation

	// Creates a new iterator starting at position index.
	// javadoc comment needed
	public SimpleLinkedListIterator( int index )
	{
	    validateIndex( index, count ); // verify the staring index;  may be equal to count
	    expectedModCount = modCount;
	    previouslyReturned = null;
	    if( count == 0 )
		currNode = null;
	    else
		currNode = getNodeAt( index );
	    currPos = index;
	}

	// Returns true if this list iterator has more elements when traversing the list forward.
	// javadoc comment needed
	public boolean hasNext()
	{
	    return currPos < count;
	}

	// Returns true if this list iterator has more elements when traversing the list in the reverse direction.
	// javadoc comment needed
	public boolean hasPrevious()
	{
	    return currPos > 0;
	}

	// Returns the next element on the list.
	// May throw NoSuchElementException if the next element does not exist.
	public E next()
	{
	    checkForComodification();
	    if( currPos >= count || currNode == null )
		throw new NoSuchElementException();
	    previouslyReturned = currNode;
	    currPos++;
	    currNode = currNode.next;
	    return previouslyReturned.elem;
	}

	// Returns the index of the element that would be returned by a call to next.
	// javadoc comment needed
	public int nextIndex()
	{
	    return currPos;
	}

	// Returns the previous element in the list.
	// javadoc comment needed
	public E previous()
	{
	    checkForComodification();
	    if( currPos <= 0 )
		throw new NoSuchElementException();
	    currPos--;
	    if( currNode == null ) {
		currNode = last;
		previouslyReturned = last;
		return previouslyReturned.elem;
	    }
	    else {
		currNode = currNode.prev;
		previouslyReturned = currNode;
		return previouslyReturned.elem;
	    }
	}

	// Returns the index of the element that would be returned by a call to previous.
	// javadoc comment needed
	public int previousIndex()
	{
	    return currPos - 1;
	}

	// The following are optional operations which are not supported in the
	// SimpleLinkedList implementation.

	// Adds a new element
	// not implemented here
	public void add(Object e)
	{
	    throw new UnsupportedOperationException( "add called while iterating is not available" );
	}

	// Removes from the list the last element that was returned by next or previous (optional operation).
	// not implemented here
	public void remove()
	{
	    throw new UnsupportedOperationException( "remove called while iterating is not available" );
	}

	// Replaces the last element returned by next or previous with the specified element (optional operation).
	// not implemented here
	public void set(Object e)
	{
	    throw new UnsupportedOperationException( "set called while iterating is not available" );
	}

	// check if there was a concurrent modification of the list contents.
	// if yes, throw a ConcurrentModificationException exception
	private final void checkForComodification()
	{
	    if( expectedModCount != SimpleLinkedList.this.modCount )
		throw new ConcurrentModificationException( "list modified while iterator is in progress" );
	}
    }
}
