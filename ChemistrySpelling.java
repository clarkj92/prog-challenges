/**
 * Created by JCAM6L on 5/15/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/5seexn/20170206_challenge_302_easy_spelling_with/
public class ChemistrySpelling
{
	//2d array of elements and symbols
	static String[][] pt = new String[][]
			{{"Ac","Actinium"},
			{"Ag","Silver"},
			{"Al","Aluminum"},
			{"Am","Americium"},
			{"Ar","Argon"},
			{"As","Arsenic"},
			{"At","Astatine"},
			{"Au","Gold"},
			{"B","Boron"},
			{"Ba","Barium"},
			{"Be","Beryllium"},
			{"Bh","Bohrium"},
			{"Bi","Bismuth"},
			{"Bk","Berkelium"},
			{"Br","Bromine"},
			{"C","Carbon"},
			{"Ca","Calcium"},
			{"Cd","Cadmium"},
			{"Ce","Cerium"},
			{"Cf","Californium"},
			{"Cl","Chlorine"},
			{"Cm","Curium"},
			{"Cn","Copernicium"},
			{"Co","Cobalt"},
			{"Cr","Chromium"},
			{"Cs","Cesium"},
			{"Cu","Copper"},
			{"Db","Dubnium"},
			{"Ds","Darmstadtium"},
			{"Dy","Dysprosium"},
			{"Er","Erbium"},
			{"Es","Einsteinium"},
			{"Eu","Europium"},
			{"F","Fluorine"},
			{"Fe","Iron"},
			{"Fm","Fermium"},
			{"Fr","Francium"},
			{"Ga","Gallium"},
			{"Gd","Gadolinium"},
			{"Ge","Germanium"},
			{"H","Hydrogen"},
			{"He","Helium"},
			{"Hf","Hafnium"},
			{"Hg","Mercury"},
			{"Ho","Holmium"},
			{"Hs","Hassium"},
			{"I","Iodine"},
			{"In","Indium"},
			{"Ir","Iridium"},
			{"K","Potassium"},
			{"Kr","Krypton"},
			{"La","Lanthanum"},
			{"Li","Lithium"},
			{"Lr","Lawrencium"},
			{"Lu","Lutetium"},
			{"Md","Mendelevium"},
			{"Mg","Magnesium"},
			{"Mn","Manganese"},
			{"Mo","Molybdenum"},
			{"Mt","Meitnerium"},
			{"N","Nitrogen"},
			{"Na","Sodium"},
			{"Nb","Niobium"},
			{"Nd","Neodymium"},
			{"Ne","Neon"},
			{"Ni","Nickel"},
			{"No","Nobelium"},
			{"Np","Neptunium"},
			{"O","Oxygen"},
			{"Os","Osmium"},
			{"P","Phosphorus"},
			{"Pa","Protactinium"},
			{"Pb","Lead"},
			{"Pd","Palladium"},
			{"Pm","Promethium"},
			{"Po","Polonium"},
			{"Pr","Praseodymium"},
			{"Pt","Platinum"},
			{"Pu","Plutonium"},
			{"Ra","Radium"},
			{"Rb","Rubidium"},
			{"Re","Rhenium"},
			{"Rf","Rutherfordium"},
			{"Rg","Roentgenium"},
			{"Rh","Rhodium"},
			{"Rn","Radon"},
			{"Ru","Ruthenium"},
			{"S","Sulfur"},
			{"Sb","Antimony"},
			{"Sc","Scandium"},
			{"Se","Selenium"},
			{"Sg","Seaborgium"},
			{"Si","Silicon"},
			{"Sm","Samarium"},
			{"Sn","Tin"},
			{"Sr","Strontium"},
			{"Ta","Tantalum"},
			{"Tb","Terbium"},
			{"Tc","Technetium"},
			{"Te","Tellurium"},
			{"Th","Thorium"},
			{"Ti","Titanium"},
			{"Tl","Thallium"},
			{"Tm","Thulium"},
			{"U","Uranium"},
			{"V","Vanadium"},
			{"W","Tungsten"},
			{"Xe","Xenon"},
			{"Y","Yttrium"},
			{"Yb","Ytterbium"},
			{"Zn","Zinc"},
			{"Zr","Zirconium"}};

	//algorithm for generating solution
	public static void getCombo(String str)
	{
		String[] s = str.split("(?!^)");
		boolean[] isDone = new boolean[str.length()];
		int ptRows = pt.length;
		int sRows = s.length;
		String[] sb = new String[15];
		String[] solution = new String[str.length()];

		System.out.println(str);

		//check for elements matching on 2 letters
		for(int i = 0; i < sRows-1; i++)
		{
			if(isDone[i] == false)
			{
				for (int j = 0; j < ptRows; j++)
				{
					if (pt[j][0].toLowerCase().equals(s[i] + s[i + 1]))
					{
						isDone[i] = true;
						isDone[i + 1] = true;
						sb[i] = pt[j][0];
						solution[i] = pt[j][1];
					}
				}
			}
		}

		//check for elements matching on 1 letter
		for(int i = 0; i < sRows; i++)
		{
			if(isDone[i] == false)
			{
				for (int j = 0; j < ptRows; j++)
				{
					if (pt[j][0].toLowerCase().equals(s[i]))
					{
						isDone[i] = true;
						sb[i] = pt[j][0];
						solution[i] = pt[j][1];
					}
				}
			}
		}

		//call the print method
		printSolution(sb, solution);
	}

	public static void printSolution(String[] sb, String[] solution)
	{
		//print the symbols
		System.out.print("solution: ");
		for(String st : sb)
		{
			if(st != null)
			{
				System.out.print(st);
			}
		}

		//print the elements
		System.out.print(" ( ");
		for(String st : solution)
		{
			if(st != null)
			{
				System.out.print(st + " ");
			}
		}

		System.out.print(")");
		System.out.println();
		System.out.println();
	}

	//main method
	public static void main(String[] args)
	{
		getCombo("genius");
		getCombo("functions");
		getCombo("bacon");
		getCombo("poison");
		getCombo("sickness");
		getCombo("ticklish");
	}
}