package net.bramp.algorithms;

public class InsertionSorter extends Sorter {

	@Override
	public int[] sort(int[] unsorted) {
		for (int i = 0; i < unsorted.length; i++) {
			for (int j = i; j > 0; j--) {
				if (unsorted[j - 1] < unsorted[j])
					break;
				swap(unsorted, j - 1, j);
			}
		}
		return unsorted;
	}

}
