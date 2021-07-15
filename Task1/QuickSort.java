package Sorting;

import java.util.ArrayList;

public class QuickSort {
	
	public int partition(ArrayList<Integer> list, int low, int high)
	{
	    int pivot = list.get(high);
	    int i = (low - 1);
	 
	    for (int j = low; j <= high - 1; j++)
	    {
	        if (list.get(j) < pivot)
	        {
	            i++;
	            swap(list, i, j);
	        }
	    }
	    swap(list, i + 1, high);
	    return (i + 1);
	}
	
	public void swap(ArrayList<Integer> list, int index1, int index2)
	{
		int temp = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, temp);
	}
	
	public void quickSort(ArrayList<Integer> list, int low, int high)
	{
	    if (low < high)
	    {
	        int mid = partition(list, low, high);
	        quickSort(list, low, mid - 1);
	        quickSort(list, mid + 1, high);
	    }
	}
	
	public void sort(ArrayList<Integer> list)
	{
		quickSort(list, 0, list.size() - 1);
	}
}
