import java.util.ArrayList;

/**
 * Created by JCAM6L on 6/27/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/36cyxf/20150518_challenge_215_easy_sad_cycles/
public class SadCycles
{
	static int cycles = 1;
	static ArrayList<Integer> sums = new ArrayList<Integer>();

	public static void raisePower(int number, int power)
	{
		if(cycles < 20)
		{
			if(number == 1)
			{
				System.out.println("end reached!");
			}
			else
			{
				ArrayList<Integer> digits = new ArrayList<Integer>();
				ArrayList<Integer> squares = new ArrayList<Integer>();
				int sum = 0;

				while(number > 0)
				{
					digits.add(number % 10);
					number /= 10;
				}

				for(int d : digits)
				{
					int i = (int) Math.pow((double) d, (double) power);
					squares.add(i);
					sum += i;
				}

				System.out.print("cycles: " + cycles);
				System.out.println();
				System.out.print("digits: ");
				print(digits);
				System.out.println();
				System.out.print("squares: ");
				print(squares);
				System.out.println();
				System.out.println("sum: " + sum);
				System.out.println();

				sums.add(sum);
				cycles++;
				raisePower(sum, power);
			}
		}
	}

	public static void print(ArrayList<Integer> digits)
	{
		for(int d : digits)
		{
			System.out.print(d + " ");
		}
	}

	//driver
	public static void main(String[] args)
	{
		raisePower(12, 2);
		print(sums);
	}
}
