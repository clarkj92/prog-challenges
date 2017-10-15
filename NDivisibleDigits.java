/**
 * Created by JCAM6L on 6/26/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/1jtryq/080613_challenge_134_easy_ndivisible_digits/
public class NDivisibleDigits
{
	//finds the largest possible number given a length, and divides by m until it finds a remainder of 0
	public static int divide(int length, int m)
	{
		int answer = 0;
		int largestNumber;
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < length; i++)
		{
			sb.append(9);
		}

		largestNumber = Integer.parseInt(sb.toString());
		int i = largestNumber;

		while(i % m != 0 && i > -1)
		{
			i--;
		}

		answer = i;

		/*//alternate way to solve
		for(int i = largestNumber; i > 0; i--)
		{
			if(i % m == 0)
			{
				answer = i;
				break;
			}
		}
		*/
		return answer;
	}

	//driver
	public static void main(String[] args)
	{
		int length = 3;
		int m = 2;
		System.out.println("The largest number divisible by " + m + " starting with a number of length " + length + " is " + divide(length, m));

		length = 7;
		m = 4241275;
		System.out.println("The largest number divisible by " + m + " starting with a number of length " + length + " is " + divide(length, m));
	}
}