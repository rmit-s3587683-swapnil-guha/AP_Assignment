/**
 * 
 */

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
}
