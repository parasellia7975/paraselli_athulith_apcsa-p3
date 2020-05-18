
public class OnlinePurchaseManager {   
	
	/** An ArrayList of purchased Gizmo objects, instantiated in the constructor. */  
	private ArrayList<Gizmo> purchases;
}
   /** Returns the number of purchased Gizmo objects that are electronic and are    *  manufactured by maker, as described in part (a).    */   
public int countElectronicsByMaker(String maker)   {   /* to be implemented in part (a) */   
	int count = 0;
	for(int i = 0; i<purchases.size(); i++) {
		if(purchases.get(i).getMaker().equals(maker)) {
			if(purchases.get(i).isElectronic())
				count +=1;
		}
			
	}
	return count;
}
   /** Returns true if any pair of adjacent purchased Gizmo objects are equivalent, and    *  false otherwise, as described in part (b).    */  
public boolean hasAdjacentEqualPair()   {   /* to be implemented in part (b) */   
	for(int i = 0; i<purchases.size()-1; i++) {
		if(purchases.get(i).equals(purchases.get(i+1))
			return true;
	}
	return false;
}
   // There may be instance variables, constructors, and methods not shown. }

