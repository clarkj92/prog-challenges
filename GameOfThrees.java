/**
 * Created by JCAM6L on 5/15/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/3r7wxz/20151102_challenge_239_easy_a_game_of_threes/
public class GameOfThrees
{

	//algorithm for getting to 1
	public static void playGame(int start)
	{
		int i = start;
		int count = 0;

		System.out.println("starting number: " + start);

		while(i != 1)
		{
			if(i == 1)	//base case
			{
				System.out.println(i);
				break;
			}
			else if(i % 3 == 0)	//if the number is divisible by 3
			{
				System.out.println(i + " /3");
				i = i / 3;
			}
			else if((i+1) % 3 == 0)	//if the number+1 is divisible by 3
			{
				System.out.println(i + " +1");
				i = i + 1;
			}
			else if((i-1) % 3 == 0)	//if the number-1 is divisible by 3
			{
				System.out.println(i + " -1");
				i = i - 1;
			}

			count++;
		}

		System.out.println("You're done!");
		System.out.println("It took " + count + " calculations");
		System.out.println();
	}

	//main method
	public static void main(String[] args)
	{
		playGame(100);
		playGame(1000);
		playGame(432);
	}
}
