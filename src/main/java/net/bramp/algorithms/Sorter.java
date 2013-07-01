package net.bramp.algorithms;

public abstract class Sorter {

	/**
	 * Swap the i^th and j^th elements
	 * @param list
	 * @param i
	 * @param j
	 */
	public static void swap(int[] list, int i, int j) {
		if (i < 0 || i >= list.length)
			throw new IndexOutOfBoundsException();
		if (j < 0 || j >= list.length)
			throw new IndexOutOfBoundsException();
		
		if (i == j)
			return; // noop

		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
	
	public static boolean isSorted(int[] list) {
		if (list == null)
			throw new NullPointerException();

		for (int i = 1; i < list.length; i++)
			if (list[i - 1] > list[i])
				return false;
		
		return true;
	}

	public abstract int[] sort(int[] unsorted);
}