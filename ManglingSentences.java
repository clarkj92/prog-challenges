/**
 * Created by JCAM6L on 6/27/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/3aqvjn/20150622_challenge_220_easy_mangling_sentences/
public class ManglingSentences
{
	static String[] alphabet = "abcdefghijklmnopqrstuvwxyz-',".split("");

	//splits the string into words separated by spaces,
	//calls the sort method on each word,
	//returns the sorted words in a sentence
	public static String mangle(String s)
	{
		String[] sentence = s.split("\\s+");
		String[] newSentence = new String[sentence.length];
		String returnSentence;

		for(int i = 0; i < sentence.length; i++)
		{
			newSentence[i] = sort(sentence[i]);
		}

		returnSentence = String.join(" ", newSentence);
		return returnSentence;
	}

	//sorts the string from a-z
	public static String sort(String s)
	{
		String[] word = s.split("");
		String[] sortedWord = new String[word.length];
		String returnWord;
		int index = 0;

		for(int i = 0; i < alphabet.length; i++)
		{
			for(int j = 0; j < word.length; j++)
			{
				if(Character.isUpperCase(word[j].charAt(0)))
				{
					if(alphabet[i].toUpperCase().equals(word[j]))
					{
						if(j > 0)
						{
							sortedWord[0] = sortedWord[0].toUpperCase();
							sortedWord[index] = word[j].toLowerCase();
						}
						else
						{
							sortedWord[index] = word[j];
						}
						index++;
					}
				}
				else if(alphabet[i].equals(word[j]))
				{
					sortedWord[index] = word[j];
					index++;
				}
			}
		}

		returnWord = String.join("", sortedWord);
		return returnWord;
	}

	//driver
	public static void main(String[] args)
	{
		//sample input 1
		String s = "This challenge doesn't seem so hard";
		System.out.println(s);
		System.out.println(mangle(s));
		System.out.println();

		//sample input 2
		s = "There are more things between heaven and earth, Horatio, than are dreamt of in your philosophy";
		System.out.println(s);
		System.out.println(mangle(s));
		System.out.println();

		//challenge input 1
		s = "Eye of Newt, and Toe of Frog, Wool of Bat, and Tongue of Dog";
		System.out.println(s);
		System.out.println(mangle(s));
		System.out.println();

		//challenge input 2
		s = "Adder's fork, and Blind-worm's sting, Lizard's leg, and Howlet's wing";
		System.out.println(s);
		System.out.println(mangle(s));
		System.out.println();

		//challenge input 3
		s = "For a charm of powerful trouble, like a hell-broth boil and bubble";
		System.out.println(s);
		System.out.println(mangle(s));
		System.out.println();
	}
}