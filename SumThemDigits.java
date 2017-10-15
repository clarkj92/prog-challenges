/**
 * Created by JCAM6L on 6/14/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/1berjh/040113_challenge_122_easy_sum_them_digits/
public class SumThemDigits
{
	static String sStart;
	static String sAnswer;
	static int iMiddle;
	static int iAnswer;

	//convert the integer to an int array and then sums the values
	//recursively calls itself until the length of the integer is 1, meaning the answer has been found
	public static int sumDigits(int i)
	{
		sStart = String.valueOf(i);

		if(sStart.length() > 1)
		{
			iMiddle = 0;
			iAnswer = 0;
			int[] aMiddle = toIntArray(i);

			for(int j = 0; j < aMiddle.length; j++)
			{
				iMiddle += aMiddle[j];
			}

			int[] aAnswer = toIntArray(iMiddle);

			for(int j = 0; j < aAnswer.length; j++)
			{
				iAnswer += aAnswer[j];
			}

			sumDigits(iAnswer);
		}
		else
		{}
		return iAnswer;
	}

	//convert an integer to an int array
	public static int[] toIntArray(int i)
	{
		String temp = Integer.toString(i);
		int[] intArray = new int[temp.length()];
		for(int j = 0; j < temp.length(); j++)
		{
			intArray[j] = temp.charAt(j) - '0';
		}
		return intArray;
	}

	//driver
	public static void main(String[] args)
	{
		int i = 31337;
		System.out.println("Starting number: " + i + " answer: " + sumDigits(i));

		i = 1073741824;
		System.out.println("Starting number: " + i + " answer: " + sumDigits(i));
	}
}
