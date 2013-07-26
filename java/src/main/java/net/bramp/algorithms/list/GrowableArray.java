package net.bramp.algorithms.list;

/**
 * Simple array that allows insertion into any non-negative index. If the
 * index is beyond the end of the array the array is expanded
 * 
 * @author bramp
 *
 * @param <E>
 */
public class GrowableArray<E> {

	final static int INITAL_SIZE = 1;

	E[] list = newArray(INITAL_SIZE);

	public void add(int index, E element) {
		expand(index);
		list[index] = element;
	}

	public E get(int index) {
		if (index < 0)
			throw new IndexOutOfBoundsException();

		if (index >= list.length)
			return null;

		return list[index];
	}

	/**
	 * Expands the array to at least this big
	 * @param atleast
	 */
	protected void expand(int atleast) {
		if (atleast < 0)
			throw new IndexOutOfBoundsException();

		if (atleast >= list.length) {
			E[] newlist = newArray(atleast + 1);
			System.arraycopy(list, 0, newlist, 0, list.length);
			list = newlist;
		}
	}

	public void clear() {
		list = newArray(INITAL_SIZE);
	}

	@SuppressWarnings("unchecked")
	private E[] newArray(int length) {
		return (E[]) new Object[length];
	}
}
