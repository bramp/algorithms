package net.bramp.algorithms.list;


public class SingleLinkedList<E> implements SimpleList<E> {

	public int size = 0;
	Node<E> head;
	
	private static class Node<E> {
		E obj;
		Node<E> next;
	}
	
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean contains(E o) {
		Node<E> p = head;
		while (p != null) {
			if (p.obj.equals(o))
				return true;
			p = p.next;
		}
		return false;
	}

	public void add(E e) {
		if (e == null)
			throw new IllegalArgumentException();

		Node<E> p = new Node<E>();

		p.obj = e;
		p.next = head;

		head = p;
		size++;
	}

	public boolean remove(E o) {
		throw new UnsupportedOperationException("TODO");
	}

	public E get(int index) {
		Node<E> p = head;
		while (index > 0 && p != null) {
			p = p.next;
			index--;
		}
		if (p == null)
			throw new IndexOutOfBoundsException();

		return p.obj;
	}

	public void clear() {
		head = null;
		size = 0;
	}

}
