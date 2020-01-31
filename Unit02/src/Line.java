//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double rise;
		rise = y1 - y2;
		double run;
		run = x1- x2;
		double slope;
		slope = rise/run;
		return slope;
	}

}