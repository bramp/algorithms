package net.bramp.algorithms.sort;

import javax.annotation.Nonnull;

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

	/**
	 * 
	 * @param list
	 * @param offset1
	 * @param len1
	 * @param offset2
	 * @param len2
	 */
	public static int[] merge(@Nonnull int[] list, int offset1, int len1, int offset2, int len2) {
		if (!isSorted(list, offset1, len1))
			throw new IllegalArgumentException("list1 is not sorted");
		if (!isSorted(list, offset2, len2))
			throw new IllegalArgumentException("list2 is not sorted");

		int maxoffset1 = offset1 + len1;
		int maxoffset2 = offset2 + len2;

		if (maxoffset1 > list.length || offset1 < 0)
			throw new IllegalArgumentException("Invalid offset/len1");

		if (maxoffset2 > list.length || offset2 < 0)
			throw new IllegalArgumentException("Invalid offset/len2");

		int[] newlist = new int[ len1 + len2 ];
		int out = 0;

		while (offset1 < maxoffset1 && offset2 < maxoffset2) {
			if (list[offset1] <= list[offset2])
				newlist[out++] = list[offset1++];
			else if (list[offset1] > list[offset2])
				newlist[out++] = list[offset2++];
		}

		if (offset1 < maxoffset1)
			copy(newlist, out, list, offset1, maxoffset1 - offset1);
		else if (offset2 < maxoffset2)
			copy(newlist, out, list, offset2, maxoffset2 - offset2);

		return newlist;
	}
	
	/**
	 * Copies from src to dst. Assumes no overlap
	 * @param dst
	 * @param dstOffset
	 * @param src
	 * @param srcOffset
	 * @param len
	 */
	public static void copy(@Nonnull int[] dst, int dstOffset, @Nonnull int[] src, int srcOffset, int len) {
		// TODO Check for overlaps
		for (int i = 0; i < len; i++) {
			dst[dstOffset + i] = src[srcOffset + i];
		}
	}
	
	public static boolean isSorted(@Nonnull int[] list, int offset, int len) {
		if (list == null)
			throw new NullPointerException();

		int max_offset = offset + len;
		if (max_offset > list.length)
			throw new IllegalArgumentException("offset + len >= list.length");

		for (int i = offset + 1; i < max_offset; i++)
			if (list[i - 1] > list[i])
				return false;
		
		return true;
	}
	
	public static boolean isSorted(@Nonnull int[] list) {
		if (list == null)
			throw new NullPointerException();

		for (int i = 1; i < list.length; i++)
			if (list[i - 1] > list[i])
				return false;
		
		return true;
	}

	public abstract @Nonnull int[] sort(@Nonnull int[] unsorted);
}