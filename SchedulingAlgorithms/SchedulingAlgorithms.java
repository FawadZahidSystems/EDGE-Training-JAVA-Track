package SchedulingAlgorithms;

import java.util.Comparator;
import java.util.LinkedList;

public class SchedulingAlgorithms
{
	static LinkedList<Process> queue = new LinkedList<Process>();
	
	public void add(Process process)
	{
		// Adds process to queue;
		queue.add(process);
	}

	public void FCFS()
	{
		// Pops processes from queue and executes then
		while(!queue.isEmpty())
		{
			Process process = queue.pop();
			process.run();
		}
	}

	public void SJN()
	{
		// Sorts processes in queue according to their execution time
		queue.sort(new Comparator<Process>()
				{
					@Override
					public int compare(Process p1, Process p2)
					{
						return p1.executionTime - p2.executionTime;
					}
				});
		
		while(!queue.isEmpty())
		{
			Process process = queue.pop();
			process.run();
		}
	}

	public void PBS()
	{
		// Sorts processes in queue according to their priority
		queue.sort(new Comparator<Process>()
				{
					@Override
					public int compare(Process p1, Process p2)
					{
						return p1.priority - p2.priority;
					}
				});
		
		while(!queue.isEmpty())
		{
			Process process = queue.pop();
			process.run();
		}
	}
}
