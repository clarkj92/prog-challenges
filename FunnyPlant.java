/**
 * Created by JCAM6L on 6/9/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/3twuwf/20151123_challenge_242_easy_funny_plant/
//not finished
public class FunnyPlant
{

	public static int calculate(int people, int plants)
	{
		int weeks = 0;

		while(plants < people)
		{



			weeks++;
		}


		return weeks;
	}

	//driver
	public static void main(String[] args)
	{
		calculate(15, 1);
		//calculate(200, 15);
		//calculate(50000, 1);
		//calculate(150000, 250);
	}
}
