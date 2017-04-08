import java.util.*;


public class Sport {
	private String gameID;
	private ArrayList<Athlete> pList;
	private Participant referee;
	private Athlete winner = null;
	private Athlete seccond = null;
	private Athlete third = null;
	
	public Sport(String gameID, ArrayList game, Participant ref){
		this.gameID = gameID;
		pList = game;
		referee = ref;
			
	}
	public ArrayList<Athlete> getAthlete(){
		return pList;
	}
	public Athlete getWinner(){
		return winner;
	}
	public Athlete getSeccond(){
		return seccond;
	}
	public Athlete getThird(){
		return third;
	}
	public Participant getReferee(){
		return referee;
	}
	public void startGame(){
		for(int i = 0; i < pList.size(); i++){
			pList.get(i).compete();
		}	
		sorting();
		setPointsForWinners();
	}

	public  void sorting (){		
		Collections.sort(pList);
		Iterator<Athlete> afterswim = pList.iterator();
		System.out.format("%20s%15s%15s","Name","AthleteID","Compete Time");
		System.out.println();
		while(afterswim.hasNext()){
			Athlete aa = afterswim.next();			
			System.out.format("%20s%15s%15s",aa.getName(),aa.getID(),aa.getCompeteTime());
			System.out.println();
		}
		
	}
	public void setPointsForWinners(){
		winner = pList.get(0);
		seccond = pList.get(1);
		third = pList.get(2);
		int pointsForFirst = pList.get(0).getPoint();
		int pointsForSecond = pList.get(1).getPoint();
		int pointsForThird = pList.get(2).getPoint();
		//System.out.println(pointsForFirst);
		pointsForFirst += 5;
		pointsForSecond += 2;
		pointsForThird +=1;		
		pList.get(0).setPoint(pointsForFirst );
		pList.get(1).setPoint(pointsForSecond );
		pList.get(2).setPoint(pointsForThird );		
		System.out.println("name " + pList.get(0).getID() + "compete time " + pList.get(0).competeTime +"  "+ 
		pList.get(0).getPoint());
	}
}
