package net.bramp.algorithms.list;


import org.junit.Assert;
import org.junit.Test;

public abstract class AbstractSimpleListTester {

	public static final int LIST_SIZE = 1000;
	
	SimpleList<Integer> list;

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
	public void clear() {
		list.clear();
		list.add(0);
		list.clear();
		Assert.assertSame(0, list.size());
	}
}
