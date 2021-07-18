package Sorting;

import java.util.ArrayList;

public class QuickSort {
	
	public int partition(ArrayList<Integer> list, int low, int high)
	{
		// Set last element as pivot point
	    int pivot = list.get(high);
	    int i = (low - 1);
	 
	    // Traverse partitioned array
	    for (int j = low; j <= high - 1; j++)
	    {
	    	// If an element is less than the pivot element
	        if (list.get(j) < pivot)
	        {
	            i++;
	            // swap element data
	            swap(list, i, j);
	        }
	    }
	    swap(list, i + 1, high);
	    return (i + 1);
	}
	
	public void swap(ArrayList<Integer> list, int index1, int index2)
	{
		// Swaps array element at index1 and index2
		int temp = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, temp);
	}
	
	public void quickSort(ArrayList<Integer> list, int low, int high)
	{
	    if (low < high)
	    {
	    	// Find the partition point
	        int mid = partition(list, low, high);
	        // run sort on 1st partition
	        quickSort(list, low, mid - 1);
	        // run sort on 2nd partition
	        quickSort(list, mid + 1, high);
	    }
	}
	
	public void sort(ArrayList<Integer> list)
	{
		// Start sorting from index 0 to the specified size - 1 index
		quickSort(list, 0, list.size() - 1);
	}
}
