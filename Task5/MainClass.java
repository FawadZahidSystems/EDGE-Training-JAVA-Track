package LinkedList;
public class MainClass {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		list.printList();
		
		//removing from the middle
		list.remove("c");
		System.out.println();
		list.printList();

		//removing from the start
		list.remove("a");
		System.out.println();
		list.printList();
		
		//removing from the end
		list.remove("a");
		System.out.println();
		list.printList();
		
		//removing element that does not exist in list
		list.remove("1");
		System.out.println();
		list.printList();
		
		//replace b with a
		list.replace("b", "a");
		System.out.println();
		list.printList();

		//all elements removed
		list.remove("a");
		System.out.println();
		list.printList();
		
		//remove from empty list
		list.remove("a");
		System.out.println();
		list.printList();
		
		//insert after head
		list.insertAfter(0, "0");
		System.out.println();
		list.printList();
		
		//insert after head
		list.insertAfter(0, "2");
		System.out.println();
		list.printList();

		//insert after head
		list.insertAfter(0, "1");
		System.out.println();
		list.printList();
		
		//total count
		System.out.println();
		System.out.println(list.nodeCount());
	}
}
