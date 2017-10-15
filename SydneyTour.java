import java.util.ArrayList;

/**
 * Created by JCAM6L on 5/24/2017.
 */

/*
We are going to have a 3 for 2 deal on opera house ticket.
We are going to give a free Sky Tower tour for with every Opera House tour sold
The Sydney Bridge Climb will have a bulk discount applied, where the price will drop $20, if someone buys more than 4
 */

//https://www.reddit.com/r/dailyprogrammer/comments/6d29om/20170524_challenge_316_intermediate_sydney/
public class SydneyTour
{
	ArrayList<String> tickets;
	int total, discount;
	int operaCount, bridgeCount, towerCount;
	int operaPrice, bridgePrice, towerPrice;

	public SydneyTour()
	{
		//tickets = new ArrayList<String>();
		operaPrice = 300;
		bridgePrice = 110;
		towerPrice = 30;
	}

	public void add(String ticket)
	{
		tickets.add(ticket);
	}

	public void total()
	{
		int c = calculate();
		int d = discount();

		System.out.println("opera count: " + operaCount);
		System.out.println("bridge count: " + bridgeCount);
		System.out.println("tower count: " + towerCount);
		System.out.println("The total of the order is: $" + (c - d));
	}

	public int discount()
	{
		discount = 0;

		for(int i = 1; i < operaCount+1; i++)
		{
			if(i % 3 == 0)
			{
				discount += operaPrice;
				System.out.println("opera house discount applied!");
			}
		}


		if(operaCount >= towerCount && towerCount > 0)
		{
			int t = towerCount * towerPrice;
			discount += t;
			System.out.println(towerCount + " free tower tickets applied! $" + t + " value!");
		}

		if(bridgeCount > 4)
		{
			discount += (bridgeCount * 20);
			System.out.println("bridge ticket discount applied!");
		}

		return discount;
	}

	public int calculate()
	{
		total = 0;

		for(String t : tickets)
		{
			if(t == "OH")
			{
				operaCount += 1;
				//towerCount += 1;
				total += operaPrice;

			}
			else if (t == "BC")
			{
				bridgeCount += 1;
				total += bridgePrice;
			}
			else if(t == "SK")
			{
				towerCount += 1;
				total += towerPrice;
			}
		}

		return total;
	}
}