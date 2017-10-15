import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by JCAM6L on 7/28/2017.
 */

//not finished
//https://www.reddit.com/r/dailyprogrammer/comments/378h44/20150525_challenge_216_easy_texas_hold_em_1_of_3/
public class TexasHoldEm
{
	static ArrayList<String> deck = new ArrayList<>();
	static ArrayList<String> shuffledDeck = new ArrayList<>();

	static String[] clubs = new String[13];
	static String[] diamonds = new String[13];
	static String[] hearts = new String[13];
	static String[] spades = new String[13];

	static String[] player1 = new String[5];
	static String[] player2 = new String[5];
	static String[] player3 = new String[5];
	static String[] player4 = new String[5];

	static String[] table = new String[5];

	public static void generateDeck()
	{
		System.out.println("generating deck...");

		for(int i = 0; i < clubs.length; i++)
		{
			String card = "";

			switch(i)
			{
				case 9:
					card = "Jack";
					break;
				case 10:
					card = "Queen";
					break;
				case 11:
					card = "King";
					break;
				case 12:
					card = "Ace";
					break;
				default:
					card = i+2 + "";
			}

			clubs[i] = card + " of Clubs";
			diamonds[i] = card + " of Diamonds";
			hearts[i] = card + " of Hearts";
			spades[i] = card + " of Spades";
		}

		for(int i = 0; i < clubs.length; i++)
		{
			deck.add(clubs[i]);
			deck.add(diamonds[i]);
			deck.add(hearts[i]);
			deck.add(spades[i]);
		}
	}

	public static void shuffleDeck()
	{
		System.out.println("shuffling deck...");

		shuffledDeck = deck;

		Collections.shuffle(shuffledDeck);
	}

	public static void dealShuffledDeck()
	{
		System.out.println("dealing hands...");

		//deal to players
		for(int i = 0; i < 2; i++)
		{
			player1[i] = shuffledDeck.get(0);
			shuffledDeck.remove(0);

			player2[i] = shuffledDeck.get(0);
			shuffledDeck.remove(0);

			player3[i] = shuffledDeck.get(0);
			shuffledDeck.remove(0);

			player4[i] = shuffledDeck.get(0);
			shuffledDeck.remove(0);
		}

		//flop, burning a card before
		shuffledDeck.remove(0);
		table[0] = shuffledDeck.get(0);
		shuffledDeck.remove(0);
		table[1] = shuffledDeck.get(0);
		shuffledDeck.remove(0);
		table[2] = shuffledDeck.get(0);
		shuffledDeck.remove(0);

		//turn, burning a card before
		shuffledDeck.remove(0);
		table[3] = shuffledDeck.get(0);
		shuffledDeck.remove(0);

		//river, burning a card before
		shuffledDeck.remove(0);
		table[4] = shuffledDeck.get(0);
		shuffledDeck.remove(0);
	}

	public static String calculateWinner()
	{
		String winner = "";

		return winner;
	}

	public static void printStandardDeck()
	{
		System.out.println("Standard Deck:");

		for(int i = 0; i < clubs.length; i++)
		{
			System.out.println(clubs[i]);
			System.out.println(diamonds[i]);
			System.out.println(hearts[i]);
			System.out.println(spades[i]);
		}
	}

	public static void printShuffledDeck(ArrayList<String> deck)
	{
		System.out.println("Shuffled Deck:");

		for(String card : deck)
		{
			System.out.println(card);
		}
	}

	public static void printDeal()
	{
		System.out.println("Deal:");
		System.out.println("Player 1: " + player1[0] + ", " + player1[1]);
		System.out.println("Player 2: " + player2[0] + ", " + player2[1]);
		System.out.println("Player 3: " + player3[0] + ", " + player3[1]);
		System.out.println("Player 4: " + player4[0] + ", " + player4[1]);

		System.out.println();

		System.out.println("Flop: " + table[0] + ", " + table[1] + ", " + table[2]);
		System.out.println("Turn: " + table[3]);
		System.out.println("River: " + table[4]);

	}

	//driver
	public static void main(String[] args)
	{
		generateDeck();
		printStandardDeck();

		System.out.println();

		shuffleDeck();
		printShuffledDeck(deck);

		System.out.println();

		dealShuffledDeck();
		printDeal();

		System.out.println();

		//not finished
		calculateWinner();

	}
}
