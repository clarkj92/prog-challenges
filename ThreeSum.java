import java.util.ArrayList;

/**
 * Created by JCAM6L on 7/10/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/6melen/20170710_challenge_323_easy_3sum/
public class ThreeSum
{
	static ArrayList<String> answers = new ArrayList<String>();

	public static void sort(int[] nums)
	{
		int a = 0, b = 0, c = 0;

		for(int i = 0; i < nums.length-2; i++)
		{
			a = nums[i];

			for(int j = i+1; j < nums.length-1; j++)
			{
				b = nums[j];

				for(int k = j+1; k < nums.length; k++)
				{
					c = nums[k];

					//System.out.println(a + " " + b + " " + c);

					if(a + b + c == 0)
					{
						//System.out.println("new solution: " + a + " " + b + " " + c);
						answers.add(a + " " + b + " " + c);
					}
				}
			}
		}

		check(answers);
	}

	public static void check(ArrayList<String> answers)
	{

	}

	//driver
	public static void main(String[] args)
	{
		//sort(new int[]{9, -6, -5, -9, 8, -3});
		sort(new int[]{9, -6, -5, 9, 8, 3, -4, 8, 1, 7, -4, 9, -9, 1, 9, -9, 9, 4, -6, -8});
	}
}
