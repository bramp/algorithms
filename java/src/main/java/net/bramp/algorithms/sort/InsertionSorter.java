package net.bramp.algorithms.sort;

public class InsertionSorter extends Sorter {

	@Override
	public int[] sort(int[] unsorted) {
		for (int i = 1; i < unsorted.length; i++) {
			for (int j = i; j >= 1; j--) {
				if (unsorted[j - 1] <= unsorted[j])
					break;
				swap(unsorted, j - 1, j);
			}
		}
		return unsorted;
	}

}
