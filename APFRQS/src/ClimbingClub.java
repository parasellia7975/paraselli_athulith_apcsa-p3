import java.util.ArrayList;

public class ClimbingClub {
		private ArrayList<ClimbInfo> climbList;
		
	public void addClimb (String peakName, int climbTime) {
		ClimbInfo temp;
		climbList.add(climbList.size(), new ClimbInfo(peakName,climbTime));
		for(int k = 0; k<climbList.size(); k++){
		for(int i = k; i<climbList.size()-1; i++) {
			if(( climbList.get(i).getName()).compareTo(climbList.get(i+1).getName())>0) {
				temp = climbList.get(i);
				climbList.set(i, climbList.get(i+1));
				climbList.set(i+1,temp);
				
			}
		}
	}
	}
	
}
