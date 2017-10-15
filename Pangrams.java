/**
 * Created by JCAM6L on 6/20/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/1pwl73/11413_challenge_139_easy_pangrams/
public class Pangrams
{
	static String sAlphabet = "abcdefghijklmnopqrstuvwxyz";
	static char[] cAlphabet = sAlphabet.toCharArray();
	static int[] alphabetCount= new int[26];

	//call the isPangram method on the input string, call the print method, and reset the alphabetCount array
	public static void find(String input)
	{
		boolean value = isPangram(input);
		print(input, value);
		resetAlphabetCount();
	}

	//determine if the input is a pangram
	public static boolean isPangram(String input)
	{
		char[] c = stringToCharArray(input);

		//if the input length is less than 26, it cannot contain every letter in the alphabet
		if(c.length < 26)
		{
			return false;
		}
		else
		{
			//find each letter in the input
			for(int i = 0; i < c.length; i++)
			{
				for(int j = 0; j < cAlphabet.length; j++)
				{
					if(c[i] == cAlphabet[j])
					{
						alphabetCount[j]++;
						break;
					}
				}
			}

			//if the input is missing any letter, return false
			for(int i = 0; i < alphabetCount.length; i++)
			{
				if(alphabetCount[i] == 0)
				{
					return false;
				}
			}
		}
		return true;
	}

	//convert a string to a char array
	public static char[] stringToCharArray(String input)
	{
		input = input.toLowerCase();
		String[] inputLetters = input.split("\\s+");
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < inputLetters.length; i ++)
		{
			sb.append(inputLetters[i]);
		}

		String newString = sb.toString();
		return newString.toCharArray();
	}

	//resets each value in the alphabetCount array to zero
	public static void resetAlphabetCount()
	{
		for(int i = 0; i < alphabetCount.length; i++)
		{
			alphabetCount[i] = 0;
		}
	}

	//print the input and boolean value and if true, print the count of each letter with a count greater than 1
	public static void print(String input, boolean value)
	{
		System.out.println(input + ": " + value);

		if(value)
		{
			for(int i = 0; i < alphabetCount.length; i++)
			{
				if(alphabetCount[i] > 1)
				{
					System.out.println(cAlphabet[i] + ": " + alphabetCount[i]);
				}
			}
			System.out.println();
		}
	}

	//driver
	public static void main(String[] args)
	{
		find("The quick brown fox jumps over the lazy dog");
		find("Pack my box with five dozen liquor jugs");
		find("Saxophones quickly blew over my jazzy hair");
	}
}
