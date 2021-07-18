package Fibonacci;

import java.util.Stack;

public class FibonacciSeriesGen
{
	public void generate(int limit)
	{
		// Initialize stack
		Stack<Integer> list = new Stack<Integer>();

		int last;
		// Limit is the last Fibonacci Series number
		int secondLast = limit;
		// Add 0 and 1 in stack to start
		list.add(0);
		list.add(1);
		
		// Generate until limit number is printed
		while(secondLast <= limit)
		{
			// Pop last element
			last = list.pop();
			// Pop 2nd last element
			secondLast = list.pop();
			// Add last and 2nd last to make the new number
			secondLast = last + secondLast;
			// Push last element back into the stack 
			list.push(last);
			// Push the new number into the stack
			list.push(secondLast);
			// Print the new number
			System.out.print(secondLast + ", ");
		}
	}

	public void generate(int secondLast, int last, int limit)
	{
		// Same as the last method but that starting 2 numbers are parameterized
		Stack<Integer> list = new Stack<Integer>();

		list.add(secondLast);
		list.add(last);
		
		do
		{
			last = list.pop();
			secondLast = list.pop();
			secondLast = last + secondLast;
			list.push(last);
			list.push(secondLast);
			System.out.print(secondLast + ", ");
		} while(secondLast <= limit);
	}
}
