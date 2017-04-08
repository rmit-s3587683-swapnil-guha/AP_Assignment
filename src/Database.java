import java.util.ArrayList;


/**
 * @author Swapnil
 * Database class is used to store data which is being used in this project
 */
public class Database {


	public static ArrayList<String> cList = new ArrayList<String>();
	public static ArrayList<String> sList = new ArrayList<String>();
	public static ArrayList<String> rList = new ArrayList<String>();

	/**
	 * to store id of athletes and official 
	 */
	private String pID[] = { "SW01", "SW02", "SW03", "SW04", "SW05", "SW06", "SW07", "SW08", "CY01", "CY02", "CY03",
			"CY04", "CY05", "CY06", "CY07", "CY08", "SP01", "SP02", "SP03", "SP04", "SP05", "SP06", "SP07", "SP08",
			"SA01", "SA02", "SA03", "SA04", "SA05", "SA06", "SA07", "SA08", "Off01", "Off02", "Off03", "Off04", "Off05",
			"Off06", "Off07" };

	/**
	 * to store name of athletes and official
	 */
	private String pName[] = { "Shane Gould", "Ian Thorpe", "Dawn Fraser", "Murray Rose", "Grant Hackett",
			"Kieren Perkins", "Susie O'Neill", "Frederick Lane",

			"Stuart O'Grady", "Phil Anderson", "Robbie McEwan", "Simon Gerrans", "Michael Rogers", "Cadel Evans",
			"Mark Renshaw", "Adam Hansen",

			"Billy MacPherson", "Bill Cartwright", "Stan Rowley", "George Moir", "Nigel Barker", "William Woodger",
			"Ron Opie", "Jimmy Carlton",

			"John Landy", "Michael Hillardt", "Alan Ozolins", "Simon Doyle", "Peter Watson", "Lachlan Renshaw",
			"Bruce Frayne", "Dean Capobianco",

			"Patrick Johnson", " Aaron Rouge-Serret", "Joseph Millar", "Joshua Ross", "Mangar Makur Chuot",
			" Banuv Tabakaucoro", "Alex Hartmann" };

	/**
	 * to store age of athletes and  official
	 */
	private String pAge[] = { "23", "21", "26", "20", "24", "22", "27", "21", "21", "27", "22", "24", "20", "26", "21",
			"23", "24", "22", "27", "21", "23", "21", "26", "20", "23", "21", "27", "21", "22", "24", "26", "23", "32",
			"31", "38", "40", "33", "35", "39" };

	/**
	 * to store state of athletes 
	 */
	private String pState[] = { "VIC", "NSW", "QLD", "WA", "SA", "TAS", "VIC", "NSW", "VIC", "NSW", "QLD", "WA", "SA",
			"TAS", "VIC", "NSW", "VIC", "NSW", "QLD", "WA", "SA", "TAS", "VIC", "NSW", "VIC", "NSW", "QLD", "WA", "SA",
			"TAS", "VIC", "NSW", "VIC", "NSW", "QLD", "WA", "SA", "TAS", "NSW" };

	/**
	 * to store points of athletes
	 */
	private static int pPoint[] = new int[32];

	public String get_pID(int a) {
		return pID[a];
	}

	public String get_pName(int a) {
		return pName[a];
	}

	public String get_pAge(int a) {
		return pAge[a];
	}

	public String get_pState(int a) {
		return pState[a];
	}

	public int get_pPoint(int a) {
		return pPoint[a];
	}

	public void setFirst_pPoint(int id) {
		
		pPoint[id] = pPoint[id] + 5;
	}

	public void setSecond_pPoint(int id) {
		
		pPoint[id] = pPoint[id] + 2;
	}

	public void setThird_pPoint(int id) {
		
		pPoint[id] = pPoint[id] + 1;
	}

	/**
	 * display() method is used to display information
	 * about the game played
	 * @param list
	 */
	public void display(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();
	}

}
