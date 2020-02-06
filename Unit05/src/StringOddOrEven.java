//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		if(word.length()%2 == 0) {
			out.println("It is Even");
		}
		else {
			out.println("It is Odd");
		}
	}

	public StringOddOrEven(String s)
	{
		if(s.length()%2 == 0) {
			out.println("It is Even");
		}
		else {
			out.println("It is Odd");
		}
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
 		if(word.length()%2 == 0) {
 			return true;
 		}
		return false;
	}

 	public String toString()
 	{
 		String output="";
 		return output;
	}
}