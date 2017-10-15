/**
 * Created by JCAM6L on 6/29/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/45w6ad/20160216_challenge_254_easy_atbash_cipher/
public class AtbashCipher
{
	static String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
	static String[] cipher;

	//generates the cipher based on the alphabet
	public static void generateCipher()
	{
		int i = 0;
		cipher = new String[alphabet.length];

		for(int j = alphabet.length; j > 0; j--)
		{
			cipher[i] = alphabet[j-1];
			i++;
		}

		print(alphabet);
		print(cipher);
	}

	//uses the alphabet and cipher arrays to manipulate the string
	public static void manipulate(String s, boolean encode)
	{
		String[] word = s.split("");
		String[] newWord = new String[word.length];
		String[] original = alphabet;
		String[] code = cipher;

		//if you want to decode a message
		if(!encode)
		{
			original = cipher;
			code = alphabet;

		}

		//loops through each letter and replaces
		for(int i = 0; i < word.length; i++)
		{
			for(int j = 0; j < original.length; j++)
			{
				if(word[i].equals(original[j]))
				{
					newWord[i] = code[j];
					break;
				}
				else
				{
					newWord[i] = word[i];
				}
			}
		}

		print(word);
		print(newWord);
	}

	//prints the contents of the array
	public static void print(String[] s)
	{
		for(int i = 0; i < s.length; i++)
		{
			System.out.print(s[i]);
		}

		System.out.println();
	}

	//driver
	public static void main(String[] args)
	{
		generateCipher();
		System.out.println();

		manipulate("foobar", true);
		System.out.println();

		manipulate("wizard", true);
		System.out.println();

		manipulate("/r/dailyprogrammer", true);
		System.out.println();

		manipulate("gsrh rh zm vcznkov lu gsv zgyzhs xrksvi", false);
	}
}