package Sorting;

import java.util.ArrayList;

public class BubbleSort {
	public void sort(ArrayList<Integer> list)
	{
		// Traverse all elements of the array
		for(int i = 0; i < list.size() - 1; i++)
		{
			// for each element traverse all elements that are not yet sorted - Each iteration moves the largest number to the end
			for(int j = 0; j < list.size() - i - 1; j++)
			{
				// swap data if current element data is greater than the next element
				if(list.get(j) > list.get(j + 1))
				{
					list.set(j, list.get(j) + list.get(j + 1));
					list.set(j + 1, list.get(j) - list.get(j + 1));
					list.set(j, list.get(j) - list.get(j + 1));
				}
			}
		}
	}
}
