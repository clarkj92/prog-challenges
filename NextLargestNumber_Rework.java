/**
 * Created by JCAM6L on 6/30/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/67q3s6/20170426_challenge_312_intermediate_next_largest/
//not finished
public class NextLargestNumber_Rework
{
	public static void findNext(int n)
	{
		int length = String.valueOf(n).length();
		int[] number = new int[length];

		for(int i = length-1; i > -1; i--)
		{
			number[i] = n % 10;
			n /= 10;
		}

		print(number);

		for(int j = length-1; j > 0; j--)
		{
			if(number[j-1] < number[j])
			{
				int lowest = number[j];
				System.out.println(lowest);
				for(int k = j+1; k < length; k++)
				{
					if(number[k] < lowest)
					{
						lowest = number[k];
						System.out.println(lowest);
					}
				}


				/*
				int temp = number[j-1];
				number[j-1] = number[j];
				number[j] = temp;
				*/
				break;
			}
		}

		print(number);
	}



	public static void print(int[] n)
	{
		for(int i = 0; i < n.length; i++)
		{
			System.out.print(n[i] + " ");
		}
		System.out.println();
	}

	//driver
	public static void main(String[] args)
	{
		//findNext(321045);
		System.out.println();
		findNext(123465);
	}
}
