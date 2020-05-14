import java.util.Queue;

import LinkedList.LinkedList;

public class TreeImplemention {

	static class Node {
		int data;
		int depth;
		Node left, right;

		Node(int data) {
			this.data = data;
		}
	}

	public Node insert(Node root, int value) {
		if (root == null) {
			return new Node(value);

		}
		if (root.data > value) {
			root.left = insert(root.left, value);
		} else {
			root.right = insert(root.right, value);
		}
		return root;
	}

	// Tree Traversals

	public void PreOrder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		PreOrder(root.left);
		PreOrder(root.right);

	}

	public void InOrder(Node root) {
		if (root == null)
			return;

		InOrder(root.left);
		System.out.print(root.data + " ");
		InOrder(root.right);
	}

	public void PostOrder(Node root) {
		if (root == null)
			return;

		PostOrder(root.left);
		PostOrder(root.right);
		System.out.print(root.data + " ");
	}

	public int height(Node root) {
		if (root == null)
			return -1;

		return 1 + Math.max(height(root.right), height(root.left));
	}

	public int size(Node root) {
		if (root == null)
			return 0;

		return 1 + size(root.left) + size(root.right);
	}

	public int sum(Node root) {
		if (root == null)
			return 0;
		return root.data + sum(root.left) + sum(root.right);
	}

	public void fillDepth(Node root, int d) {
		if (root == null)
			return;

		root.depth = d;
		fillDepth(root.left, d + 1);
		fillDepth(root.right, d + 1);

	}

	public void printLevelOrder(Node root) {
		if (root == null)
			return;

		@SuppressWarnings("unchecked")
		Queue<Node> q = (Queue<Node>) new LinkedList();
		q.add(root);
		while (!q.isEmpty()) {
			Node curr = q.poll();
			System.out.print(curr.data + " ");
			if (curr.left != null) {
				q.add(curr.left);
			}

			if (curr.right != null) {
				q.add(curr.right);
			}
		}
	}

	public void printLevelOrderByLine(Node root) {
		if (root == null)
			return;

		@SuppressWarnings("unchecked")
		Queue<Node> q = (Queue<Node>) new LinkedList();
		q.add(root);
		q.add(null);
		while (q.size() > 1) {
			Node curr = q.poll();

			if (curr == null) {
				System.out.println();
				q.add(null);
			}
			System.out.print(curr.data + " ");
			if (curr.left != null) {
				q.add(curr.left);
			}

			if (curr.right != null) {
				q.add(curr.right);
			}
		}
	}

}
