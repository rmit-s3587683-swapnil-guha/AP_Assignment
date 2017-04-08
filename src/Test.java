import java.util.ArrayList;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Athlete a1 = new Swimmer("S1", "swimm1", 34, "vic");
		Athlete a2 = new SuperAthlete("Sa1", "super1", 22, "vic", 3);
		a1.setPoint(5);
		a2.setPoint(1);
		//System.out.println(a1.compete());
		System.out.println("point" + a1.getPoint());
		//System.out.println(a2.compete());
		System.out.println("point" + (a2.getPoint()+6));
		
		ArrayList<String> a = new ArrayList<>();
		a.add("sdlkfj");
		Database d1 = new Database();
		
		ArrayList<Participant> v = new ArrayList<Participant>();
	//	v = d1.getData();
	//	System.out.println(v.get(0).getAge());
		
		
		
		//Swimming sss = new Swimming();
		//sss.startGame();
		//sss.sorting();
		//sss.setPointsForWinners();
		Scanner sc = new Scanner(System.in);
		Ozlympic game1 = new Ozlympic();
		game1.makeGame();
		Database dd1 = new Database();
		ArrayList<Sport> game = new ArrayList<Sport>();
		game = dd1.swimming1();
		boolean val = false;
		do{
		game.get(0).startGame();
		game.get(0).sorting();
		System.out.println("enter");
		int vv = sc.nextInt();
		if (vv == 1){
			game.get(0).setPointsForWinners();
			val = true;
		}
		else {
			val = false;
		}
		
		}while(val);
		
	}

}

