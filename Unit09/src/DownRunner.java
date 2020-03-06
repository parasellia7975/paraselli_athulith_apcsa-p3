import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{		
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(-99);
		test.add(12);
		test.add(4);
		System.out.println(ListDown.go(test));
		ArrayList<Integer> test2 = new ArrayList<Integer>();
		test2.add(10);
		test2.add(7);
		test2.add(2);
		System.out.println(ListDown.go(test2));
	}
}