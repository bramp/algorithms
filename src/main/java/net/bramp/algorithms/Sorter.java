package net.bramp.algorithms;

public abstract class Sorter {

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