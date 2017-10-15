/**
 * Created by JCAM6L on 6/14/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/1berjh/040113_challenge_122_easy_sum_them_digits/
public class SumThemDigits_Rework
{
	static int persistence;

	//returns the sum the digits in the integer
	public static int sumDigits(int n)
	{
		int answer = 0;

		if(n > 9)
		{
			while(n > 0)
			{
				answer += n % 10;
				n /= 10;
			}

			if(answer > 9)
			{
				persistence++;
				answer = sumDigits(answer);
			}
		}
		return answer;
	}

	//driver
	public static void main(String[] args)
	{
		int i = 31337;
		persistence = 1;
		System.out.println("starting number: " + i + " answer: " + sumDigits(i));
		System.out.println("persistence: " + persistence);
		System.out.println();

		i = 1073741824;
		persistence = 1;
		System.out.println("starting number: " + i + " answer: " + sumDigits(i));
		System.out.println("persistence: " + persistence);
	}
}
