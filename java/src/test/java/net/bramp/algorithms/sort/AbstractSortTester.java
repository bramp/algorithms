package net.bramp.algorithms.sort;

import java.util.Random;

import net.bramp.algorithms.sort.Sorter;

import org.junit.Assert;
import org.junit.Test;

public abstract class AbstractSortTester {

	public static final int LIST_SIZE = 1000;

	Sorter sorter;
	
	@Test(expected=NullPointerException.class)
	public void testNull() {
		sorter.sort(null);
	}

	@Test
	public void testEmpty() {
		sorter.sort(new int[]{});
	}
	
	@Test
	public void testListOfOne() {
		sorter.sort(new int[]{0});
	}

	@Test
	public void testSortedList() {
		int[] list = new int[LIST_SIZE];
		for (int i = 0; i < LIST_SIZE; i++) {
			list[i] = i;
		}

		list = sorter.sort(list);
		Assert.assertTrue( Sorter.isSorted(list) );
	}

	@Test
	public void testReverseList() {
		int[] list = new int[LIST_SIZE];
		for (int i = 0; i < LIST_SIZE; i++) {
			list[i] = LIST_SIZE - i - 1;
		}

		list = sorter.sort(list);
		Assert.assertTrue( Sorter.isSorted(list) );
	}
	
	@Test
	public void testRandomList() {
		Random r = new Random(0); // Seeded to be reproducible

		int[] list = new int[LIST_SIZE];
		for (int i = 0; i < LIST_SIZE; i++) {
			list[i] = r.nextInt();
		}

		list = sorter.sort(list);
		Assert.assertTrue( Sorter.isSorted(list) );
	}

}
