/**
 * Created by JCAM6L on 6/8/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/55nior/20161003_challenge_286_easy_reverse_factorial/
public class ReverseFactorial
{
	//finds and returns the factorial, if one exists
	public static int reverse(int start)
	{
		double i = 2;
		double j = start;
		int answer;

		while(j >= i)
		{
			j /= i;
			i++;
		}

		//return factorial, otherwise return 0
		if(j != 1)
		{
			answer  = 0;
		}
		else
		{
			answer = (int) i-1;
		}
		return answer;
	}

	//print formatted string with original number and answer
	static void print(int start, int factorial)
	{
		if(factorial == 0)
		{
			System.out.println(start + " = NONE");
		}
		else
		{
			System.out.println(start + " = " + factorial + "!");
		}
	}

	//driver
	public static void main(String[] args)
	{
		print(120, reverse(120));
		print(150, reverse(150));
		print(3628800, reverse(3628800));
		print(479001600, reverse(479001600));
		print(6, reverse(6));
		print(18, reverse(18));
	}
}
