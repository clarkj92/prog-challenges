/**
 * Created by JCAM6L on 12/18/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/7j33iv/20171211_challenge_344_easy_baumsweet_sequence/
public class BaumSweetSequence
{
	//returns 0 if there is an odd sequence of 0s, otherwise 1
	public static int getSequence(int num)
	{
		int count = 0;
		String s = Integer.toBinaryString(num);
		char[] c = s.toCharArray();

		for (int i = 0; i < c.length; i++)
		{
			if (c[i] == '0')
			{
				count++;
			}
			else
			{
				if (count > 0 && (count % 2 != 0))
				{
					break;
				}
				count = 0;
			}
		}

		return Math.abs((count % 2) - 1);
	}

	public static void main(String[] args)
	{
		for(int i = 0; i < 21; i++)
		{
			System.out.print(getSequence(i) + ", ");
		}
	}
}
