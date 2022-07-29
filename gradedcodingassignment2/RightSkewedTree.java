package com.gl.gradedcodingassignment2;

public class RightSkewedTree 
{
	static class Node{
		int key;
		Node left,right;
	}
	
	static Node newNode(int data) {
		Node temp = new Node();
		temp.key=data;
		temp.left=null;
		temp.right=null;
		
		return temp;	
	}
	
	Node prevNode = null;
    Node headNode = null;
	
	public Node insertNode(Node root, int key) {
		Node newNode=newNode(key);
		Node x=root;
		Node current_parent=null;
		
		while(x!=null) {
			current_parent=x;
			if(key<x.key) {
				x=x.left;
			}
			else if(key>x.key) {
				x=x.right;
			}
			else {
				System.out.println("Value already exixts!!!");
				return newNode;
			}
		}
		
		// if root is null tree is empty
		
		if(current_parent==null) {
			current_parent=newNode;
		}
		// Assign new Node to the left child
		else if(key<current_parent.key) {
			current_parent.left=newNode;
		}
		// Assign new Node to right child
		else {
			current_parent.right=newNode;
		}
		return current_parent;
	}
	
	public void flattenBTToSkewed(Node root)
	{			    
		if(root == null)
		{
			return;
		}
	
		flattenBTToSkewed(root.left);

		Node rightNode = root.right;

		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		flattenBTToSkewed(rightNode);
	}

	public void traverseRightSkewed(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.key + " ");
		traverseRightSkewed(root.right);	
	}
}


