
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/**
 * @author Swapnil
 *Game class implements Official and Athletes interface 
 *and then further got inherited by Cycling, Running and Smimming classes
 */



public abstract class Game  implements Official, Athletes {
	
	int min = 0;
	int max = 8; 
	int rmax = 38;
	int rmin = 32;
	int totalAthlete=9; 
	int athlete=0;
	int superAthlete=0;
	int referee = 0;
	int j=0; 
	int rIndex;
	
	/**
	 *gmaeToPlay() is an abstract method 
	 */
	public abstract void gameToPlay();  
	
	/* (non-Javadoc)
	 * @see Official#referee()
	 * @return referee
	 * referee() method is used to return random referee index/name
	 * which contains its signature in Referee interface and which got implemented in Game class
	 */
	public int referee() {
		Random rand = new Random();
		referee = rand.nextInt((rmax - rmin) + 1) + rmin; // random official
		return referee;
	}
	
	/* (non-Javadoc)
	 * @see Athletes#athlete()
	 * @return athlete
	 * athlete() method is used to return random number of athlete in range of 0 - 8
	 * which contains its signature in Athlete interface and which got implemented in Game class
	 */
	public int athlete() {
		Random rand = new Random();
		 while (totalAthlete>=9) {	
				athlete = rand.nextInt((max - min) + 1) + min; // random no. of cyclists
				superAthlete = rand.nextInt((max - min) + 1) + min; // random no. of superathlete
				totalAthlete = athlete+superAthlete; //total no. of athelete
			}
		 
	        return athlete;
	    }

	/* (non-Javadoc)
	 * @see Athletes#superAthlete()
	 * @return superAthlete
	 * superAthlete() method is used to return random number of superAthlete in range of 0 - 8 
	 * which contains its signature in Athlete interface and which got implemented in Game class
	 */
	public int superAthlete() {
		 return superAthlete = totalAthlete - athlete;
	 }
	
	
	/**
	 * random_WO_duplicate() method is an abstract method which fetches athlete list randomly without duplication 
	 * @param size
	 * @param range
	 * @return
	 */
	public abstract int random_WO_duplicate(int size,int range);        	 
			
	
	/* (non-Javadoc)
	 * @see Official#result(int[], int[], java.lang.String)
	 * result() method is used to summarise the game result which contains its signature in official interface and which got implemented in Game class  
	 */
	public void result(int[]tTime,int[]tID,String userChoice) {

		 }

	/**
	 * sortTime() method is used to sort compete time of athlete
	 * @param time
	 * @return time
	 */
	public int[] sortTime(int time[]) {
		 Arrays.sort(time); 
		 return time;
	 }
	 
	/**
	 * sortID() method is used to sort id of athlete
	 * @param id
	 * @return id
	 */
	public int[] sortID(int id[]) {
		 Arrays.sort(id);
		 return id;
	 }
		  
	/**
	 * shuffleID() method is used to shuffle array containing athlete ID
	 * @param array
	 */
	public void shuffleID(int[] array)
		  {
		    Random rnd = new Random();
		    for (int i = array.length - 1; i > 0; i--)
		    {
		      int index = rnd.nextInt(i + 1);
		      
		      int a = array[index];
		      array[index] = array[i];
		      array[i] = a;
		    }
		  }

	/**
	 * compete() method is an abstract method which generate compete time for  athlete 
	 * @return
	 */
	public abstract int compete();
	
	/**
	 * userPrediction() method is used to capture user choice for prediction and to process that choice further
	 * @return userChoice
	 */
	public String userPrediction()
	 {
		 System.out.println("\n To Predict the winner of the game enter coressponding ID");
		 String userInput;
		 Scanner scan = new Scanner(System.in);
		 userInput = scan.nextLine();
		 String userChoice=userInput.toUpperCase();
		 return userChoice;
	 }
}
