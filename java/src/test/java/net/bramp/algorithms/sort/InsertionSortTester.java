package net.bramp.algorithms.sort;

import org.junit.Before;

import net.bramp.algorithms.sort.InsertionSorter;

public class InsertionSortTester extends AbstractSortTester {

	@Before
	public void newInsertionSorter() {
		sorter = new InsertionSorter();
	}

}
