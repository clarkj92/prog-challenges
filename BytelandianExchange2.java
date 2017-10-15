import java.util.ArrayList;

/**
 * Created by JCAM6L on 7/25/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/19rkqr/030613_challenge_121_intermediate_bytelandian/
public class BytelandianExchange2
{
	public static int[][] master;
	public static ArrayList<Integer> coins = new ArrayList<>();
	public static ArrayList<Integer> coinsKeep = new ArrayList<>();
	public static int iteration = 0;

	//fill the master array
	public static void fillMaster()
	{
		for(int i = master.length-1; i > -1; i--)
		{
			if(master[i][0] == 0)
			{
				master[i][0] = i/2;
				master[i][1] = i/3;
				master[i][2] = i/4;
				master[i][3] = master[i][0] + master[i][1] + master[i][2];
			}
		}
	}

	//add the 3 coins from 1 larger coin
	public static void addCoins(int n)
	{
		coins.add(master[n][0]);
		coins.add(master[n][1]);
		coins.add(master[n][2]);
	}

	//checks the value of the current coin
	//if the coin can be broken down into coins of greater value, do so
	public static void checkValue(int n)
	{
		int newValue = 0;
		int current;

		System.out.println("start: " + n);
		for(int i = 0; i < master[0].length-1; i++)
		{
			current = master[n][i];
			newValue += master[current][3];
			System.out.println(current + ": " + master[current][3]);
		}

		System.out.println("total: " + newValue);
		System.out.println();

		if(newValue > master[n][3])
		{
			addCoins(n);
		}
		else
		{
			coinsKeep.add(n);
		}

		iteration++;

		if(coins.size() > iteration)
		{
			if (coins.get(iteration) > 3)
			{
				checkValue(coins.get(iteration));
			}
		}
	}

	//prints the contents of the master array
	public static void printMaster()
	{
		for(int i = 0; i < master.length; i++)
		{
			System.out.print(i + ": ");
			for(int j = 0; j < master[0].length-1; j++)
			{
				System.out.print(master[i][j] + " ");
			}
			System.out.print(" value = " + master[i][3]);
			System.out.println();
		}
	}

	//driver
	public static void main(String[] args)
	{
		int length = 1001;
		int depth = 4;	//must be 4
		int start = 1000;
		int currentValue;
		int totalValue = 0;
		int coinsCount = 0;
		coins.add(start);
		
		master = new int[length][depth];
		fillMaster();
		//printMaster();
		
		System.out.println();
		checkValue(start);

		System.out.println("starting coin value: " + start);
		System.out.println();

		for(int c : coinsKeep)
		{
			coinsCount++;
			currentValue = master[c][3];
			totalValue += currentValue;
			System.out.println("coin: " + c + "  value: " + currentValue);
		}

		System.out.println();
		System.out.println("coins: " + coinsCount);
		System.out.println("value: " + totalValue);
	}
}