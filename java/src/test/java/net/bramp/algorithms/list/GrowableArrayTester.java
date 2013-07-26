package net.bramp.algorithms.list;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class GrowableArrayTester {
	
	int LIST_SIZE = 100;
	
	GrowableArray<Integer> list;

	@Before
	public void newGrowableArray() {
		list = new GrowableArray<Integer>();
	}

	@Test
	public void addOne() {
		list.add(0, 0);
		Assert.assertSame(0, list.get(0));
	}

	@Test
	public void addOneFar() {
		list.add(LIST_SIZE, LIST_SIZE);
		Assert.assertSame(LIST_SIZE, list.get(LIST_SIZE));
	}

	
	@Test
	public void addNone() {
		for (int i = 0; i < LIST_SIZE; i++)
			Assert.assertSame(null, list.get(i));
	}
	
	@Test
	public void addMany() {
		for (int i = 0; i < LIST_SIZE; i++)
			list.add(i, i);

		for (int i = 0; i < LIST_SIZE; i++)
			Assert.assertSame(i, list.get(i));
	}
}
