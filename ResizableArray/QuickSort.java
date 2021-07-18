package ResizableArray;

public class QuickSort {
	
	public int partition(int arr[], int low, int high)
	{
		// Set last element as pivot point
	    int pivot = arr[high];
	    int i = (low - 1);
	 
	    // Traverse partitioned array
	    for (int j = low; j <= high - 1; j++)
	    {
	    	// If an element is less than the pivot element
	        if (arr[j] < pivot)
	        {
	            i++;
	            // swap element data
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, high);
	    return (i + 1);
	}
	
	public void swap(int arr[], int index1, int index2)
	{
		// Swaps array element at index1 and index2
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public void quickSort(int arr[], int low, int high)
	{
	    if (low < high)
	    {
	    	// Find the partition point
	        int mid = partition(arr, low, high);
	        // run sort on 1st partition
	        quickSort(arr, low, mid - 1);
	        // run sort on 2nd partition
	        quickSort(arr, mid + 1, high);
	    }
	}
	
	public void sort(int arr[], int size)
	{
		// Start sorting from index 0 to the specified size - 1 index
		quickSort(arr, 0, size - 1);
	}
}
