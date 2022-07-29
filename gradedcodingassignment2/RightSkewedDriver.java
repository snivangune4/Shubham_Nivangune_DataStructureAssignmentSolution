package com.gl.gradedcodingassignment2;

import com.gl.gradedcodingassignment2.RightSkewedTree.Node;

public class RightSkewedDriver {

	public static void main (String[] args)
	{		
		RightSkewedTree rst= new RightSkewedTree();
		Node root = null;
		int[] arr = { 50,30,10,60,55};
		for (int i = 0; i < arr.length; i++) {
			int value = arr[i];
		if (root == null) {
			root = rst.insertNode(root, value);
		} 
		else {
			rst.insertNode(root, value);
			}
		}
		rst.flattenBTToSkewed(root);
        rst.traverseRightSkewed(rst.headNode);
	}
}
