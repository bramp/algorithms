package net.bramp.algorithms;

public class SelectionSorter extends Sorter {

	/**
	 * Sorts by looping through N times, finding the
	 * min value and moving it down.
	 */
	@Override
	public int[] sort(int[] unsorted) {
		for (int i = 0; i < unsorted.length; i++) {
			int min = i;
			for (int j = i + 1; j < unsorted.length; j++) {
				if (unsorted[min] > unsorted[j])
					min = j;
			}
			swap(unsorted, i, min);
		}
		return unsorted;
	}

}
