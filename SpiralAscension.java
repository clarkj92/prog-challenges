/**
 * Created by JCAM6L on 6/19/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/6i60lr/20170619_challenge_320_easy_spiral_ascension/
public class SpiralAscension
{
	//populate the 2-D array with incrementing values following spiral pattern
	public static void spiral(int num)
	{
		int[][] grid = new int[num][num];
		int square = num * num;
		int xMax = num-1;
		int yMax = num-1;
		int xMin = 0;
		int yMin = 0;
		int count = 1;
		int i;

		while(count < square+1)
		{
			//move right
			for(i = xMin; i < xMax+1; i++)
			{
				grid[xMin][i] = count;
				count++;
			}

			//move down
			for(i = yMin+1; i < yMax+1; i++)
			{
				grid[i][yMax] = count;
				count++;
			}

			//move left
			for(i = xMax-1; i > yMin-1; i--)
			{
				grid[xMax][i] = count;
				count++;
			}

			//move up
			for(i = yMax-1; i > xMin; i--)
			{
				grid[i][yMin] = count;
				count++;
			}

			xMax--;
			yMax--;
			xMin++;
			yMin++;
		}

		print(grid);
	}

	//print the 2-D array in grid form
	public static void print(int[][] grid)
	{
		int num;
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[0].length; j++)
			{
				num = grid[i][j];
				if(num > 99)
				{
					System.out.print(grid[i][j] + " ");
				}
				else if(num < 10)
				{
					System.out.print(grid[i][j] + "   ");
				}
				else
				{
					System.out.print(grid[i][j] + "  ");
				}
			}
			System.out.println();
		}
	}

	//driver
	public static void main(String[] args)
	{
		int num = 4;
		System.out.println("starting number: " + num);
		System.out.println("final number: " + num*num);
		spiral(num);
		System.out.println();

		num = 5;
		System.out.println("starting number: " + num);
		System.out.println("final number: " + num*num);
		spiral(num);
		System.out.println();

		num = 12;
		System.out.println("starting number: " + num);
		System.out.println("final number: " + num*num);
		spiral(num);
		System.out.println();

		num = 20;
		System.out.println("starting number: " + num);
		System.out.println("final number: " + num*num);
		spiral(num);
		System.out.println();
	}
}
