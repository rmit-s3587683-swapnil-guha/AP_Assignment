import java.util.Random;
public class SuperAthlete extends Athlete {
	
	private int type;
	private int ranTime = 0;
	
	public SuperAthlete(String ID, String name, int age, String state, int type){
		super(ID, name, age, state);
		this.type = type;
	}
	public void compete(){		
	if (type == 1){
		ranTime = getRandom(10, 20); 
		competeTime = ranTime;
	}
	else if(type == 2){
		ranTime = getRandom(100, 200);
		competeTime = ranTime;
	}
	else if (type == 3){
		ranTime = getRandom(500, 800);
		competeTime = ranTime;
	}
	else {
		ranTime = 0;
	}
	
	}
	public int getRandom(int min, int max){
		Random ran = new Random();
		return ran.nextInt((max - min)+1) + min;
	} 
}
