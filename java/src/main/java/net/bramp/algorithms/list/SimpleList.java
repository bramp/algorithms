package net.bramp.algorithms.list;

/**
 * Simple List interface
 * @author bramp
 *
 */
public interface SimpleList<E> {

	public int size();

	public boolean isEmpty();

	public boolean contains(E o);
	
	public void add(E e);

	public boolean remove(E o);

	public void clear();
}
