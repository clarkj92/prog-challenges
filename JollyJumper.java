/**
 * Created by JCAM6L on 5/30/2017.
 */

//a sequence of n>0 integers is a jolly jumper if the absolute values of the differences
//between successive elements takes on all values through n-1 (which may include negative numbers)
//https://www.reddit.com/r/dailyprogrammer/comments/65vgkh/20170417_challenge_311_easy_jolly_jumper/
public class JollyJumper
{

	public static void calculate(int[] nums)
	{
		int n = nums.length;
		int[] diff = new int[nums.length-1];

		//print out the input numbers
		System.out.print("nums: ");
		print(nums);
		System.out.print("(" + n + " numbers)");
		System.out.println();

		//get the absolute difference between each consecutive number
		for(int i = 0; i < nums.length-1; i++)
		{
			diff[i] = Math.abs(nums[i+1] - nums[i]);
		}

		//print out the differences
		System.out.print("diffs: ");
		print(diff);
		System.out.print("(" + (n-1) + " differences required)");
		System.out.println();

		//call the check method on the array of differences
		check(diff);
		System.out.println();
	}

	//checks if all required differences are present, then prints them
	public static void check(int[] diff)
	{
		int n = diff.length;
		boolean jolly = true;
		int[] check = new int[n];

		for(int i = 1; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(diff[j] == i)
				{
					check[i-1] = diff[j];
				}
			}
		}

		//prints the array of differences, in ascending order
		System.out.print("checks: ");
		print(check);
		System.out.println();

		//determines if the sequence is jolly or not
		for(int i = 0; i < n-1; i++)
		{
			if(check[i] == 0)
			{
				jolly = false;
			}
		}

		if(jolly)
		{
			System.out.println("JOLLY");
		}
		else
		{
			System.out.println("NOT JOLLY");
		}
	}

	//loops through the input array and prints each value
	public static void print(int[] nums)
	{
		for(int n : nums)
		{
			System.out.print(n + " ");
		}
	}

	//driver
	public static void main(String[] args)
	{
		calculate(new int[] {4, 1, 4, 2, 3});
		calculate(new int[] {8, 1, 6, -1, 8, 9, 5, 2, 7});
		calculate(new int[] {4, 1, 4, 2, 3});
		calculate(new int[] {5, 1, 4, 2, -1, 6});
		calculate(new int[] {4, 19, 22, 24, 21});
		calculate(new int[] {4, 19, 22, 24, 25});
		calculate(new int[] {4, 2, -1, 0, 2});
	}
}
