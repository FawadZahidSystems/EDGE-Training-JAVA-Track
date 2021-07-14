class LinkedList<T>
{
	Node<T> head;
	Node<T> tail;
	int nodes;
	
	public LinkedList()
	{
		head = null;
		tail = null;
		nodes = 0;
	}
	
	public void add(T data)
	{
		Node<T> newNode = new Node<T>(data);
		//If list is empty
		if (head == null)
		{
			head = newNode;
		}
		else
		{
			//If list is not empty
			tail.next = newNode;
		}
		//Point tail to the new node
		tail = newNode;
		//Increase node count
		nodes++;
	}
	
	
	public void remove(T data)
	{
		Node<T> current = head;
		Node<T> prev = null;

        // If element to remove is the head
		if (current != null && current.data == data) {
			head = current.next;
		}

        // Traverse through the LinkedList until data is found
		while (current != null && current.data != data) {
			prev = current;
			current = current.next;
		}
		
		//Remove value
		if (current != null) {
			prev.next = current.next;
		}
		//Decrease node count
		nodes--;
	}
	
    public void printList()
    {
    	Node<T> current = head;
        // Traverse through the LinkedList
        while (current != null) {
            System.out.print(current.data + " ");
            // get next node
            current = current.next;
        }
    }
}