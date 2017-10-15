import java.util.ArrayList;

/**
 * Created by JCAM6L on 6/2/2017.
 */

////this is really ugly, but it seems to work
//https://www.reddit.com/r/dailyprogrammer/comments/56tbds/20161010_challenge_287_easy_kaprekars_routine/
public class KaprekarRoutine
{
	//directs the program to pad zeroes (if needed), then find the largest digit
	public static void calculate(int num)
	{
		String oldNumber = String.valueOf(num);
		char[] newNumber;
		int length = oldNumber.length();

		if(length < 4)
		{
			newNumber = padZeroes(oldNumber, 4-length);
		}
		else
		{
			newNumber = String.valueOf(num).toCharArray();
		}

		System.out.println("old number: " + oldNumber);
		System.out.println("new number: " + String.valueOf(newNumber));
		System.out.println("largest digit: " + findLargestDigit(newNumber));
		System.out.println("descending number: " + toString(descending(newNumber)));
	}

	//adds zeroes to the front of the number
	public static char[] padZeroes(String oldNumber, int length)
	{
		char[] newNumber = new char[oldNumber.length() + length];
		char[] original = oldNumber.toCharArray();
		int pickup = 0;
		int j = 0;

		for(int i = 0; i < length; i++)
		{
			newNumber[i] = '0';
			pickup++;
		}


		for(int i = pickup; i < newNumber.length; i++)
		{
			newNumber[i] = original[j];
			j++;
		}

		return newNumber;
	}

	//finds the largest digit in the provided char array
	//converts each char to an int and then compares
	//returns answer as char
	public static int findLargestDigit(char[] number)
	{
		int largest = 0;
		int i;

		for(char n : number)
		{
			i = Character.getNumericValue(n);

			if(i > largest)
			{
				largest = i;
			}
		}

		return largest;
	}

	//orders char array into descending order and outputs as int array
	//"bonus 1" challenge
	public static int[] descending(char[] number)
	{
		int largest;
		int index;
		int[] iNumber = new int[number.length];
		int[] i2 = new int[number.length];
		ArrayList<Integer> aNumber = new ArrayList<Integer>();

		for(int i = 0; i < number.length; i++)
		{
			iNumber[i] = Character.getNumericValue(number[i]);
			//System.out.println(iNumber[i]);
		}

		for(int i = 0; i < iNumber.length; i++)
		{
			largest = 0;
			index = 0;

			for(int j = 0; j < iNumber.length; j++)
			{
				if (iNumber[j] > largest)
				{
					largest = iNumber[j];
					index = j;
				}
			}

			iNumber[index] = 0;
			i2[i] = largest;
		}

		return i2;
	}

	//converts int array to a string
	public static String toString(int[] number)
	{
		String s = "";
		for(int n : number)
		{
			s += n;
			//System.out.print(n);
		}

		return s;
	}

	public static void main(String[] args)
	{
		calculate(120);
	}
}
