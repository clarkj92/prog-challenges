/**
 * Created by JCAM6L on 12/18/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/7hhyin/20171204_challenge_343_easy_major_scales/?sort=confidence
public class MajorScales
{
	static int[] scale = new int[]{0, 2, 4, 5, 7, 9, 11};
	static String[] chromatic = new String[]{"C", "C#", "D", "D#", "E", "F", "F#", "G",  "G#", "A", "A#", "B"};
	static String[] solfege = new String[]{"Do", "Re", "Mi", "Fa", "So", "La", "Ti"};

	public static String note(String c, String s)
	{
		String note = "";
		int iChromatic = 0;
		int iSolfege = 0;
		int increment = 0;
		int total = 0;

		//get the index of the chromatic scale
		for(int i = 0; i < chromatic.length; i++)
		{
			if(c.equals(chromatic[i]))
			{
				iChromatic = i;
				break;
			}
		}

		//get the index of the solfege note
		for(int i = 0; i < solfege.length; i++)
		{
			if(s.equals(solfege[i]))
			{
				iSolfege = i;
				break;
			}
		}

		increment = scale[iSolfege];
		total = iChromatic + increment;

		if(total > 12)
		{
			total -= 12;
		}

		note = chromatic[total];
		System.out.println("note(" + chromatic[iChromatic] + ", " + solfege[iSolfege] + ") -> " + note);
		return note;
	}

	public static void main(String[] args)
	{
		note("C", "Do");
		note("C", "Re");
		note("C", "Mi");
		note("D", "Mi");
		note("A#", "Fa");
	}
}
