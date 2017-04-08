import java.util.ArrayList;

public class Database {	
	public  ArrayList getDataRunningR1 (){
		ArrayList<Athlete> dataRunner = new ArrayList<Athlete>();
		Athlete s1 = new Sprinter("sp1", "Billy MacPherson", 23, "vic");
		Athlete s2 = new Sprinter("sp2", "Bill Cartwright", 35, "vic");
		Athlete s3 = new Sprinter("sp3", "Stan Rowley", 31, "nsw");
		Athlete s4 = new Sprinter("sp4", "George Moir", 24, "nsw");
		Athlete sa1 = new SuperAthlete("sa4", "John Landy", 22, "qld", 1);
		Athlete sa2 = new SuperAthlete("sa7", "Michael Hillardt", 28, "qld", 1);
		dataRunner.add(s1);
		dataRunner.add(s2);
		dataRunner.add(s3);
		dataRunner.add(s4);
		dataRunner.add(sa1);
		dataRunner.add(sa2);
		return dataRunner;	
	}
	public  ArrayList getDataRunningR2 (){
		ArrayList<Athlete> dataRunner = new ArrayList<Athlete>();
		Athlete s1 = new Sprinter("sp10", "Nigel Barker", 23, "vic");
		Athlete s2 = new Sprinter("sp5", "William Woodger", 35, "vic");
		Athlete s3 = new Sprinter("sp6", "Shane Gould", 31, "nsw");
		Athlete s4 = new Sprinter("sp7", "Ron Opie", 24, "nsw");
		Athlete s5 = new Sprinter("sp4", "Jimmy Carlton", 24, "nsw");
		Athlete sa1 = new SuperAthlete("sa3", "Tec", 22, "qld", 1);
		Athlete sa2 = new SuperAthlete("sa4", "Dawn Fraser", 28, "qld", 1);
		dataRunner.add(s1);
		dataRunner.add(s2);
		dataRunner.add(s3);
		dataRunner.add(s4);		
		dataRunner.add(sa1);
		dataRunner.add(sa2);
		return dataRunner;	
	}
	
	public  ArrayList getDataSwimmingsw1 (){
		ArrayList<Athlete> dataSwimmer = new ArrayList<Athlete>();
		Athlete s1 = new Swimmer("sw1", "Andy", 23, "vic");
		Athlete s2 = new Swimmer("sw2", "Peters", 35, "vic");
		Athlete s3 = new Swimmer("sw3", "Shane Gould", 31, "nsw");
		Athlete s4 = new Swimmer("sw4", "Ian Thorpe", 24, "nsw");
		Athlete sa1 = new SuperAthlete("sa1", "Tec", 22, "qld", 2);
		Athlete sa2 = new SuperAthlete("sa2", "Dawn Fraser", 28, "qld", 2);
		dataSwimmer.add(s1);
		dataSwimmer.add(s2);
		dataSwimmer.add(s3);
		dataSwimmer.add(s4);
		dataSwimmer.add(sa1);
		dataSwimmer.add(sa2);
		return dataSwimmer;	
	}
	public  ArrayList getDataSwimmingsw2 (){
		ArrayList<Athlete> dataSwimmer = new ArrayList<Athlete>();
		Athlete s1 = new Swimmer("sw4", "Murray Rose", 23, "vic");
		Athlete s2 = new Swimmer("sw5", "Grant Hackett", 35, "vic");
		Athlete s3 = new Swimmer("sw6", "Shane Gould", 31, "nsw");
		Athlete s4 = new Swimmer("sw7", "Kieren Perkins", 24, "nsw");
		Athlete s5 = new Swimmer("sw4", "Ian Thorpe", 24, "nsw");
		Athlete sa1 = new SuperAthlete("sa3", "Tec", 22, "qld", 2);
		Athlete sa2 = new SuperAthlete("sa4", "Dawn Fraser", 28, "qld", 2);
		dataSwimmer.add(s1);
		dataSwimmer.add(s2);
		dataSwimmer.add(s3);
		dataSwimmer.add(s4);		
		dataSwimmer.add(sa1);
		dataSwimmer.add(sa2);
		return dataSwimmer;	
	}
	public  ArrayList getDataCyclingcy1 (){
		ArrayList<Athlete> dataCyclist = new ArrayList<Athlete>();
		Athlete s1 = new Cyclist("cy1", "Andy", 23, "vic");
		Athlete s2 = new Cyclist("cy2", "Peters", 35, "vic");
		Athlete s3 = new Cyclist("cy3", "Shane Gould", 31, "nsw");
		Athlete s4 = new Cyclist("cy4", "Ian Thorpe", 24, "nsw");
		Athlete sa1 = new SuperAthlete("sa1", "Tec", 22, "qld", 3);
		Athlete sa2 = new SuperAthlete("sa2", "Dawn Fraser", 28, "qld", 3);
		dataCyclist.add(s1);
		dataCyclist.add(s2);
		dataCyclist.add(s3);
		dataCyclist.add(s4);
		dataCyclist.add(sa1);
		dataCyclist.add(sa2);
		return dataCyclist;	
	}
	public  ArrayList getDataCyclingcy2 (){
		ArrayList<Athlete> dataCyclist = new ArrayList<Athlete>();
		Athlete s1 = new Cyclist("cy4", "Murray Rose", 23, "vic");
		Athlete s2 = new Cyclist("cy5", "Grant Hackett", 35, "vic");
		Athlete s3 = new Cyclist("cy6", "Shane Gould", 31, "nsw");
		Athlete s4 = new Cyclist("cy7", "Kieren Perkins", 24, "nsw");
		Athlete s5 = new Cyclist("cy4", "Ian Thorpe", 24, "nsw");
		Athlete sa1 = new SuperAthlete("sa3", "Tec", 22, "qld", 3);
		Athlete sa2 = new SuperAthlete("sa4", "Dawn Fraser", 28, "qld", 3);
		dataCyclist.add(s1);
		dataCyclist.add(s2);
		dataCyclist.add(s3);
		dataCyclist.add(s4);		
		dataCyclist.add(sa1);
		dataCyclist.add(sa2);
		return dataCyclist;			
	}
	public ArrayList running1(){
		ArrayList<Sport> dataRunningGame = new ArrayList<Sport>();
		Participant refsw1 = new Official("ref3", "Mark Renshaw", 48, "vic", 2);
		Participant refsw2 = new Official("ref4", "Jimmy Carlton", 37, "vic", 2);
		Sport sw1 = new Sport("R01",getDataRunningR1(),refsw1);
		Sport sw2 = new Sport("R02", getDataRunningR2(),refsw2);
		dataRunningGame.add(sw1);
		dataRunningGame.add(sw2);
		return dataRunningGame;
	}
	public ArrayList swimming1(){
		ArrayList<Sport> dataRunningGame = new ArrayList<Sport>();
		Participant refsw1 = new Official("ref1", "Harry", 48, "vic", 2);
		Participant refsw2 = new Official("ref2", "Andy", 37, "vic", 2);
		Sport sw1 = new Sport("S01",getDataSwimmingsw1(),refsw1);
		Sport sw2 = new Sport("S02", getDataSwimmingsw2(),refsw2);
		dataRunningGame.add(sw1);
		dataRunningGame.add(sw2);
		return dataRunningGame;
	}
	public ArrayList cycling1(){
		ArrayList<Sport> dataCyclingGame = new ArrayList<Sport>();
		Participant refsw1 = new Official("ref6", "Michael Hillardt", 48, "vic", 2);
		Participant refsw2 = new Official("ref8", "Alan Ozolins", 37, "vic", 2);
		Sport sw1 = new Sport("C01",getDataCyclingcy1(),refsw1);
		Sport sw2 = new Sport("C02", getDataCyclingcy2(),refsw2);
		dataCyclingGame.add(sw1);
		dataCyclingGame.add(sw2);
		return dataCyclingGame;
	}

<<<<<<< HEAD

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

=======
>>>>>>> branch 'master' of https://github.com/rmit-s3587683-swapnil-guha/AP_Assignment
}
