//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;
    private String myStr;

    public WordSearch( int size, String str )
    {
    	myStr = str;
    }

    public boolean isFound( String word )
    {
    	int length = word.length();
    	for(int i =  0 ; i<myStr.length()-length; i++) {
    		if(myStr.substring(i, i + length).contentEquals(word)) {
    			return true;
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		return false;
	}

    public String toString()
    {
 		return "";
    }
}
