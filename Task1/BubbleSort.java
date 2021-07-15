package Sorting;

import java.util.ArrayList;

public class BubbleSort {
	public void sort(ArrayList<Integer> list)
	{
		for(int i = 0; i < list.size() - 1; i++)
		{
			for(int j = 0; j < list.size() - i - 1; j++)
			{
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
