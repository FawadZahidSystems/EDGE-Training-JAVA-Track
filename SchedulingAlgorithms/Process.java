package SchedulingAlgorithms;

public class Process
{
	int id;
	int priority;
	int executionTime;
	
	public Process(int id, int priority, int executionTime)
	{
		this.id = id;
		this.priority = priority;
		this.executionTime = executionTime;
	}
	
	public void run()
	{
		System.out.println("thread " + id + " started");  
		try {
			Thread.sleep(executionTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thread " + id + " completed");  
	}
}
