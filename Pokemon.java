/**
 * Created by JCAM6L on 6/8/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/5961a5/20161024_challenge_289_easy_its_super_effective/
public class Pokemon
{
	//array of possible offensive and defensive types
	static String[] type = {"normal", "fire", "water", "electric", "grass", "ice",
			"fighting", "poison", "ground", "flying", "psychic", "bug",
			"rock", "ghost", "dragon", "dark", "steel", "fairy"};

	//table of attack power vs defense (matches array above)
	static double[][] effectiveness =
			{{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.5, 0, 1, 1, 0.5, 1},
			{1, 0.5, 0.5, 1, 2, 2, 1, 1, 1, 1, 1, 2, 0.5, 1, 0.5, 1, 2, 1},
			{1, 2, 0.5, 1, 0.5, 1, 1, 1, 2, 1, 1, 1, 2, 1, 0.5, 1, 1, 1},
			{1, 1, 2, 0.5, 0.5, 1, 1, 1, 0, 2, 1, 1, 1, 1, 0.5, 1, 1, 1},
			{1, 0.5, 2, 1, 0.5, 1, 1, 0.5, 2, 0.5, 1, 0.5, 2, 1, 0.5, 1, 0.5, 1},
			{1, 0.5, 0.5, 1, 2, 0.5, 1, 1, 2, 2, 1, 1, 1, 1, 2, 1, 0.5, 1},
			{2, 1, 1, 1, 1, 2, 1, 0.5, 1, 0.5, 0.5, 0.5, 2, 0, 1, 2, 2, 0.5},
			{1, 1, 1, 1, 2, 1, 1, 0.5, 0.5, 1, 1, 1, 0.5, 0.5, 1, 1, 0, 2},
			{1, 2, 1, 2, 0.5, 1, 1, 2, 1, 0, 1, 0.5, 2, 1, 1, 1, 2, 1},
			{1, 1, 1, 0.5, 2, 1, 2, 1, 1, 1, 1, 2, 0.5, 1, 1, 1, 0.5, 1},
			{1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 0.5, 1, 1, 1, 1, 0, 0.5, 1},
			{1, 0.5, 1, 1, 2, 1, 0.5, 0.5, 1, 0.5, 2, 1, 1, 0.5, 1, 2, 0.5, 0.5},
			{1, 2, 1, 1, 1, 2, 0.5, 1, 0.5, 2, 1, 2, 1, 1, 1, 1, 0.5, 1},
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 0.5, 1, 1},
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 0.5, 0},
			{1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 2, 1, 1, 2, 1, 0.5, 1, 0.5},
			{1, 0.5, 0.5, 0.5, 1, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 0.5, 2},
			{1, 0.5, 1, 1, 1, 1, 2, 0.5, 1, 1, 1, 1, 1, 1, 2, 2, 0.5, 1}};

	//calculate the effectiveness of the attack of a certain offensive type against 1 or more defensive types
	//if two or more defensive types are present, the attack power is the product of the attack against each individual type
	public static void attack(String offense, String defense)
	{
		//initialize a new String array containing each defense type (up to a max of 10)
		String[] dTypes = defense.split(" ", 10);
		int offenseIndex = 18, defenseIndex = 18;
		double effect = 0;

		//find the index of the offense type and first defense type
		for(int i = 0; i < type.length; i++)
		{
			if (type[i].equals(offense))
			{
				offenseIndex = i;
			}

			if(type[i].equals(dTypes[0]))
			{
				defenseIndex = i;
			}
		}

		//calculate the original effectiveness
		effect = effectiveness[offenseIndex][defenseIndex];

		//find the index of each subsequent defense type and recalculate the effectiveness
		if(dTypes.length > 1)
		{
			for(int i = 1; i < dTypes.length; i++)
			{
				for(int j = 0; j < type.length; j++)
				{
					if(type[j].equals(dTypes[i]))
					{
						effect *= effectiveness[offenseIndex][j];
					}
				}
			}
		}

		//print the result of the attack
		System.out.print(offense + " -> " + defense + " = " + effect + "x");
		System.out.println();
	}

	//driver
	public static void main(String[] args)
	{
		attack("fire", "grass");
		attack("fighting", "ice rock");
		attack("psychic", "poison dark");
		attack("water", "normal");
		attack("fire", "rock");
	}
}