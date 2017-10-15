
/**
 * Created by JCAM6L on 6/5/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/6fe9cv/20170605_challenge_318_easy_countdown_game_show/
//not sure how to populate array with all possible permutations of signs
public class Countdown
{
	static int[][] signs;

	//controls the flow of the algorithm
	public static void calculate(int[] nums)
	{
		int numsLength = nums.length;
		signs = new int[numsLength-2][4];

		fillArray(signs);
		print(signs);
	}

	public static void fillArray(int[][] signs)
	{
		for(int i = 0; i < signs.length; i++)
		{
			int sign = 0;

			for(int j = 0; j < signs[0].length; j++)
			{
				signs[i][j] = sign;
				sign++;
			}
		}
	}

	public static String getSign(int i)
	{
		String s;

		if(i == 1)
		{
			s = " + ";
		}
		else if(i == 2)
		{
			s = " - ";
		}
		else if(i == 3)
		{
			s = " * ";
		}
		else
		{
			s = " / ";
		}

		return s;
	}

	public static void print(int[][] signs)
	{
		for(int i = 0; i < signs.length; i++)
		{
			System.out.println();
			for(int j = 0; j < signs[0].length; j++)
			{
				System.out.print(signs[i][j]);
			}
		}
	}

	//driver
	public static void main(String[] args)
	{
		calculate(new int[]{1, 3, 7, 6, 8, 3, 250});
		//calculate(new int[]{25, 100, 9, 7, 3, 7, 881});
		//calculate(new int[]{6, 75, 3, 25, 50, 100, 952});
	}
}
