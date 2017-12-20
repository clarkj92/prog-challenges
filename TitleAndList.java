/**
 * Created by JCAM6L on 12/20/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/vmblw/6262012_challenge_69_easy/
public class TitleAndList
{
	//build everything
	public static void make(String[] titles, String[][] lists)
	{
		int length = 0;
		StringBuilder line = new StringBuilder();

		//get max length of all strings
		for(int i = 0; i < lists.length; i++)
		{
			for(int j = 0; j < lists[0].length; j++)
			{
				int temp = lists[i][j].length();
				if(temp > length)
				{
					length = temp;
				}
			}
		}

		//make horizontal divider line
		for(int i = 0; i < titles.length; i++)
		{
			line = buildLine(length, line);
		}

		//add plus at the end of the line
		line.append("+");

		//make header
		System.out.println(line);
		for(int i = 0; i < titles.length; i++)
		{
			int spaces = length - titles[i].length();
			System.out.print("| " + titles[i]);
			System.out.print(buildSpaces(spaces));

			if(i == titles.length-1)
			{
				System.out.print("|");
			}
		}

		//make list
		for(int i = 0; i < lists.length; i++)
		{
			System.out.println();
			System.out.println(line);
			for(int j = 0; j < lists[i].length; j++)
			{
				int spaces = length - lists[i][j].length();
				System.out.print("| " + lists[i][j]);
				System.out.print(buildSpaces(spaces));

				if(j == lists.length-1)
				{
					System.out.print("|");
				}
			}
		}
		System.out.println();
		System.out.println(line);
	}

	public static StringBuilder buildLine(int length, StringBuilder line)
	{
		//make header
		line.append("+");
		for(int i = 0; i < length+1; i++)
		{
			line.append("-");
		}

		return line;
	}

	public static StringBuilder buildSpaces(int spaces)
	{
		StringBuilder space = new StringBuilder();

		for(int k = 0; k < spaces; k++)
		{
			space.append(" ");
		}

		return space;
	}


	public static void main(String[] args)
	{
		//title string arrays
		String[] listTitle = new String[] {"necessities"};
		String[] infoTitles = new String[]{"name", "address", "description"};

		//list string arrays
		String[] listList = new String[] {"fairy", "cakes", "happy", "fish", "disgustipated", "melon-balls"};
		String[] info1 = new String[] {"Reddit", "www.reddit.com", "the frontpage of the internet"};
		String[] info2 = new String[] {"Wikipedia", "en.wikipedia.net", "The Free Encyclopedia"};
		String[] info3 = new String[] {"xkcd", "xkcd.com", "Sudo make me a sandwich."};

		//make(listTitle, new String[][] {listList});
		make(infoTitles, new String[][] {info1, info2, info3});
	}
}
