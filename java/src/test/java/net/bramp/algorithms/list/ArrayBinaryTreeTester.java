package net.bramp.algorithms.list;

import net.bramp.algorithms.tree.ArrayBinaryTree;

import org.junit.Before;

public class ArrayBinaryTreeTester extends AbstractSimpleListTester {

	@Before
	public void newArrayBinaryTree() {
		list = new ArrayBinaryTree<Integer>();
	}

}
