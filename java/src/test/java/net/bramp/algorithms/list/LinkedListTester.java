package net.bramp.algorithms.list;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class LinkedListTester {

	int LIST_SIZE = 100;
	
	SingleLinkedList<Integer> list;

	@Before
	public void newList() {
		list = new SingleLinkedList<Integer>();
	}

	@Test(expected=IllegalArgumentException.class)
	public void addNull() {
		Assert.assertSame(0, list.size());
		list.add(null);
	}
	
	@Test
	public void addOne() {
		Assert.assertSame(0, list.size());
		list.add(0);
		Assert.assertSame(1, list.size());
	}
	
	@Test
	public void addManyOrdered() {
		Assert.assertSame(0, list.size());
		for (int i = 0; i < LIST_SIZE; i++)
			list.add(i);
		Assert.assertSame(LIST_SIZE, list.size());
	}

	@Test
	public void addManyUnordered() {
		Assert.assertSame(0, list.size());
		for (int i = LIST_SIZE - 1; i >= 0; i--)
			list.add(i);
		Assert.assertSame(LIST_SIZE, list.size());
	}
	
	@Test
	public void getOne() {
		addOne();
		Assert.assertSame(0, list.get(0));
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void getOutOfBounds() {
		list.get(0);
	}

	@Test
	public void getMany() {
		addManyOrdered();
		for (int i = 0; i < LIST_SIZE; i++) {
			// List is stored in reverse order
			Assert.assertSame(LIST_SIZE - i - 1, list.get(i));
		}
	}

	@Test
	public void clear() {
		list.clear();
		list.add(0);
		list.clear();
		Assert.assertSame(0, list.size());
	}
}
