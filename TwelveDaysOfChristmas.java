/**
 * Created by JCAM6L on 5/15/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/5j6ggm/20161219_challenge_296_easy_the_twelve_days_of/
public class TwelveDaysOfChristmas
{
	static String[] days = new String[] {"first", "second", "third", "fourth", "fifth",
			"sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};

	static String[] gifts = new String[] {"Partridge in a Pear Tree",
			"Turtle Doves",
			"French Hens",
			"Calling Birds",
			"Golden Rings",
			"Geese a Laying",
			"Swans a Swimming",
			"Maids a Milking",
			"Ladies Dancing",
			"Lords a Leaping",
			"Pipers Piping",
			"Drummers Drumming"};

	//algorithm for forming the song
	public static void giveGifts()
	{
		int day = 1;
		int count = 1;

		for(int i = 0; i < day; i++)
		{
			if(day == 12)
			{
				break;
			}

			System.out.println("On the " + days[i] + " of Christmas, my true love gave to me");

			for(int j = day-1; j > -1; j--)
			{
				System.out.println((j+1) + " " + gifts[j]);
			}

			System.out.println();

			day++;
			count++;
		}
	}

	//main method
	public static void main(String[] args)
	{
		giveGifts();
	}
}
