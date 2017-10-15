/**
 * Created by JCAM6L on 7/20/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/1fcpnx/053013_challenge_126_intermediate_perfect_pth/
public class PerfectPthPowers
{
	static int x;
	static int p;

	//finds the smallest perfect power
	public static void findPower(double desired)
	{
		boolean solved = false;
		double answer;
		x = 0;
		p = 0;

		for(int i = 2; i < desired+1; i++)
		{
			if(solved)
			{
				break;
			}

			for(int j = 1; j < desired; j++)
			{
				answer = Math.pow(i, j);

				if(answer > desired)
				{
					break;
				}
				else if(answer == desired)
				{
					x = i;
					p = j;
					solved = true;
					break;
				}
			}
		}
	}

	//prints the answer and runtime of each call
	public static void formatOutput(double desired)
	{
		long startTime = System.currentTimeMillis();
		findPower(desired);
		System.out.print(desired);
		System.out.print(" (" + x + "^" + p + ")");
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println();
		System.out.println(totalTime + "ms");
		System.out.println();
	}

	//driver
	public static void main(String[] args)
	{
		formatOutput(17);
		formatOutput(25);
		formatOutput(1073741824);
	}
}