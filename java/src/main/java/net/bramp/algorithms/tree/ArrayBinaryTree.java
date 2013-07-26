package net.bramp.algorithms.tree;

import net.bramp.algorithms.list.GrowableArray;
import net.bramp.algorithms.list.SimpleList;

/**
 * A sorted binary tree backed by an array
 * 
 * @author bramp
 *
 */
public class ArrayBinaryTree<E extends Comparable<E>> implements SimpleList<E> {
	final static int ROOT = 0; // root at 1 keeps the math simpler

	int size = 0;
	final GrowableArray<E> tree = new GrowableArray<E>();

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	private static int leftChild(int index) {
		return 2 * index + 1;
	}
	
	private static int rightChild(int index) {
		return 2 * index + 2;
	}

	public void add(E e) {
		if (e == null)
			throw new NullPointerException();

		int index = ROOT;

		E obj;
		while ((obj = tree.get(index)) != null) {
			int ret = e.compareTo(obj);
			if (ret < 0) {
				index = leftChild(index);
			} else if (ret > 0) {
				index = rightChild(index);
			} else {
				size--;
				break; // Replace this node
			}
		}
		tree.add(index, e);
		size++;
	}
	
	public boolean contains(E o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean remove(E o) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		size = 0;
		tree.clear();
	}

}
