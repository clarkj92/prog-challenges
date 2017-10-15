import java.math.BigInteger;

/**
 * Created by JCAM6L on 8/7/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/6s70oh/2017087_challenge_326_easy_nearest_prime_numbers/
public class NearestPrimeNumber
{
	//checks if the input is prime, otherwise finds next smallest and next largers primes
	public static void findPrimes(long input)
	{
		//check if input is prime
		if(IsPrime(input))
		{
			System.out.println(input + " is prime");
		}
		else
		{
			long smaller = 0;
			long larger = 0;
			long i = input;
			long max = input + 1000;

			//find smaller prime number
			while(i > 1)
			{
				if(IsPrime(i))
				{
					smaller = i;
					break;
				}

				i--;
			}

			i = input;

			//find larger prime number
			while(i < max)
			{
				if(IsPrime(i))
				{
					larger = i;
					break;
				}

				i++;
			}

			System.out.println(smaller + " < " + input + " < " + larger);
		}
	}

	//brute forces all possible divisors
	public static boolean IsPrime(long input)
	{
		boolean prime = true;

		for(long i = 2; i < input; i++)
		{
			if(input % i == 0)
			{
				prime = false;
				break;
			}
		}

		return prime;
	}

	//driver
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		findPrimes(270);
		findPrimes(541);
		findPrimes(993);
		findPrimes(649);
		findPrimes(2010741);
		//findPrimes(1425172824437700148L);	//doesn't work yet
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime + "ms");
	}
}