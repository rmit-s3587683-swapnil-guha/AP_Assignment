import java.util.Random;
public class Sprinter extends Athelete{
	int min = 10;
	int max = 20;
	public Sprinter(String ID, String name, int age, String state){
		super(ID, name, age, state);
	}
	public int compete(){
		Random ran = new Random();
		return ran.nextInt((max - min)+1) + min ;
		}
}