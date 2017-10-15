import java.util.ArrayList;

/**
 * Created by JCAM6L on 6/2/2017.
 */

//Goldilocks requires a chair that will support her weight and has porridge that is not too hot
//https://www.reddit.com/r/dailyprogrammer/comments/5bn0b7/20161107_challenge_291_easy_goldilocks_bear/
public class Goldilocks
{
	static ArrayList<Integer> weights = new ArrayList<Integer>();
	static ArrayList<Integer> temps = new ArrayList<Integer>();
	static ArrayList<String> answer = new ArrayList<String>();

	//add seats to weight and temp arrays
	public static void addSeat(int weight, int temp)
	{
		weights.add(weight);
		temps.add(temp);
	}

	//find the available seats, passes Goldilocks' weight and temp as parameter
	public static void findSeats(int goldiWeight, int goldiTemp)
	{
		int weight;
		int temp;

		for(int i = 0; i < weights.size(); i++)
		{
			weight = weights.get(i);
			temp = temps.get(i);

			if(weight >= goldiWeight && temp <= goldiTemp)
			{
				answer.add(weight + " " + temp);
			}
		}

		printTotal(weights, temps);
		System.out.println();
		printAnswer(answer);
	}

	//print each seat at the table
	public static void printTotal(ArrayList<Integer> weigths, ArrayList<Integer> temps)
	{
		System.out.println("total seats: " + weights.size());

		for(int i = 0; i < weights.size(); i++)
		{
			System.out.println(weights.get(i) + " " + temps.get(i));
		}
	}

	//print seats that match the criteria
	public static void printAnswer(ArrayList<String> seats)
	{
		System.out.println("available seats: " + seats.size());

		for(String s : seats)
		{
			System.out.println(s);
		}
	}

	//driver
	public static void main(String[] args)
	{
		/*
		//sample input
		addSeat(30, 50);
		addSeat(130, 75);
		addSeat(90, 60);
		addSeat(150, 85);
		addSeat(120, 70);
		addSeat(200, 200);
		addSeat(110, 100);
		*/

		//challenge input
		addSeat(297, 90);
		addSeat(66, 110);
		addSeat(257, 113);
		addSeat(276, 191);
		addSeat(280, 129);
		addSeat(219, 163);
		addSeat(254, 193);
		addSeat(86, 153);
		addSeat(206, 147);
		addSeat(71, 137);
		addSeat(104, 40);
		addSeat(238, 127);
		addSeat(52, 146);
		addSeat(129, 197);
		addSeat(144, 59);
		addSeat(157, 124);
		addSeat(210, 59);
		addSeat(11, 54);
		addSeat(268, 119);
		addSeat(261, 121);
		addSeat(12, 189);
		addSeat(186, 108);
		addSeat(174, 21);
		addSeat(77, 18);
		addSeat(54, 90);
		addSeat(174, 52);
		addSeat(16, 129);
		addSeat(59, 181);
		addSeat(290, 123);
		addSeat(248, 132);

		findSeats(100, 120);
	}
}
