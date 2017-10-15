/**
 * Created by JCAM6L on 5/25/2017.
 */

//not anywhere close to being done
//https://www.reddit.com/r/dailyprogrammer/comments/6coqwk/20170522_challenge_316_easy_knights_metric/
public class KnightsMetric
{

	static int[][] moves;

	public static void defineMoves()
	{
		moves = new int[8][2];

		moves[0][0] = -2;
		moves[0][1] = -1;
		moves[1][0] = -2;
		moves[1][1] = 1;

		moves[2][0] = -1;
		moves[2][1] = -2;
		moves[3][0] = -1;
		moves[3][1] = 2;

		moves[4][0] = 1;
		moves[4][1] = -2;
		moves[5][0] = 1;
		moves[5][1] = 2;

		moves[6][0] = 2;
		moves[6][1] = -1;
		moves[7][0] = 2;
		moves[7][1] = 1;
	}

	public static int navigate(int xStart, int yStart, int xGoal, int yGoal)
	{
		int numMoves = 0;
		int rows = moves[0].length;
		int cols = moves.length;

		defineMoves();

		for(int i = 0; i < cols; i++)
		{
			if(moves[i][0] == xGoal)
			{
				for(int j = 0; j < rows; j++)
				{
					if(moves[i][j] == yGoal)
					{
						break;
					}
				}
			}

			numMoves++;
		}

		return numMoves;

	}

	public static void main(String[] args)
	{
		navigate(0, 0, 3, 7);
	}
}
