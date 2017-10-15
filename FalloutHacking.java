import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by JCAM6L on 5/15/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/3qjnil/20151028_challenge_238_intermediate_fallout/
public class FalloutHacking
{
	static final String FILENAME = "C:\\Users\\JCAM6L\\Downloads\\enable1.txt";
	static List<String> words = new ArrayList<String>();
	static List<String> newWords = new ArrayList<String>();
	static List<String> randomWords = new ArrayList<String>();
	static int length;
	static String winner;

	//directs each step of the game setup
	public static void buildLists()
	{
		readFile();

		getWordsByLength();

		getRandomWords();
		System.out.println("WORD LIST");
		print(randomWords);
		System.out.println();

		pickWinningWord();
		System.out.println(winner);
	}

	//reads the input file with the master list of words
	public static void readFile()
	{
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME)))
		{
			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null)
			{
				//System.out.println(sCurrentLine);
				words.add(sCurrentLine);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	//add words matching the desired length to a new list
	public static void getWordsByLength()
	{
		for(String w : words)
		{
			if(w.length() == length)
			{
				newWords.add(w);
			}
		}
	}

	//get random words from list of words by length
	public static void getRandomWords()
	{
		Collections.shuffle(newWords);

		for(int i = 0; i < 10; i++)
		{
			randomWords.add(newWords.get(i));
		}
	}

	public static void pickWinningWord()
	{
		Collections.shuffle(randomWords);
		winner = randomWords.get(0);
	}

	//prints contents of array
	public static void print(List<String> words)
	{
		for(String w : words)
		{
			System.out.println(w);
		}
	}

	//direct the player during the game
	public static void play()
	{
		Scanner scanner = new Scanner(System.in);
		int guessCount = 5;
		String guess;

		System.out.println("Enter your first guess");
		guess = scanner.next().toLowerCase();

		//while there are guesses remaining and the winning word has not been guessed
		while(guessCount > 1)
		{
			//check if the correct word has been guessed
			if(checkWin(guess))
			{
				System.out.println("you guessed correct!");
				break;
			}
			else
			{
				guessCount--;
				System.out.println("sorry, guess again");
				System.out.println("letters correct: " + checkAnswer(guess) + "/" + length);
				System.out.println("guesses remaining: " + guessCount);
				System.out.println();
				guess = scanner.next().toLowerCase();
			}
		}
	}

	//check each letter of guess and determine if they are in the correct positions
	public static int checkAnswer(String guess)
	{
		char[] w = winner.toCharArray();
		char[] g = guess.toCharArray();
		int correct = 0;

		//loops goes for winner length, in case guessed word contains more letters than winning words
		//prevents arrayOutOfIndex exception
		for(int i = 0; i < winner.length(); i++)
		{
			if(w[i] == g[i])
			{
				correct++;
			}
		}
		return correct;
	}

	public static boolean checkWin(String guess)
	{
		boolean win = false;

		if(guess.equals(winner))
		{
			win = true;
		}
		return win;
	}

	//driver
	public static void main(String[] args)
	{
		length = 5;

		buildLists();
		play();
	}
}
