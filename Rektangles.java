/**
 * Created by JCAM6L on 5/26/2017.
 */

//have not implemented heigth or width manipulation.
//passing these parameters will not affect anything
//https://www.reddit.com/r/dailyprogrammer/comments/4tetif/20160718_challenge_276_easy_recktangles/
public class Rektangles
{

	public static void shitpost(String input, int height, int width)
	{
		String upper = input.toUpperCase();
		String spaces = " ";
		char[] letters = upper.toCharArray();
		int j = letters.length - 2;

		for(int i = 0; i < letters.length-2; i++)
		{
			spaces += "  ";
		}

		for(int i = 0; i < letters.length; i++)
		{
			System.out.print(letters[i] + " ");
		}

		System.out.println();

		for(int i = 1; i < letters.length-1; i++)
		{
			System.out.println(letters[i] + spaces + letters[j]);
			j--;
		}

		for(int i = letters.length-1; i > -1; i--)
		{
			System.out.print(letters[i] + " ");
		}
	}

	public static void main(String[] args)
	{
		shitpost("topminds", 1, 1);
	}
}
