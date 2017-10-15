import java.util.ArrayList;

/**
 * Created by JCAM6L on 6/6/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/5aemnn/20161031_challenge_290_easy_kaprekar_numbers/
//for the sake of simplicity, I only split the squared number down the middle for comparison
//a true Kaprekar number does not have this requirement
public class KaprekarNumbers
{

	public static void calculate(int start, int end)
	{
		int square;
		int length;
		int firstLength;
		int secondLength;
		int first;
		int second;
		double dFirstLength;
		double dSecondLength;
		char[] cSquare;
		char[] cFirst;
		char[] cSecond;
		ArrayList<Integer> answers = new ArrayList<Integer>();

		for(int i = start; i < end; i++)
		{
			square = i*i;

			if(square < 10)
			{

			}
			else
			{
				cSquare = toChar(square);
				length = cSquare.length;

				//if there are an even amount of integers in the number (ie 16 or 2500)
				if(length % 2 == 0)
				{
					firstLength = length / 2;
					secondLength = length / 2;
				}
				else	//if there are an odd amount of integers in the number (ie 144 or 256)
				{
					dFirstLength = (length / 2);
					dSecondLength = (length / 2) + 0.5;
					firstLength = (int) dFirstLength;
					secondLength = (int) dSecondLength+1;
				}

				cFirst = new char[firstLength];
				cSecond = new char[secondLength];

				for(int j = 0; j < firstLength; j++)
				{
					cFirst[j] = cSquare[j];
				}

				for(int k = 0; k < secondLength; k++)
				{
					cSecond[k] = cSquare[firstLength];
					firstLength++;
				}


				first = toInt(cFirst);
				second = toInt(cSecond);

				if(first + second == i)
				{
					answers.add(i);
				}
			}
		}

		printList(answers);
	}

	//convert integer to char array
	public static char[] toChar(int num)
	{
		return String.valueOf(num).toCharArray();
	}

	//convert char array to integer
	public static int toInt(char[] c)
	{
		return Integer.parseInt(new String(c));
	}

	//print array list
	public static void printList(ArrayList<Integer> nums)
	{
		for(int i : nums)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args)
	{
		//calculate(1, 50);
		//calculate(2, 100);
		calculate(101, 9000);
	}
}
