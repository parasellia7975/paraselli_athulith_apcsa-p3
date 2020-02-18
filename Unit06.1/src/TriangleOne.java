//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		word = s;
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print( )
	{
		String tempString = word;
	
		for(int i = tempString.length(); tempString.length()>1; i--) {
			tempString = word.substring(0,i);
			System.out.println(tempString);
		}
		
	}
}