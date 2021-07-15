package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,6,2,4,9,3,7,5,8,0));
		
		System.out.println("Bubble Sort:");
		new BubbleSort().sort(list);
		for(int item : list)
			System.out.println(item);

		System.out.println("Quick Sort:");
		new QuickSort().sort(list);
		for(int item : list)
			System.out.println(item);
	}
}
