//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Athulith Paraselli
//Date - 2/3/2020
//Class - APCS-A
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner( System.in );
		out.print("Enter X1 : : ");
		int x1 = keyboard.nextInt();
		out.print("Enter X2 : : ");
		int x2 = keyboard.nextInt();
		out.print("Enter Y1 : : ");
		int y1 = keyboard.nextInt();
		out.print("Enter Y2 : : ");
		int y2 = keyboard.nextInt();
		//add test cases	
		
		
		Distance test = new Distance();
		//New object 'distance' test is variable name
		test.setCoordinates(x1, y1, x2, y2);
		test.calcDistance();
		System.out.println( test );
		
			
	}
}