/**
 * Created by JCAM6L on 6/27/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/1epasu/052013_challenge_126_easy_realworld_merge_sort/
public class RealWorldMergeSort
{
	//merges the first array into the second array and sorts the second array from least to greatest
	public static void sort(int[] a, int[] b)
	{
		System.out.println("before sort");
		print(a);
		print(b);
		System.out.println();

		for(int i = 0; i < a.length; i++)
		{
			b[i] = a[i];
			a[i] = 0;
		}

		System.out.println("after merge");
		print(a);
		print(b);
		System.out.println();

		for(int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < b.length-1; j++)
			{
				if(b[j+1] < b[j])
				{
					a[0] = b[j];
					a[1] = b[j+1];
					b[j] = a[1];
					b[j+1] = a[0];
				}
			}
		}

		System.out.println("after sort");
		print(b);
	}

	public static void print(int[] ints)
	{
		for(int i = 0; i < ints.length; i++)
		{
			System.out.print(ints[i] + " ");
		}
		System.out.println();
	}

	//driver
	public static void main(String[] args)
	{
		sort(new int[]{692, 1, 32}, new int[]{0, 0, 0, 14, 15, 123, 2431});
		//sort(new int[]{692, 1, 32}, new int[]{0, 0, 0, 14, 15, 123, 2431});
	}
}