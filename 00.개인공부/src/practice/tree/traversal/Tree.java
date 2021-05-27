package practice.tree.traversal;

public class Tree {

	public Tree() {
		
	}
	
	public Node makeNode(Node left, int data, Node right) {
		Node newNode = new Node(data, left, right);
		
		return newNode;
	}
	
	public void inorder(Node node) {
		// LRootR
		
		if (node != null) {
			inorder(node.left);
			System.out.println(node.data);
			inorder(node.right);
		}
	}
	
	public void preorder(Node node) {
		// RootLR
		
		if (node != null) {
			System.out.println(node.data);
			preorder(node.left);
			preorder(node.right);
		}
	}
	
	public void postorder(Node node) {
		// LRRoot
		
		if (node != null) {
			postorder(node.left);
			postorder(node.right);
			System.out.println(node.data);
		}
	}
	
	public static void main(String[] args) {
		/*
		 * Inorder (LRootR) : 4-2-5-1-3
		 * Preorder (RootLR) : 1-2-4-5-3
		 * Postorder (LRRoot) : 4-5-2-3-1
		 */
		
		Tree root = new Tree();
		
		Node n5 = root.makeNode(null, 5, null);
		Node n4 = root.makeNode(null, 4, null);
		Node n3 = root.makeNode(null, 3, null);
		Node n2 = root.makeNode(n4, 2, n5);
		Node n1 = root.makeNode(n2, 1, n3);
		
		System.out.print("Inorder : ");
		root.inorder(n1);
	
		System.out.print("Preorder : ");
		root.preorder(n1);
		
		System.out.print("Postorder : ");
		root.postorder(n1);
	}
}
