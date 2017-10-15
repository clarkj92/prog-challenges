/**
 * Created by JCAM6L on 6/27/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/230m05/4142014_challenge_158_easy_the_torn_number/
public class TornNumbers
{
	//checks if the square of the sum of the numbers is a concatenation of the numbers
	public static void validate(int a, int b)
	{
		int sum = a + b;
		int square = sum * sum;
		int first = square / 100;
		int second = square % 100;
		boolean answer = (first == a && second == b);

		System.out.println("first number: " + a);
		System.out.println("second number: " + b);
		System.out.println("sum: " + sum);
		System.out.println("square: " + square);
		System.out.println("torn number?  " + answer);
	}

	//checks if the square root of the number is a sum of the first half and second half of the number
	public static void check(int square)
	{
		int first = square / 100;
		int second = square % 100;
		int sum = first + second;
		double sqrt = Math.sqrt(square);

		if(sum == sqrt)
		{
			print(square, sqrt, first, second, sum);
		}
	}

	public static void print(int square, double sqrt, int first, int second, int sum)
	{
		System.out.println("square: " + square);
		System.out.println("square root: " + sqrt);
		System.out.println("first number: " + first);
		System.out.println("second number: " + second);
		System.out.println("sum: " + sum);
		System.out.println();
	}

	//driver
	public static void main(String[] args)
	{
		for(int i = 1000; i < 10000; i++)
		{
			check(i);
		}
	}
}