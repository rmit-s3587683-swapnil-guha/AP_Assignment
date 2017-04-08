/**
 * 
 */

<<<<<<< HEAD
/**
 * @author Swapnil
 * Athletes interface is used to contain method signature of
 * referee() and result() and to forbid a user 
 * from creating a generic type of participant
 *
 */
public interface Official {
	public int referee();
	public void result(int[]tTime,int[]tID,String userChoice);
=======
public class Official extends Participant {
	private int rank;

	public Official(String ID, String name, int age, String state, int rank){
		super(ID,name,age,state);
		this.rank = rank;
	}
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	

>>>>>>> branch 'master' of https://github.com/rmit-s3587683-swapnil-guha/AP_Assignment
}
