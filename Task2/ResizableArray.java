package ResizableArray;

public class ResizableArray {
	
	private int arr[];
	private int size = 0;
	private int count = 0;
	
	public ResizableArray(int size)
	{
		arr = new int[size];
		this.size = size;
	}
	
	public void add(int item)
	{
		if(size == count)
		{
			int newArr[] = new int[size * 2];
			System.arraycopy(arr, 0, newArr, 0, size);
			size *= 2;
			arr = newArr;
		}
		arr[count] = item;
		count++;
	}
	
	public int get(int index)
	{
		return arr[index];
	}
	
	public void set(int index, int value)
	{
		arr[index] = value;
	}
	
	public void remove(int index)
	{
		for (int i = index; i < count - 1; i++)
		{
			arr[i] = arr[i + 1];
		}
		arr[count - 1] = 0;
		count--;
	}
	
	public int size()
	{
		return size;
	}
	
	public int itemCount()
	{
		return count;
	}
	
	public void print()
	{
		for(int i = 0; i < count; i++)
			System.out.println(arr[i]);
	}
	
	public void sort()
	{
		new QuickSort().sort(arr, count);
	}
}
