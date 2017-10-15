/**
 * Created by JCAM6L on 5/16/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/68oda5/20170501_challenge_313_easy_subset_sum/
public class SubsetSum
{

	//method that calls the helper functions
	public static void execute(int[] array)
	{
		boolean answer = sumSubset(array);
		printAnswer(array, answer);
	}

	//adds each element in the array to find 2 numbers that sum to zero
	public static boolean sumSubset(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array.length; j++)
			{
				if(array[i] + array[j] == 0)
				{
					return true;
				}
			}
		}

		return false;
	}

	//loops through the array, printing each element, then printing the answer
	public static void printAnswer(int[] array, boolean answer)
	{
		if(array.length > 0)
		{
			System.out.print("[");
			System.out.print(array[0]);

			for(int i = 1; i < array.length; i++)
			{
				System.out.print(", " + array[i]);
			}

			System.out.print("] -> " + answer);
			System.out.println();
		}
	}

	//main method
	public static void main(String[] args)
	{
		execute(new int[] {1, 2, 3});
		execute(new int[] {-5, -3, -1, 2, 4, 6});
		execute(new int[] {});
		execute(new int[] {-1, 1});
		execute(new int[] {-97364, -71561, -69336, 19675, 71561, 97863});
		execute(new int[] {-53974, -39140, -36561, -23935, -15680, 0});
	}
}
