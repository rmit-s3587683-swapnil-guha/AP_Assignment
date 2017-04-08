import java.util.ArrayList;
import java.util.Random;

/**
 * @author Swapnil
 * Cycling class is used to implement cycling game and which inherits the Game class
 * and override the methods like gameToplay(), result() and random_WO_duplication()
 */

public class Cycling extends Game {

	private static int cCount = 0; // counter for game id
	int j = 0;
	private int[] id = new int[8];
	private int[] time = new int[8];

	/* (non-Javadoc)
	 * @see Game#gameToPlay()
	 * gameToplay() method gets overridden in this class 
	 * and is used to manages the overall running of cycling game
	 */
	public void gameToPlay() {
		int cyclists; // store random no. of cyclists
		int superAthletes; // store random no. of super athletes
		int start = 8; // starting index for cyclists
		int saStart = 24; // starting index for super athletes

		cyclists = athlete(); // compute random no. of cyclists
		superAthletes = superAthlete(); // compute random no. of super athletes
		int size = cyclists + superAthletes; // total number of athletes

		random_WO_duplicate(cyclists, start);
		random_WO_duplicate(superAthletes, saStart);
		cCount++;
		Database dObj = new Database();
		if (size < 4) {

			String cGameID = "Game ID -> " + "C" + cCount;
			dObj.cList.add(cGameID);
			dObj.cList.add("Game got Canceled");
			int cReferee = referee();
			dObj.cList.add("Official: Referee  " + dObj.get_pName(cReferee));
			System.out.println("Game got Canceled due to insufficent participants \n");
			System.out.println("Official: Referee  " + dObj.get_pName(cReferee) + "\n");
			Ozlympic run = new Ozlympic();
			run.menu();

		} else {

			int[] stime = new int[8];
			stime = sortTime(time);
			int[] tTime = new int[size]; // trim array and sort time
			for (int i = 0; i < (size); i++)
				tTime[i] = time[i + (8 - size)];

			int[] sid = new int[8];
			sid = sortID(id);
			int[] tID = new int[size]; // trim array and sort id
			for (int i = 0; i < (size); i++)
				tID[i] = id[i + (8 - size)];

			shuffleID(tID); // shuffle array
			String userChoice = userPrediction();
			result(tTime, tID, userChoice);
		}

	}

	/* (non-Javadoc)
	 * @see Game#result(int[], int[], java.lang.String)
	 * result() method gets overridden in this class is used to summarise 
	 * and declare result and to store the information of game played
	 */
	public void result(int[] tTime, int[] tID, String userChoice) {

		Database dObj = new Database();
		if (dObj.get_pID(tID[0]).equals(userChoice)) // check user prediction
			System.out.println("Congratulation");
		else
			System.out.println("Better Luck Next time");

		dObj.setFirst_pPoint(tID[0]);
		dObj.setSecond_pPoint(tID[1]); // set point for 1,2 and 3
		dObj.setThird_pPoint(tID[2]);

		for (int i = 0; i < tID.length; i++) {
			System.out.println("Time  " + "Id" + "    Age " + "  State " + " Points " + " Name");
			System.out.println(tTime[i] + "   " + dObj.get_pID(tID[i]) + "  " + dObj.get_pAge(tID[i]) + "	  "
					+ dObj.get_pState(tID[i]) + "      " + dObj.get_pPoint(tID[i]) + 	
					"     " + dObj.get_pName(tID[i]) + "\n");};

		int cReferee = referee();
		System.out.println("Official: Referee  " + dObj.get_pName(cReferee) + "\n");

		String cGameID = "Game ID -> " + "C" + cCount; // store game id
		dObj.cList.add(cGameID);
		cGameID = "ID   	" + "Name";
		dObj.cList.add(cGameID);
		for (int i = 0; i < 3; i++) {
			String name = dObj.get_pID(tID[i]) + "   " + dObj.get_pName(tID[i]); // store
																					// winners
			dObj.cList.add(name);
		}
		dObj.cList.add("Official: Referee  " + dObj.get_pName(cReferee));

		Ozlympic run = new Ozlympic();
		run.menu();
	}

	/* (non-Javadoc)
	 * @see Game#random_WO_duplicate(int, int)
	 * random_WO_duplicate() method gets overridden in this class and
	 * is used to select cyclists and super athlete 
	 */
	public int random_WO_duplicate(int size, int range) {

		ArrayList<Integer> list = new ArrayList<Integer>(size); // array list of
																
		for (int i = 0; i < size; i++) {
			list.add(i);
		}

		Random rand1 = new Random();
		while (list.size() > 0) { // random index without duplication
			int index = rand1.nextInt(list.size());
			rIndex = list.remove(index);

			Database daObj = new Database(); // database object
			System.out.println("Id" + "    Age " + "  State " + " Points " + " Name"); // print
																						// athlete
																						// details
			System.out.println(daObj.get_pID(rIndex + range) + " " + " " + // print
																			// details
					daObj.get_pAge(rIndex + range) + "    " + daObj.get_pState(rIndex + range) + "     "
					+ daObj.get_pPoint(rIndex + range) + "      " + daObj.get_pName(rIndex + range) + "\n");

			id[j] = rIndex + range; // index of athlete
			time[j] = compete(); // random finish time of athlete
			j++;
		}
		return rIndex;
	}

	
	/* (non-Javadoc)
	 * @see Game#compete()
	 * compete() method gets overridden in this class is used to
	 *  generate compete time for cyclists
	 */
	public int compete() {
		int tMax = 800;
		int tMin = 500;
		int cTime;
		Random rand = new Random();
		cTime = rand.nextInt((tMax - tMin) + 1) + tMin; // random time

		return cTime;
	}
}
