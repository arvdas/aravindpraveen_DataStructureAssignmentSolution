package com.greatlearning.driver;

import com.greatlearning.service.Main;
import com.greatlearning.service.Node;

public class Driver {

	public static void main(String[] args) {
		Main tree = new Main();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		tree.changeBST(tree.node);
		tree.traverse(tree.newHead);

	}

}
