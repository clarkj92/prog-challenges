/**
 * Created by JCAM6L on 5/31/2017.
 */

//the rule for "too many parentheses" around part of an expression is that if removing matching parentheses around
// a section of text still leaves that section enclosed by parentheses, then those parentheses should be removed as extraneous
//https://www.reddit.com/r/dailyprogrammer/comments/5llkbj/2017012_challenge_298_easy_too_many_parentheses/
//not finished
public class TooManyParentheses
{

	public static void toChar(String s)
	{
		char[] c = s.toCharArray();
		int start = 0;
		int end = c.length-1;
		find(c, start, end);
	}

	public static void find(char[] c, int start, int end)
	{
		//int start = 0;
		//int end = 0;

		for(int i = start; i < c.length; i++)
		{
			if(c[i] == '(')
			{
				start = i;
				System.out.println("start: " + start);
				break;
			}
		}

		for(int i = end; i > -1; i--)
		{
			if(c[i] == ')')
			{
				end = i;
				System.out.println("end: " + end);
				break;
			}
			else
			{
				System.out.println("mismatching parenthesis found!");
			}
		}

		char[] n = new char[(end-start+1)];
		for(int i = 0; i < n.length; i++)
		{
			n[i] = c[start];
			start++;
		}

		print(n);

		if(n.length > 2)
		{
			find(n, 1, n.length-2);
		}
	}

	public static void print(char[] chars)
	{
		for(char c : chars)
		{
			System.out.print(c);
		}

		System.out.println();
		System.out.println();
	}

	public static void main(String[] args)
	{
		//toChar("ab((c))");
		//toChar("((a((bc)(de)))f)");
		toChar("((zbcd)((e)fg))");
	}
}
