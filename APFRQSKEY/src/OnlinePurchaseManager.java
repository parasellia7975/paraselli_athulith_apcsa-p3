package AB;

import java.util.ArrayList;

//Here are a few past FRQs similar to this FRQ
//2010 CookieOrder
//2012 ClimbingClub
//2018 WordPair

public class OnlinePurchaseManager
{
   //purchases stores Gizmos
   private ArrayList<Gizmo> purchases;
   
   //point purchases at a new ArrayList   
   public OnlinePurchaseManager()
   {
   	purchases = new ArrayList<Gizmo>();
   }
   
   
   //NOT part of the sample question
   //needed in order to type up and
   //test student code
   public void add( String m, boolean e )
   {
   	purchases.add( new Gizmo( m, e) );
   }
   
   
   //Part A
   //count the number of Gizmos made by maker
   //that are also electronic
   //must call getMaker and isElectronic
   //return the count or 0 if no matches
   public int countElectronicsByMaker(String maker)
   {   
   	int count = 0;
   	for( Gizmo g : purchases )
   	{
   		if( g.getMaker().equals( maker ) && g.isElectronic()==true )
   			count = count + 1;  //or count++
   	}
   	return count;   	
   }
   

   //Part B
   //loop thought the list and check for matching adjacent pairs
   //return true of any adjacent [ side by side ] pairs are the same
   //to be the same the pairs must have the same maker and
   //be either electronic or non-electronic
   //you really really should use the equals method from Gizmo
   public boolean hasAdjacentEqualPair()
   {  
   	for( int i = 0; i < purchases.size()-1; i++ )
   	{
   		Gizmo curr = purchases.get( i );
   		Gizmo nxt = purchases.get( i + 1 );
   		if( curr.equals( nxt ) )
   			return true;
   	}
   	return false;   	
   }
   
   
   //NOT part of the sample question
   //needed in order to type up and
   //test student code
   public String toString()
   {
   	return "" + purchases;
   }
}