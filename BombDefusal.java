/**
 * Created by JCAM6L on 5/16/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/5e4mde/20161121_challenge_293_easy_defusing_the_bomb/
public class BombDefusal
{
	/*
	If you cut a white cable you can't cut white or black cable.
	If you cut a red cable you have to cut a green one
	If you cut a black cable it is not allowed to cut a white, green or orange one
	If you cut a orange cable you should cut a red or black one
	If you cut a green one you have to cut a orange or white one
	If you cut a purple cable you can't cut a purple, green, orange or white cable
	 */

	//calls the print and cut methods
	public static void execute(String[] wires)
	{
		printInput(wires);
		String result = cuttingOrder(wires);
		System.out.println(result);
		System.out.println();
	}

	//interates through the wires cut and determines if defusal was successful
	public static String cuttingOrder(String[] wires)
	{
		String next;

		for(int i = 0; i < wires.length-1; i++)
		{
			next = wires[i+1];

			switch(wires[i])
			{
				case "white":
					if(next == "white" || next == "black")
					{
						return "BOOM!";
					}
					break;
				case "red":
					if(next != "green")
					{
						return "BOOM!";
					}
					break;
				case "black":
					if(next == "white" || next == "green" || next == "orange")
					{
						return "BOOM!";
					}
					break;
				case "orange":
					if(next != "red" && next != "black")
					{
						return "BOOM!";
					}
					break;
				case "green":
					if(next != "orange" && next != "white")
					{
						return "BOOM!";
					}
					break;
				case "purple":
					if(next == "purple" || next == "green" || next == "orange" || next == "white")
					{
						return "BOOM!";
					}
					break;
			}
		}

		return "Bomb defused!";
	}

	//print the wires in the order they are cut
	public static void printInput(String[] wires)
	{
		for(String w : wires)
		{
			System.out.println(w);
		}
	}

	//main method
	public static void main(String[] args)
	{
		execute(new String[] {"white", "red", "green", "white"});
		execute(new String[] {"white", "orange", "green", "white"});
	}
}
