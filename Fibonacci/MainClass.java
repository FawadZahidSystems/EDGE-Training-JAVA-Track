package Fibonacci;

public class MainClass
{
	public static void main(String[] args)
	{
		FibonacciSeriesGen fib = new FibonacciSeriesGen();
		// Generate Fibonacci Series from the start
		fib.generate(20);
		System.out.println();
		// Generate Fibonacci Series from the given numbers
		fib.generate(2, 3, 20);
	}
}
