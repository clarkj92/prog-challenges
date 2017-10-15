/**
 * Created by JCAM6L on 5/15/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/1ystvb/022414_challenge_149_easy_disemvoweler/
public class Disemvoweler
{

	//initializes the vowel string and converts to char array
	//calls the disemvowel method
	public static void start(String s)
	{
		String strVowels = "aeiou";
		char[] vowels = strVowels.toCharArray();
		char[] input = s.toCharArray();
		System.out.println("Original String: " + s);
		disemvowel(input, vowels);
	}

	//builds two new strings
	// one being the original string with the vowels removed, the second containing all the vowels removed
	public static void disemvowel(char[] input, char[] vowels)
	{
		StringBuilder c = new StringBuilder();
		StringBuilder v = new StringBuilder();
		boolean contains;

		for(int i = 0; i < input.length; i++)
		{
			contains = false;

			for(int j = 0; j < vowels.length; j++)
			{
				if(input[i] == vowels[j])
				{
					v.append(input[i]);
					contains = true;
					break;
				}
			}

			if(!contains)
			{
				c.append(input[i]);
			}
		}

		System.out.println("After Disemvowel: " + c);
		System.out.println("Vowels Removed: " + v);
	}

	//driver
	public static void main(String[] args)
	{
		start("two drums and a cymbal fall off a cliff");
	}
}
