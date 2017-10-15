/**
 * Created by JCAM6L on 6/21/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/1hvh6u/070813_challenge_132_easy_greatest_common_divisor/
public class GreatestCommonDivisor
{
	//finds the greatest common divisor of two numbers
	public static long divide(long a, long b)
	{
		if(b < a)
		{
			divide(b, a);
		}

		for(long i = a; i > 0; i--)
		{
			if(a % i == 0 && b % i == 0)
			{
				return i;
			}
		}
		return 0;
	}

	//prints formatted string with each number and their greatest common divisor
	public static void print(long a, long b, long gcd)
	{
			System.out.println("The greatest common divisor of " + a + " and " + b + " is " + gcd);
	}

	//driver
	public static void main(String[] args)
	{
		print(32, 12, divide(32, 12));
		print(142341, 512345, divide(142341, 512345));
		print(65535, 4294967295L, divide(65535, 4294967295L));
	}
}