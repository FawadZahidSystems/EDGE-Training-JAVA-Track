package ResizableArray;

public class QuickSort {
	
	public int partition(int arr[], int low, int high)
	{
	    int pivot = arr[high];
	    int i = (low - 1);
	 
	    for (int j = low; j <= high - 1; j++)
	    {
	        if (arr[j] < pivot)
	        {
	            i++;
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, high);
	    return (i + 1);
	}
	
	public void swap(int arr[], int index1, int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public void quickSort(int arr[], int low, int high)
	{
	    if (low < high)
	    {
	        int mid = partition(arr, low, high);
	        quickSort(arr, low, mid - 1);
	        quickSort(arr, mid + 1, high);
	    }
	}
	
	public void sort(int arr[], int size)
	{
		quickSort(arr, 0, size - 1);
	}
}
