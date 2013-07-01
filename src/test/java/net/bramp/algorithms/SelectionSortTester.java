package net.bramp.algorithms;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

public class SelectionSortTester extends AbstractSortTester {

	/**
	 * Returns the Sorter under test
	 * @return
	 */
	public Sorter getSorter() {
		return new SelectionSorter();
	}

}
