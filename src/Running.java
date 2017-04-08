import java.util.ArrayList;
import java.util.Random;

/**
 * @author Swapnil
 * Running class is used to implement Running game and which inherits the Game class
 * and override the methods like gameToplay(), result() and random_WO_duplication()
 */

public class Running extends Game {

	private static int rCount = 0;
	int j = 0;
	private int[] id = new int[8];
	private int[] time = new int[8];

	/* (non-Javadoc)
	 * @see Game#gameToPlay()
	 * gameToplay() method gets overridden in this class 
	 * and is used to manages the overall running of Running game
	 */
	public void gameToPlay() {
		int sprinters;
		int superAthletes;
		int start = 16;
		int saStart = 24;

		sprinters = athlete();
		superAthletes = superAthlete();
		int size = sprinters + superAthletes;

		random_WO_duplicate(sprinters, start);
		random_WO_duplicate(superAthletes, saStart);
		rCount++;
		Database dObj = new Database();
		if (size < 4) {
			String cGameID = "Game ID -> " + "R" + rCount;
			dObj.rList.add(cGameID);
			dObj.rList.add("Game got Canceled");
			System.out.println("Game got Canceled due to insufficent participants \n");
			int rReferee = referee();
			dObj.rList.add("Official: Referee  " + dObj.get_pName(rReferee));
			System.out.println("Official: Referee  " + dObj.get_pName(rReferee) + "\n");
			Ozlympic run = new Ozlympic();
			run.menu();
		} else {

			int[] stime = new int[8];
			stime = sortTime(time);
			int[] tTime = new int[size];
			for (int i = 0; i < (size); i++)
				tTime[i] = time[i + (8 - size)];

			int[] sid = new int[8];
			sid = sortID(id);
			int[] tID = new int[size];
			for (int i = 0; i < (size); i++)
				tID[i] = id[i + (8 - size)];

			String userChoice = userPrediction();
			shuffleID(tID);

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
					+ dObj.get_pState(tID[i]) + "      " + dObj.get_pPoint(tID[i]) + // print
																						// result
					"     " + dObj.get_pName(tID[i]) + "\n");};
		int rReferee = referee();
		System.out.println("Official: Referee  " + dObj.get_pName(rReferee) + "\n");

		String cGameID = "Game ID -> " + "R" + rCount; // store game id
		dObj.rList.add(cGameID);
		cGameID = "ID   	" + "Name";
		dObj.rList.add(cGameID);
		for (int i = 0; i < 3; i++) {
			String name = dObj.get_pID(tID[i]) + "   " + dObj.get_pName(tID[i]); // store
																					// winners
			dObj.rList.add(name);
		}
		dObj.rList.add("Official: Referee  " + dObj.get_pName(rReferee));

		Ozlympic run = new Ozlympic();
		run.menu();
	}

	/* (non-Javadoc)
	 * @see Game#random_WO_duplicate(int, int)
	 * random_WO_duplicate() method gets overridden in this class and
	 * is used to select sprinters and super athlete 
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
			System.out.println("Id" + "    Age " + "  State " + " Points " + " Name"); 
			System.out.println(daObj.get_pID(rIndex + range) + " " + " " + 
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
	 *  generate compete time for sprinters 
	 */
	public int compete() {
		int tMax = 20;
		int tMin = 10;
		int cTime;
		Random rand = new Random();
		cTime = rand.nextInt((tMax - tMin) + 1) + tMin; // random time
		return cTime;
	}
}
