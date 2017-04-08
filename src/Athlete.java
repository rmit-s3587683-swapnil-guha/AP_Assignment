import java.util.Random;
/**
 * 
 */

/**
 * @author my
 *
 */
public abstract class Athlete extends Participant implements Comparable<Athlete>{
	
	private int point;
	public int competeTime;
	
	public Athlete(String ID, String name, int age, String state){
		super(ID, name, age, state);
		
	}
	
	protected abstract void compete();

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	public int getCompeteTime(){
		return competeTime;
	}
	public int compareTo(Athlete o){
		if(this.getCompeteTime() < o.getCompeteTime()){
			return -1;
		}
		else if (this.getCompeteTime() > o.getCompeteTime()){
			return 1;
		}
		return 0;
	}
	
}
