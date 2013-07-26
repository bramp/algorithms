package net.bramp.algorithms.sort;

import org.junit.Before;

import net.bramp.algorithms.sort.MergeSorter;

public class MergeSortTester extends AbstractSortTester {

	@Before
	public void newMergeSorter() {
		sorter = new MergeSorter();
	}

}
