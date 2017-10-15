/**
 * Created by JCAM6L on 6/28/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/6k123x/20170629_challenge_321_intermediate_affine_cipher/
public class AffineCipher
{
	static String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");

	//boolean encode is true if you want to encode the sentence
	public static String cipher(String s, int a, int b, boolean encode)
	{
		s = s.toLowerCase();
		String[] sentence = s.split("\\s+");
		String[] newSentence = new String[sentence.length];

		if(encode)
		{
			for(int i = 0; i < sentence.length; i++)
			{
				newSentence[i] = cipherWord(sentence[i], a, b, true);
			}
		}
		else
		{
			for(int i = 0; i < sentence.length; i++)
			{
				newSentence[i] = cipherWord(sentence[i], a, b, false);
			}
		}

		return String.join(" ", newSentence);
	}

	//encode the string passed
	public static String cipherWord(String s, int a, int b, boolean encode)
	{
		int[] values;
		String[] word = s.split("");

		//get numerical values for each letter
		values = getValues(word);

		System.out.println("original word ");
		print(word);
		System.out.println();
		System.out.println();
		System.out.println("original values ");
		print(values);
		System.out.println();

		//manipulate the values
		if(encode) //decode the string passed
		{
			for(int i = 0; i < values.length; i++)
			{
				print(values);
				System.out.println();

				values[i] *= a;
				print(values);
				System.out.println("(* " + a + ")");

				values[i] += b;
				print(values);
				System.out.println("(+ " + b + ")");
				values[i] %= 26;
				print(values);
				System.out.println("(mod 26)");

				//not sure if this is necessary
				if(values[i] > 23)
				{
					values[i] /= 26;
					print(values);
					System.out.println("(/ 26)");
				}
				System.out.println();
			}
		}
		else //decode the string passed - DOES NOT WORK
		{
			for(int i = 0; i < values.length; i++)
			{
				print(values);
				System.out.println();

				values[i] *= a;
				print(values);
				System.out.println("(* " + a + ")");

				values[i] += b;
				print(values);
				System.out.println("(+ " + b + ")");
				System.out.println();
			}
		}

		System.out.println();
		System.out.println("new values ");
		print(values);
		System.out.println();

		//get the new letters based on the new values
		//word = getLetters(values);

		System.out.println();
		System.out.println("new word ");
		print(word);

		return String.join("", word);
	}

	//get numerical values for each letter
	public static int[] getValues(String[] word)
	{
		int[] values = new int[word.length];

		for(int i = 0; i < word.length; i++)
		{
			for(int j = 0; j < alphabet.length; j++)
			{
				if(word[i].equals(alphabet[j]))
				{
					values[i] = j;
				}
			}
		}

		return values;
	}

	//get letters based on each value
	public static String[] getLetters(int[] values)
	{
		String[] word = new String[values.length];

		for(int i = 0; i < values.length; i++)
		{
			word[i] = alphabet[values[i]];
		}

		return word;
	}

	//OVERLOADED - print string array
	static void print(String[] s)
	{
		for(int i = 0; i < s.length; i++)
		{
			System.out.print(s[i] + " ");
		}
	}

	//OVERLOADED - print int array
	static void print(int[] ints)
	{
		for(int i = 0; i < ints.length; i++)
		{
			System.out.print(ints[i] + " ");
		}
	}

	//driver
	public static void main(String[] args)
	{
		cipher("foobar", 3, 2, true);
		//cipher("rssfcb", 3, 2, false);
	}
}