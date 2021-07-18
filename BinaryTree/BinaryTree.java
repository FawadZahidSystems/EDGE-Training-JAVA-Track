package BinaryTree;

import java.util.LinkedList;

public class BinaryTree<T>
{
	Node<T> head;
	int size;

	public BinaryTree()
	{
		head = new Node<T>(null);
	}
	
	public BinaryTree(T data)
	{
		head = new Node<T>(data);
	}
	
	public void add(T data)
	{
		Node<T> node = head;
		// If head node is null then add node at head and add data to it
		if(node == null)
			node = new Node<T>(data);
		else
		{
			// Initialize a list for traversal
			LinkedList<Node<T>> list = new LinkedList<>();
			// Add head node to the list
			list.add(node);
			
			while (!list.isEmpty())
			{
				// Get and remove last element of the list
				node = list.peek();
	            list.remove();
	 
	            // if left node is empty the add left node with data
	            if (node.left == null)
	            {
	            	node.left = new Node<T>(data);
	                break;
	            }
	            // if left node is not empty then add node to list for future traversal
	            else
	            	list.add(node.left);
	            
	            // if right node is empty the add left node with data
	            if (node.right == null)
	            {
	            	node.right = new Node<T>(data);
	                break;
	            }
	            // if right node is not empty then add node to list for future traversal
	            else
	            	list.add(node.right);
	        }
		}
		size++;
	}
	
	public void remove(T data)
	{
		// If head null then tree is empty
	    if (head == null)
	        return;
	    
	    // If head left and right are null then data should be in head node
	    if (head.left == null && head.right == null)
	    {
	    	// If data found in head node then remove head node
	        if (head.data == data)
	        {
	        	head = null;
	            return;
	        }
	        else
	            return;
	    }

	    // Temporary node for traversal
	    Node<T> temp = null;
	    // pointer to the node to which delete node is to swich with
	    Node<T> node = null;
	    // Initialize a list for traversal
	    LinkedList<Node<T>> list = new LinkedList<Node<T>>();
	    // Add head node to the list
	    list.add(head);
	    
	    while (!list.isEmpty())
	    {
			// Get and remove last element of the list
	        temp = list.peek();
	        list.remove();
	        
	        // If node contains data to be removed then point to that node
	        if (temp.data == data)
	        	node = temp;
	        
	        // Add left node to the list for future traversal
	        if (temp.left != null)
	        	list.add(temp.left);
	 
	        // Add right node to the list for next traversal
	        if (temp.right != null)
	        	list.add(temp.right);
	    }
	 
	    // If data found then remove last node and copy its data to the node containing data to be removed
	    if (node != null)
	    {
	        T d = temp.data;
	        remove(temp);
	        node.data = d;
	        size--;
	    }
	}
	
	private void remove(Node<T> delNode)
	{
	    // Initialize a list for traversal
		LinkedList<Node<T>> list = new LinkedList<Node<T>>();
		// Add head node to the list
		list.add(head);
		Node<T> temp = null;
		
		while (!list.isEmpty())
		{
			// Get and remove last element of the list
			temp = list.peek();
			list.remove();

			// If delNode found then set it to null
			if (temp == delNode)
			{
				temp = null;
				return;
			}
			
			// If delnode on the right then set it to null otherwise add to list for future traversal
			if (temp.right != null)
			{
				if (temp.right == delNode)
				{
					temp.right = null;
					return;
				}
				else
					list.add(temp.right);
			}

			// If delnode on the left then set it to null otherwise add to list for future traversal
			if (temp.left != null)
			{
				if (temp.left == delNode)
				{
					temp.left = null;
					return;
				}
				else
					list.add(temp.left);
			}
		}
	}
	
	public void print()
	{
		// Print data starting from the head
		if (head != null)
			print(head);
	}
	
	private void print(Node<T> node)
    {
        if (node == null)
            return;
 
        // Traverse left node
        print(node.left);
        // Print current node
        System.out.print(node.data + " ");
        // Traverse right node
        print(node.right);
    }
	
	public boolean BFS(T data)
	{
		// Initialize a list
		LinkedList<Node<T>> list = new LinkedList<Node<T>>();
		// Add the head node to the list
		list.add(head);
		// Create a temporary node for traversal
		Node<T> temp;
		
		// Traverse tree
		while (!list.isEmpty())
		{
			// Get and remove first element of the list
			temp = list.pop();

			// Check if data found on current node
			if (temp.data == data)
			{
				return true;
			}
			// Add left node to the list for next traversal
			if (temp.left != null)
			{
				list.add(temp.left);
			}
			// Add right node to the list for future traversal
			if (temp.right != null)
			{
				list.add(temp.right);
			}
		}
		// Return false if data not found in tree
		return false;
	}
	
	public boolean DFS(T data)
	{
		// Initialize a list
		LinkedList<Node<T>> list = new LinkedList<Node<T>>();
		// Add the head node to the list
		list.add(head);
		// Create a temporary node for traversal
		Node<T> temp;
		
		// Traverse tree
		while (!list.isEmpty())
		{
			// Get and remove last element of the list
			temp = list.pollLast();

			// Check if data found on current node
			if (temp.data == data)
			{
				return true;
			}
			// Add right node to the list for future traversal
			if (temp.right != null)
			{
				list.add(temp.right);
			}
			// Add left node to the list for next traversal
			if (temp.left != null)
			{
				list.add(temp.left);
			}
		}
		// Return false if data not found in tree
		return false;
	}
	
	public int size()
	{
		return size;
	}
}
