//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		int[][] test = {{ 1, 2, 3, 4, 5},
				{ 6, 7, 8, 9, 0},
				{ 6, 7, 1, 2, 5},
				{ 6, 7, 8, 9, 0},
				{ 5, 4, 3, 2, 1}};
		System.out.println(TotalRow.getRowTotals(test));
	}
}



