/**
 * Created by JCAM6L on 6/20/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/1t0r09/121613_challenge_145_easy_tree_generation/
public class TreeGeneration
{
	public static void buildTree(String input)
	{
		//parse string to get values
		String[] elements = input.split("\\s+");
		int length = Integer.parseInt(elements[0]);
		int height = (length+1) / 2;
		int spaces = (length-1) / 2;
		int j;
		int leafs = 1;

		//loop through the layers of the tree
		for(int i = 0; i < height; i++)
		{
			//print leading spaces
			for(j = 0; j < spaces; j++)
			{
				System.out.print(" ");
			}

			//print leaves
			for(j = 0; j < leafs; j++)
			{
				System.out.print(elements[2]);
			}

			//print trailing spaces
			for(j = 0; j < spaces; j++)
			{
				System.out.print(" ");
			}

			System.out.println();

			leafs += 2;
			spaces -= 1;
		}

		//print base
		for(int i = 0; i < length; i++)
		{
			System.out.print(elements[1]);
		}
	}

	//driver
	public static void main(String[] args)
	{
		buildTree("3 # *");
		System.out.println();
		buildTree("13 = +");
	}
}
