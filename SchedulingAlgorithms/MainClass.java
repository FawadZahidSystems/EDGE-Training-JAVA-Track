package SchedulingAlgorithms;

public class MainClass {

	public static void main(String[] args)
	{
		// Initialize SchedulingAlgorithms;
		SchedulingAlgorithms alg = new SchedulingAlgorithms();
		// Add processes
		alg.add(new Process(1, 2, 4000));
		alg.add(new Process(2, 4, 3000));
		alg.add(new Process(3, 1, 2000));
		alg.add(new Process(4, 3, 1000));
		
		// First come first serve
		alg.FCFS();
		// Shortest job next
		alg.SJN();
		// Priority based scheduling
		alg.PBS();
	}
}
