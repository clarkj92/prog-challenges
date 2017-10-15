/**
 * Created by JCAM6L on 5/11/2017.
 */

public class FizzBuzz
{

	public static void FB()
	{
		String answer;

		for(int i = 1; i < 101; i++)
		{

			if(i % 15 == 0)
			{
				answer = "FizzBuzz";
			}
			else if(i % 3 == 0)
			{
				answer = "Fizz";
			}
			else if(i % 5 == 0)
			{
				answer = "Buzz";
			}
			else
			{
				answer = i + "";
			}

			System.out.println(answer);
		}
	}

	public static void main(String[] args)
	{
		FB();
	}
}
