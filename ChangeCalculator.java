/**
 * Created by JCAM6L on 6/20/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/17f3y2/012813_challenge_119_easy_change_calculator/
public class ChangeCalculator
{
	//calculate the least number of coins to reach the total amount
	public static void calculate(double total)
	{
		int amount;
		int quarters;
		int dimes;
		int nickels;
		int pennies;

		amount = (int) (total * 100);

		quarters = amount / 25;
		amount = (amount % 25);

		dimes = amount / 10;
		amount = (amount % 10);

		nickels = amount / 5;
		amount = (amount %5);

		pennies = amount;
		amount -= (pennies);

		System.out.println("starting: $" + total);
		System.out.println("quarters: " + quarters);
		System.out.println("dimes: " + dimes);
		System.out.println("nickels: " + nickels);
		System.out.println("pennies: " + pennies);
		System.out.println();
	}

	//driver
	public static void main(String[] args)
	{
		calculate(4.17);
		calculate(1.23);
		calculate(10.24);
		calculate(0.99);
		calculate(5);
		calculate(00.06);
	}
}
