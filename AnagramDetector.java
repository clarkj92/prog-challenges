/**
 * Created by JCAM6L on 6/8/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/52enht/20160912_challenge_283_easy_anagram_detector/
public class AnagramDetector
{
	public static void detectAnagram(String s1, String s2)
	{
		//remove spaces and special characters and make every letter lowercase
		String s1N = s1.replaceAll("[^a-zA-Z]", "").toLowerCase();
		String s2N = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();
		char[] c1 = s1N.toCharArray();
		char[] c2 = s2N.toCharArray();

		print(s1, s2, isAnagram(c1, c2));
	}

	public static boolean isAnagram(char[] c1, char[] c2)
	{
		boolean answer = true;
		char[] c3 = new char[c1.length];

		if(c1.length != c2.length)
		{
			answer =  false;
		}
		else
		{
			for(int i = 0; i < c1.length; i++)
			{
				for(int j = 0; j < c2.length; j++)
				{
					if(c1[i] == c2[j])
					{
						c3[i] = c1[i];
						c2[j] = 0;
					}
				}
			}
		}

		for(int i = 0; i < c3.length; i++)
		{
			if(c3[i] == 0)
			{
				//answer = false;
			}
			else
			{
				answer = true;
			}
		}

		return answer;
	}

	public static void print(String s1, String s2, boolean b)
	{
		String answer;

		if(b)
		{
			answer = s1 + " is an anagram of " + s2;
		}
		else
		{
			answer = s1 + " is NOT an anagram of " + s2;
		}
		System.out.println(answer);
	}

	public static void main(String[] args)
	{
		detectAnagram("Clint Eastwood", "Old West Action");
		detectAnagram("wisdom", "mid sow");
		detectAnagram("Seth Rogan", "Gathers No");
		detectAnagram("Reddit", "Eat Dirt");
		detectAnagram("Schoolmaster", "The classroom");
		detectAnagram("Astronomers", "Moon starer");
		detectAnagram("Vacation Times", "I'm Not as Active");
		detectAnagram("Dormitory", "Dirty Rooms");
	}
}
