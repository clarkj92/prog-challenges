/**
 * Created by JCAM6L on 6/29/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/2ejl4x/8252014_challenge_177_easy_quicksort/
public class Quicksort
{
	//low is the starting index, high is the ending index
	public static void sort(int[] A, int low, int high)
	{
		int pi;

		if(low < high)
		{
			pi = partition(A, low, high);
			sort(A, low, pi-1);	//before pi
			sort(A, pi+1, high);	//after pi
		}
	}

	//low is the starting index, high is the ending index
	public static int partition(int[] A, int low, int high)
	{
		int pivot = A[high];
		int i = low-1;
		int temp;

		for(int j = low; j <= high-1; j++)
		{
			if(A[j] <= pivot)
			{
				i++;
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;

				System.out.println("A[i]: " + A[i]);
				System.out.println("A[j]: " + A[j]);
				System.out.println("pivot: " + pivot);
				print(A);
				System.out.println();
			}
		}

		temp = A[i+1];
		A[i+1] = A[high];
		A[high] = temp;

		return i+1;
	}

	//print the contents of the array
	public static void print(int[] A)
	{
		for(int i = 0; i < A.length; i++)
		{
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}

	//driver
	public static void main(String[] args)
	{
		int[] A = new int[]{10, 7, 8, 9, 1, 11, 5, 8, 6, 12, 2, 4, 3};
		int n = A.length;

		print(A);
		sort(A, 0, n-1);
		print(A);
	}
}
