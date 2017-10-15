/**
 * Created by JCAM6L on 6/15/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/6h9woe/20160614_challenge_319_intermediate_worm_wars_1/
public class WormWars
{
	//calculates the number of susceptible, infected, and recovered systems based on their individual rates
	public static void infect(int total, int infected, double si_rate, double ir_rate, double sr_rate)
	{
		int susceptible = total - infected;
		int recovered = 0;
		int old_s = susceptible;
		int old_i = infected;
		int old_r = recovered;
		int i = 1;

		System.out.println("Generation 0");
		System.out.println("susceptible: " + susceptible);
		System.out.println("infected: " + infected);
		System.out.println("recovered: " + recovered);
		System.out.println("total susceptible: total - infected + recovered");
		System.out.println("infected rate: susceptible*" + si_rate);
		System.out.println("recovered rate: infected*" + ir_rate + " + susceptible*" + sr_rate);
		System.out.println();

		while(susceptible > -1)
		{
			recovered += (int) (old_i * ir_rate) + (old_s * sr_rate);
			infected += (int) (old_s * si_rate);
			susceptible -= (recovered + infected);

			System.out.println("Generation " + i);
			System.out.println("susceptible: " + susceptible + " (" + (susceptible - old_s) + ")");
			System.out.println("infected: " + infected + " (" + (infected - old_i) + ")");
			System.out.println("recovered: " + recovered + " (" + (recovered - old_r) + ")");
			System.out.println();

			old_s = susceptible;
			old_i = infected;
			old_r = recovered;
			i++;
		}
	}

	//driver
	public static void main(String[] args)
	{
		infect(10000, 10, 0.010, 0.010, 0.015);
		//infect(10758, 21, 0.051, 0.930, 0.178);
		//infect(18450, 12, 0.320, 0.969, 0.306);
		//infect(9337, 15, 0.512, 0.513, 0.984); //these rates don't seem to work with each other, specifically si_rate and sr_rate
	}
}
