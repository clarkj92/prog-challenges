import java.util.ArrayList;

/**
 * Created by JCAM6L on 8/15/2017.
 */

//not finished
//mcnugget numbers are numbers that are the sum of any number of 6, 9, or 20-nugget meals
//find all non-mcnugget numbers
//https://www.reddit.com/r/dailyprogrammer/comments/qulnf/3132012_challenge_23_intermediate/
public class McNuggetNumbers
{
	//driver
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<>();

		//it has been concluded that the largest non-mcnugget number is 43
		for(int i = 1; i < 43; i++)
		{
			if(i % 6 != 0)
			{
				numbers.add(i);
			}
		}

		System.out.println("numbers");
		for(int n : numbers)
		{
			System.out.println(n);
		}
	}
}

//multiples of 6
//multiples of 9
//multiples of 15 (6+9)
//multiples of 20
//multiples of 21 (6+6+9)

//this is the full list of numbers
//6
//9
//12 (6*2)
//15 (6+9)
//18 (6*3 or 9*2)
//20
//21 (12+9 or 15+6)
//24 (6*4 or 6+9+9)
//26 (20+6)
//27 (9*3)
//29 (20+9)
//30 (6*5 or 15*2)
//32 (26+6)
//33 (24+9)
//35 (26+9)
//36 (6*6 or 9*4 or 30+6)
//38 (32+6)
//39 (30+9)
//40 (20*2)
//41 (35+6)
//42 (6*7 or 21*2)
