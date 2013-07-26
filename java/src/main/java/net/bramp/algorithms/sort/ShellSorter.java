package net.bramp.algorithms.sort;

public class ShellSorter extends Sorter {

	public int[] ksort(int[] unsorted, int offset, int k) {
		for (int i = offset; i < unsorted.length; i += k) {
			for (int j = i; j >= k; j -= k) {
				if (unsorted[j - k] <= unsorted[j])
					break;
				swap(unsorted, j - k, j);
			}
		}
		return unsorted;
	}

	@Override
	public int[] sort(int[] unsorted) {
		int k = 1;
		do {
			k = k * 3;
		} while (k < unsorted.length);

		while (k > 1) {
			k /= 3;
			for (int offset = 0; offset < k; offset++)
				unsorted = ksort(unsorted, offset, k);
		}

		return unsorted;
	}

}
