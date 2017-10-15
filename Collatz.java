/**
 * Created by JCAM6L on 5/30/2017.
 */

//the Collatz Conjecture is another name for the 3x+1 problem
//the conjecture is that no matter what number you start with, you will always eventually reach 1
//https://www.reddit.com/r/dailyprogrammer/comments/6e08v6/20170529_challenge_317_easy_collatz_tag_system/
public class Collatz
{

	//demonstrates the original Collatz sequence (aka 3x+1 problem)
	public static void theory(int i)
	{
		System.out.println("starting number: " + i);

		while(i != 1)
		{
			//if the input is even
			if(i % 2 == 0)
			{
				i /= 2;
			}
			else	//if the input is odd
			{
				i = (i*3) + 1;
			}

			System.out.println(i);
		}
	}

	//implement the Collatz conjecture using a 2-tag system
	public static void implement(String s)
	{
		String b;
		boolean onlyLetters = s.matches("[a-c]+");

		System.out.println("starting string: " + s);

		if(onlyLetters)
		{
			//continue until there is only one letter remaining, should always be "a"
			while(s.length() > 1)
			{
				//set b equal to the first letter in the sequence
				b = String.valueOf(s.charAt(0));

				s = removeFirstTwoLetters(s);
				s = append(s, b);

				System.out.println(s);
			}
		}
		else
		{
			System.out.println("ERROR: string must contain only letters a, b, or c");
		}
	}

	//returns the original string minus the first two letters
	public static String removeFirstTwoLetters(String s)
	{
		return s.substring(2);
	}

	//appends the string, according to the rules
	public static String append(String s, String b)
	{
		if(b.equals("a"))
		{
			s += "bc";
		}
		else if(b.equals("b"))
		{
			s += "a";
		}
		else if(b.equals("c"))
		{
			s += "aaa";
		}

		return s;
	}

	//driver
	public static void main(String[] args)
	{
		//theory(50);
		//implement("aaa");
		implement("aaaaaaa");
	}
}
