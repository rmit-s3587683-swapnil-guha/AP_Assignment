import java.util.Scanner;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @author my
 *
 */
public class Driver {

	public static void main(String[] args) {
		String predictID = null;
		int gameNumber =0;
		int userselectcat = 0;
		Driver drive = new Driver();
		//Ozlympic starter = new Ozlympic();
		Database db = Ozlympic.makeGame();
		ArrayList<Sport> runningGame = db.running1();
		ArrayList<Sport> swimmingGame = db.swimming1();
		ArrayList<Sport> cyclingGame = db.cycling1();
		Display dis = new Display();		
		Scanner sc = new Scanner(System.in);
		int userinputNum = drive.userInput();
		try {
			do {
				if (1 == userinputNum) {
					System.out.println("working");
					userselectcat = drive.categorySelection();
					gameNumber = sc.nextInt();
					System.out.println("You have selected " + gameNumber + " Game");
					userinputNum = drive.userInput();
				} else if (2 == userinputNum) {
					System.out.println("Please enter your predicting winner ID");
					predictID = sc.next();
					System.out.println("You have selected  " + predictID);
					userinputNum = drive.userInput();
				} else if (3 == userinputNum) {
					if (predictID != null) {
						System.out.println("Game started!");
						GameLoad gameL = new GameLoad();
						if (userselectcat == 1) {
							System.out.println("selected 1");
							gameL.gameLoding(runningGame, gameNumber, predictID);
						}
						else if (userselectcat == 2) {
							System.out.println("selected 2");
							gameL.gameLoding(swimmingGame, gameNumber, predictID);
						}
						else if (userselectcat == 3) {
							System.out.println("selected 3");
							gameL.gameLoding(cyclingGame, gameNumber, predictID);
						}							
					}else{
						System.out.println("Please Predict a winner for Game");
					}
					userinputNum = drive.userInput();
				} else if (4 == userinputNum) {						
					dis.displayResult(runningGame, "Running", "R0" );
					dis.displayResult(swimmingGame, "Swimming", "S0" );
					dis.displayResult(cyclingGame, "Cycling", "C0" );
					userinputNum = drive.userInput();
				} else if(5 == userinputNum){
					
					userinputNum = drive.userInput();
				}
			} while (true);
		} catch (Exception e) {
			System.err.println("Error");
		}
	}

	public void menu() {
		System.out.println("Ozlympic Game");
		System.out.println("========================");
		System.out.println("1. Select a game to run");
		System.out.println("2. Predict the winner of the game");
		System.out.println("3. Start the game");
		System.out.println("4. Display the final results of all games");
		System.out.println("5. Display the points of all athletes");
		System.out.println("6. Exit");
	}

	public int userInput() {
		int userInputNum = 0;
		Scanner sc = new Scanner(System.in);
		boolean usercorrect = false;
		try {
			do {
				System.out.println("");
				menu();
				System.out.print("Enter an option:");
				int userin = sc.nextInt();
				if (1 <= userin && userin <= 6) {
					userInputNum = userin;
					usercorrect = false;
				} else {
					System.out.println("");
					System.out.println("Please enter valid number");
					usercorrect = true;
				}
			} while (usercorrect);
		} catch (Exception e) {
			System.out.println("Error");
		}
		return userInputNum;
	}

	public int categorySelection() {
		Ozlympic starter = new Ozlympic();
		ArrayList<Sport> runningGame = starter.makeGame().running1();
		ArrayList<Sport> swimmingGame = starter.makeGame().swimming1();
		ArrayList<Sport> cyclingGame = starter.makeGame().cycling1();
		Display dis = new Display();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Running" + "\n" + "2. Swimming" + "\n" + "3. Cycling");
		System.out.println("Please Select Game Category");
		int category = sc.nextInt();
		if (category == 1) {
			dis.categorySelectDisplay(runningGame, "Running", "R0");
		} else if (category == 2) {			
			dis.categorySelectDisplay(swimmingGame, "Swimming", "S0");			
		} else if (category == 3) {			
			dis.categorySelectDisplay(cyclingGame, "Cycling", "C0");
		} else {
			System.out.println("You haven't select a category");
		}
		System.out.println();
		System.out.println("Please Enter Selected Game Number as 1, 2 etc:");
		return category;
	}
	
}
