package ResizableArray;

public class MainClass {

	public static void main(String[] args)
	{
		ResizableArray arr = new ResizableArray(5);
		arr.add(5);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		arr.print();
		System.out.println("Array size: " + arr.size());
		System.out.println("Array actual size: " + arr.actualSize());
		
		arr.add(0);
		arr.remove(3);
		arr.print();
		System.out.println("Array size: " + arr.size());
		System.out.println("Array actual size: " + arr.actualSize());
		
		arr.sort();
		System.out.println("Sorted array:");
		arr.print();
	}
}
