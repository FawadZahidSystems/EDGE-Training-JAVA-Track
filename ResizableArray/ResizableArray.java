package ResizableArray;

public class ResizableArray {
	
	private int arr[];
	private int size = 0;
	private int count = 0;
	
	public ResizableArray(int size)
	{
		// Initialize array with the given size
		arr = new int[size];
		this.size = size;
	}
	
	public void add(int item)
	{
		// Need to create a new array with double size if the current array is full
		if(size == count)
		{
			// New array with double size
			int newArr[] = new int[size * 2];
			// Copy contents of the current array to the new array
			System.arraycopy(arr, 0, newArr, 0, size);
			size *= 2;
			// set current array to the new array
			arr = newArr;
		}
		// Add element to the array
		arr[count] = item;
		// increment element count by 1 
		count++;
	}
	
	public int get(int index)
	{
		// If index is greater than total element count then return exception
		if (index > count - 1)
			throw new IndexOutOfBoundsException();
		return arr[index];
	}
	
	public void set(int index, int value)
	{
		// If index is greater than total element count then return exception
		if (index > count - 1)
			throw new IndexOutOfBoundsException();
		arr[index] = value;
	}
	
	public void remove(int index)
	{
		// Move 1 block back all array data after the specified index
		for (int i = index; i < count - 1; i++)
		{
			arr[i] = arr[i + 1];
		}
		// Reset last data element to 0
		arr[count - 1] = 0;
		// Decrement element count by 1
		count--;
	}
	
	public int actualSize()
	{
		return size;
	}
	
	public int size()
	{
		return count;
	}
	
	public void print()
	{
		// Print elements of the array to the total element count and not to the array size
		for(int i = 0; i < count; i++)
			System.out.println(arr[i]);
	}
	
	public void sort()
	{
		// Sort part of array from the start to the total element count
		new QuickSort().sort(arr, count);
	}
}
