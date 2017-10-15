import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by JCAM6L on 6/7/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/6ft96y/20170607_challenge_318_intermediate_2020_nba/
//create round-robin schedule for NBA teams
//not finished
public class NBARevolution
{
	static String[] sL = new String[]{"Cleveland Cavaliers",
			"Golden State Warriors",
			"San Antonio Spurs",
			"Toronto Raptors"};
	static String[] bL = new String[]{"Atlanta Hawks",
			"Boston Celtics",
			"Brooklyn Nets",
			"Charlotte Hornets",
			"Chicago Bulls",
			"Cleveland Cavaliers",
			"Dallas Mavericks",
			"Denver Nuggets",
			"Detroit Pistons",
			"Golden State Warriors",
			"Houston Rockets",
			"Indiana Pacers",
			"Los Angeles Clippers",
			"Los Angeles Lakers",
			"Memphis Grizzlies",
			"Miami Heat",
			"Milwaukee Bucks",
			"Minnesota Timberwolves",
			"New Orleans Pelicans",
			"New York Knicks",
			"Oklahoma City Thunder",
			"Orlando Magic",
			"Philadelphia 76ers",
			"Phoenix Suns",
			"Portland Trail Blazers",
			"Sacramento Kings",
			"San Antonio Spurs",
			"Toronto Raptors",
			"Utah Jazz",
			"Washington Wizards"};

	static ArrayList<String> smallLeague = new ArrayList<String>(Arrays.asList(sL));
	static ArrayList<String> bigLeague = new ArrayList<String>(Arrays.asList(bL));
	static ArrayList<String> schedule = new ArrayList<String>();

	public static void schedule(ArrayList<String> teams)
	{
		for(int i = 0; i < teams.size(); i++)
		{

		}

		print(1, teams);
	}

	public static void print(int week, ArrayList<String> teams)
	{
		for(String t : teams)
		{
			System.out.println(t);
		}
	}

	public static void main(String[] args)
	{
		schedule(smallLeague);
		//schedule(bigLeague);
	}
}
