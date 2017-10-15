/**
 * Created by JCAM6L on 5/24/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/6d29om/20170524_challenge_316_intermediate_sydney/
public class SydneyTour_Driver
{

	public static void main(String[] args)
	{
		SydneyTour st = new SydneyTour();
		System.out.println("1.");
		st.add("OH");
		st.add("OH");
		st.add("OH");
		st.add("BC");
		st.total();

		System.out.println();

		SydneyTour st1 = new SydneyTour();
		System.out.println("2.");
		st1.add("OH");
		st1.add("SK");
		st1.total();

		System.out.println();

		SydneyTour st2 = new SydneyTour();
		System.out.println("3.");
		st2.add("BC");
		st2.add("BC");
		st2.add("BC");
		st2.add("BC");
		st2.add("BC");
		st2.add("OH");
		st2.total();

		System.out.println();

		SydneyTour st3 = new SydneyTour();
		System.out.println("4.");
		st3.add("OH");
		st3.add("OH");
		st3.add("OH");
		st3.add("BC");
		st3.add("SK");
		st3.total();

		System.out.println();

		SydneyTour st4 = new SydneyTour();
		System.out.println("5.");
		st4.add("OH");
		st4.add("BC");
		st4.add("BC");
		st4.add("SK");
		st4.add("SK");
		st4.total();

		System.out.println();

		SydneyTour st5 = new SydneyTour();
		System.out.println("6.");
		st5.add("BC");
		st5.add("BC");
		st5.add("BC");
		st5.add("BC");
		st5.add("BC");
		st5.add("BC");
		st5.add("OH");
		st5.add("OH");
		st5.total();

		System.out.println();

		SydneyTour st6 = new SydneyTour();
		System.out.println("7.");
		st6.add("SK");
		st6.add("SK");
		st6.add("BC");
		st6.total();

	}

}
