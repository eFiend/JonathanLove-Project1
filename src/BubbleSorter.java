/**
 * The sort method of this class sorts an array, 
 * using the bubble sort algorithm.
 * @author Jonathan Love
 * @version 8-30-2015
 */
public class BubbleSorter
{
	public static void main(String[] args)
	{
		boolean sorted = false;
		
		// Construct random array
		int[] a = ArrayUtil.randomIntArray(10, 100);
		
		System.out.print("Unsorted Array: ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		
		while(sorted == false)
		{
			int k = 0;
			for(int i = 0; i < a.length - 1; i++)
			{
				if(a[i] <= a[i + 1])
				{
					k++;
					if (k == a.length - 2)
					{
						sorted = true;
					}
				}
				else
				{
					ArrayUtil.swap(a, i, i + 1);
					sorted = false;
				}
			}
		}
		System.out.print("\nSorted Array: ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
}