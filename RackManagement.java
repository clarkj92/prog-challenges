/**
 * Created by JCAM6L on 6/6/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/5go843/20161205_challenge_294_easy_rack_management_1/
public class RackManagement
{

	public static void scrabble(String sInput, String sGoal)
	{
		char[] input = sInput.toCharArray();
		char[] goal = sGoal.toCharArray();
		char[] answer = new char[goal.length];
		boolean bAnswer = false;
		String sAnswer;

		for(int i = 0; i < goal.length; i++)
		{
			for(int j = 0; j < input.length; j++)
			{
				if(goal[i] == input[j])
				{
					answer[i] = input[j];
					input[j] = 0;
					break;
				}
			}
		}

		sAnswer = String.valueOf(answer);
		System.out.println(sAnswer);

		if(sAnswer.equals(sGoal))
		{
			bAnswer = true;
		}

		System.out.println("scabble(" + sInput + ", " + sGoal + ") -> " + bAnswer);
		System.out.println();
	}

	//driver
	public static void main(String[] args)
	{
		scrabble("ladilmy", "daily");
		scrabble("eerriin", "eerie");
		scrabble("orrpgma", "program");
		scrabble("orppgma", "program");
	}
}
