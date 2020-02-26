//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{	
		RayDown s = new RayDown();
		System.out.println( s.go( new int[]{7,1,5,3,11,5,6,7,8,9,10,12345,11} ) );
		System.out.println( s.go( new int[]{10,9,8,7,6,5,4,3,2,1,-99} ) );
		System.out.println( s.go( new int[]{10,20,30,40,50,-11818,40,30,20,10} ) );
		System.out.println( s.go( new int[]{32767} ) );
		System.out.println( s.go( new int[]{2,7,11,21,5,7} ) );
		System.out.println( s.go( new int[]{255,255} ) );
		System.out.println( s.go( new int[]{9,10,-88,100,-555,1000} ) );
		System.out.println( s.go( new int[]{10,10,10,11,456} ) );
		System.out.println( s.go( new int[]{-111,1,2,3,9,11,20,30} ) );
	}
}