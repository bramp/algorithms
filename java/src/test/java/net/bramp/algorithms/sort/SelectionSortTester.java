package net.bramp.algorithms.sort;

import org.junit.Before;

import net.bramp.algorithms.sort.SelectionSorter;

public class SelectionSortTester extends AbstractSortTester {

	@Before
	public void newSelectionSorter() {
		sorter = new SelectionSorter();
	}

}
