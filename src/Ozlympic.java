import java.util.Scanner;

/**
 * @author Swapnil
 * 
 *Ozlympic class is a startup class for this Project and contains 
 *main() method and other method like menu(), gameToRun() and userSelection() 
 *and deals with user interaction
 */

public class Ozlympic {


	/**
	 * menu() method is used to print menu and capture user choice
	 * according to menu displayed
	 */
<<<<<<< HEAD
	public void menu() {
		int userin;
		try {
			do {
				System.out.println("Ozlympic Game");
				System.out.println("========================");
				System.out.println("1. Select a game to run");
				System.out.println("2. Predict the winner of the game");
				System.out.println("3. Start the game");
				System.out.println("4. Display the final results of all games");
				System.out.println("5. Display the points of all athletes");
				System.out.println("6. Exit");
				System.out.print("Enter an option:");

				Ozlympic run = new Ozlympic();
				Scanner sc = new Scanner(System.in);
				userin = sc.nextInt();
				if (userin > 0 && userin < 7) {

					if (userin != 6)
						run.userSelection(userin);
					else if (userin == 6)
						System.out.println("Thanks for playing");
					break;
				} else
					System.out.println("Please enter valid choice");
			} while (userin != 6);
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
=======
>>>>>>> branch 'master' of https://github.com/rmit-s3587683-swapnil-guha/AP_Assignment

<<<<<<< HEAD
	/**
	 * gameToRun() method is used to play respective game on the basis
	 * of user selection 
	 */
	public void gameToRun() {
		int userInput;
		System.out.println("Press 1 for Swimming \n" + "Press 2 for Cycling \n" + "Press 3 for Running \n"
				+ "Press 4 for Main Menu \n");
		Scanner scan = new Scanner(System.in);
		userInput = scan.nextInt();
		switch (userInput) {
		case 1:
			Game osObj = new Swimming();
			osObj.gameToPlay();
			break;
		case 2:
			Game ocObj = new Cycling();
			ocObj.gameToPlay();
			break;
		case 3:
			Game orObj = new Running();
			orObj.gameToPlay();
			break;
		case 4:
			Ozlympic obj = new Ozlympic();
			obj.menu();
			break;
		default:
			System.out.println("Invalid Option");
			break;
		}
=======
	public static Database makeGame(){
		Database dataCollection = new Database();		
		return dataCollection;
>>>>>>> branch 'master' of https://github.com/rmit-s3587683-swapnil-guha/AP_Assignment
	}
<<<<<<< HEAD

	/**
	 * userSelection() method is used to implement user selection on the basis
	 * of menu displayed in menu()
	 * @param userin
	 */
	public void userSelection(int userin) {
		Ozlympic Obj = new Ozlympic();
		Database dObj = new Database();
		switch (userin) {
		case 1:
			Ozlympic gtrObj = new Ozlympic();
			Obj.gameToRun();
			break;
		case 2:
			Obj.gameToRun();
			break;
		case 3:
			Obj.gameToRun();
			break;
		case 4:
			System.out.println("The final results of all Cycling \n");
			dObj.display(dObj.cList);
			System.out.println("The final results of all Swimming \n");
			dObj.display(dObj.sList);
			System.out.println("The final results of all Running \n");
			dObj.display(dObj.rList);
			Obj.menu();
			break;
		case 5:
			System.out.println("The points of all athletes");
			for (int i = 0; i < 32; i++) {
				System.out.println("Id" + "    Age " + "  State " + " Points " + " Name");
				System.out.println(dObj.get_pID(i) + "  " + dObj.get_pAge(i) + "	  " + dObj.get_pState(i) + "      "
						+ dObj.get_pPoint(i) + "     " + dObj.get_pName(i));};
			Obj.menu();
			break;
		default:
			break;
		}
	}

	/**
	 * main() method
	 * @param args
	 */
	public static void main(String[] args) {
		Ozlympic run = new Ozlympic();
		run.menu();
	}
=======
>>>>>>> branch 'master' of https://github.com/rmit-s3587683-swapnil-guha/AP_Assignment
}
