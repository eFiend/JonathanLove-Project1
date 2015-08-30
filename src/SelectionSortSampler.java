import java.util.Scanner;

/**
 * SelectionSortSampler is a program that automatically generates the table of
 * sample run times for the selection sort algorithm. The program should ask
 * for the smallest and largest value of n and the number of measurements and
 * then make all sample runs.
 * 
 * @author Jonathan Love
 * @version 8-29-2015 
 */
public class SelectionSortSampler
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter largest value of n (max array size): ");
		int largest = in.nextInt();
		System.out.print("Enter smallest value of n (min array size): ");
		int smallest = in.nextInt();
		System.out.print("Enter the number of runs: ");
		int runs = in.nextInt();
						
		for (int i = 1; i <= runs; i++)
		{
			// Determine the current size of the array
			int currentSize = smallest + i * ((largest - smallest) / runs);
			
			// Construct random array
			int[] a = ArrayUtil.randomIntArray(currentSize, 100);
							
			// Use stopwatch to time selection sort
			StopWatch timer = new StopWatch();
			
			timer.start();
			SelectionSorter.sort(a);
			timer.stop();			
			
			System.out.println("Run: " + i + " | Array Size: " + currentSize + " | Time: " + timer.getElapsedTime() + "ms");
			 
		}
				
		in.close(); 
	}
}