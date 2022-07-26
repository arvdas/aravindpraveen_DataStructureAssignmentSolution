package com.greatlearning.service;

public class Main {
	public Node node;
	Node prev = null;
	public Node newHead = null;

	public void changeBST(Node root) {
		if (root == null)
			return;

		changeBST(root.left);
		Node rightNode = root.right;
		Node leftNode = root.left;

		if (newHead == null) {
			newHead = root;
			root.left = null;
			prev = root;
		} else {

			prev.right = root;
			root.left = null;
			prev = root;
		}
		changeBST(rightNode);
	}

	public void traverse(Node root) {

		if (root == null)
			return;
		System.out.print(root.val + " ");
		traverse(root.right);
	}

}
