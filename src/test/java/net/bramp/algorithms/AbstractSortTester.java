package net.bramp.algorithms;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public abstract class AbstractSortTester {

	public static final int LIST_SIZE = 1000;

	/**
	 * Returns the Sorter under test
	 * @return
	 */
	public abstract Sorter getSorter();
	
	@Test(expected=NullPointerException.class)
	public void testNull() {
		getSorter().sort(null);
	}

	@Test
	public void testEmpty() {
		getSorter().sort(new int[]{});
	}
	
	@Test
	public void testListOfOne() {
		getSorter().sort(new int[]{0});
	}

	@Test
	public void testSortedList() {
		int[] list = new int[LIST_SIZE];
		for (int i = 0; i < LIST_SIZE; i++) {
			list[i] = i;
		}

		list = getSorter().sort(list);
		Assert.assertTrue( Sorter.isSorted(list) );
	}

	@Test
	public void testReverseList() {
		int[] list = new int[LIST_SIZE];
		for (int i = 0; i < LIST_SIZE; i++) {
			list[i] = LIST_SIZE - i - 1;
		}

		list = getSorter().sort(list);
		Assert.assertTrue( Sorter.isSorted(list) );
	}
	
	@Test
	public void testRandomList() {
		Random r = new Random(0); // Seeded to be reproducible

		int[] list = new int[LIST_SIZE];
		for (int i = 0; i < LIST_SIZE; i++) {
			list[i] = r.nextInt();
		}

		list = getSorter().sort(list);
		Assert.assertTrue( Sorter.isSorted(list) );
	}

}
