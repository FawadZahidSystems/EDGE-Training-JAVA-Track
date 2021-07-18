package LinkedList;
public class LinkedList<T>
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
			current = null;
			//Decrease node count
			nodes--;
		}

        // Traverse through the LinkedList until data is found
		while (current != null && current.data != data) {
			prev = current;
			current = current.next;
		}
		
		//Remove value
		if (current != null) {
			prev.next = current.next;
			//Decrease node count
			nodes--;
		}
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
    
    public void replace(T oldData, T newData)
    {
        Node<T> current = head;
        // Traverse through the LinkedList until old data is found
        while(current!= null && current.data != oldData)
        	current = current.next;
        //override old data with new data
        if (current != null)
        	current.data = newData;
    }
    
    public void insertAfter(int index, T data)
    {
    	//call add method if index >= nodes - 1 as element is to be added in the end of the list
    	if (index >= nodes)
    	{
    		add(data);
    		return;
    	}
    	
        Node<T> current = head;
        Node<T> next = current.next;
        
        // Traverse through the LinkedList so that current points to the indexed element
        for(int i = 0; i < index; i++)
        {
        	current = current.next;
        	next = current.next;
        }
        
        // add the new element between current and next
        Node<T> newNode = new Node<T>(data);
        current.next = newNode;
        newNode.next = next;
        nodes++;
    }
    
    public T elementAt(int index)
    {
    	//return tail data if index is of last element or more
    	if (index >= nodes - 1)
    		return tail.data;
    	
        Node<T> current = head;
        // Traverse through the LinkedList so that current points to the indexed element
        for(int i = 0; i < index; i++)
        	current = current.next;
        
        return current.data;
    }
    

    public int nodeCount()
    {
    	return nodes;
    }
}