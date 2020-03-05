import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> nums;
		nums = new ArrayList<Integer>();
		nums.add(7);
		nums.add(1);
		nums.add(5);
		nums.add(3);
		nums.add(11);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);
		nums.add(12345);
		nums.add(11);
		System.out.println(ListOddToEven.go(nums));
	}
}