/**
 * Created by JCAM6L on 5/15/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/341c03/20150427_challenge_212_easy_r%C3%B6varspr%C3%A5ket/
//for the purpose of this exercise
//a, e, i, o, u, and y are considered vowels.
public class Rovarspraket
{

	//convert string to char array
	public static void convertToChar(String s)
	{
		String strConsonants = "bcdfghjklmnpqrstvwxz";
		char[] consonants = strConsonants.toCharArray();
		char[] input = s.toCharArray();

		//call algorithm for converting the string
		checkArray(input, consonants);
	}

	//algorithm for converting the string
	public static  void checkArray(char[] c, char[] consonants)
	{
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < consonants.length; j++)
			{
				if (c[i] == consonants[j])
				{
					sb.append(c[i] + "o");
				}
			}

			sb.append(c[i]);
		}

		System.out.println(sb);
	}

	public static void main(String[] args)
	{
		convertToChar("hello! this is a test of the rovarspraket algorithm!");
		convertToChar("Jag talar Rövarspråket!");	//does not handle capital letters
		convertToChar("I'm speaking Robber's language!");	//does not handle capital letters
	}
}
