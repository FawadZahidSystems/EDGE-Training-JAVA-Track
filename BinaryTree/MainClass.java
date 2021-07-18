package BinaryTree;

public class MainClass {

	public static void main(String[] args)
	{
		// Initializing the tree
		BinaryTree<Integer> tree = new BinaryTree<Integer>(1);
		// Adding data to the tree
		tree.add(2);
		tree.add(3);
		tree.add(4);
		tree.add(5);
		tree.add(6);
		tree.print();
		
		// Removing data from the tree
		System.out.println();
		tree.remove(5);
		tree.print();
		
		// Depth first search on the tree
		System.out.println();
		System.out.println(tree.DFS(6));

		// Breath first search on the tree
		System.out.println();
		System.out.println(tree.BFS(6));
	}

}
