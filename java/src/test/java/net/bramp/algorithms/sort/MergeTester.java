package net.bramp.algorithms.sort;

import net.bramp.algorithms.sort.Sorter;

import org.junit.Assert;
import org.junit.Test;

public class MergeTester {

	@Test
	public void testOrdered() {
		int[] a = {1,1,1,1, 2,2,2,2};
		int[] b = Sorter.merge(a, 0, 4, 4, 4);

		Assert.assertTrue(Sorter.isSorted(b));
	}
	
	@Test
	public void testUnordered() {
		int[] a = {1,3,5,7, 2,4,6,8};
		int[] b = Sorter.merge(a, 0, 4, 4, 4);

		Assert.assertTrue(Sorter.isSorted(b));
	}

	@Test
	public void testOrderedFlipped() {
		int[] a = {2,2,2,2, 1,1,1,1};
		int[] b = Sorter.merge(a, 0, 4, 4, 4);

		Assert.assertTrue(Sorter.isSorted(b));
	}
	
	@Test
	public void testOrderedFully() {
		int[] a = {1,2,3,4, 5,6,7,8};
		int[] b = Sorter.merge(a, 0, 4, 4, 4);

		Assert.assertTrue(Sorter.isSorted(b));
	}

	@Test
	public void testEmpty() {
		int[] a = {};
		int[] b = Sorter.merge(a, 0, 0, 0, 0);

		Assert.assertTrue(Sorter.isSorted(b));
	}

	@Test
	public void testOdd() {
		int[] a = {1, 2, 3, 4};
		int[] b = Sorter.merge(a, 0, 3, 3, 1);

		Assert.assertTrue(Sorter.isSorted(b));
	}

	@Test(expected=NullPointerException.class)
	public void testNull() {
		Sorter.merge(null, 0, 0, 0, 0);
	}
}
