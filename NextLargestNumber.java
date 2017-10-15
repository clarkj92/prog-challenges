import java.util.ArrayList;

/**
 * Created by JCAM6L on 6/1/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/67q3s6/20170426_challenge_312_intermediate_next_largest/
public class NextLargestNumber
{

	//calls the conversion, the permutation, the printing, and the comparison
	public static void calculate(int num)
	{
		ArrayList<Integer> nums = new ArrayList<Integer>();
		char[]c;
		int max;

		c = toChar(num);
		permute(nums, c, 0, c.length);
		System.out.println("starting number: " + num);
		//print(nums);
		max = getMax(c);
		System.out.println("next largest number: " + findNextLargest(nums, num, max));
	}

	//converts an integer to a char array
	public static char[] toChar(int num)
	{
		return String.valueOf(num).toCharArray();
	}

	//converts a char array to an integer
	public static int toInt(char[] c)
	{
		return Integer.parseInt(new String(c));
	}

	//loops through the array and finds each permutation of its values
	public static void permute(ArrayList<Integer> nums, char[] c, int start, int end)
	{
		if(start == end)
		{
			nums.add(toInt(c));
		}
		else
		{
			for(int i = start; i < end; i++)
			{
				swap(c, start, i);
				permute(nums, c, start+1, end);
				swap(c, start, i);
			}
		}
	}

	//helper function for the permute method
	//swaps two values
	public static void swap(char[] c, int x, int y)
	{
		char t;

		t = c[x];
		c[x] = c[y];
		c[y] = t;
	}

	//roundabout way to find the largest number possible given the length of the input
	public static int getMax(char[] c)
	{
		char[] n = new char[c.length];
		int iN;

		for(int i = 0; i < n.length; i++)
		{
			n[i] = '9';
		}

		return toInt(n);
	}

	//returns the next largest number to the input number, given a list of possible values
	public static int findNextLargest(ArrayList<Integer> nums, int start, int max)
	{
		int answer = max;

		for(int n : nums)
		{
			if(n > start && n <= answer)
			{
				answer = n;
			}
		}

		return answer;
	}

	//print integer array list
	public static void print(ArrayList<Integer> nums)
	{
		for(int n : nums)
		{
			System.out.println(n);
		}
	}

	//print character array
	public static void print(char[] nums)
	{
		for(char c : nums)
		{
			System.out.println(c);
		}
	}

	//driver
	public static void main(String[] args)
	{
		//calculate(1234);
		//calculate(1243);
		calculate(234765);
		//calculate(19000);
	}
}
