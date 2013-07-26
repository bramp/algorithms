package net.bramp.algorithms.sort;

import org.junit.Before;

import net.bramp.algorithms.sort.ShellSorter;

public class ShellSortTester extends AbstractSortTester {

	@Before
	public void newShellSorter() {
		sorter = new ShellSorter();
	}

}
