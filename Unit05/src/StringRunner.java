//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	static Scanner keyboard = new Scanner(System.in);
	public static void main ( String[] args )
	{
		boolean truu = true;
		while(truu) {
		out.println("Enter a word :: ");
		String inputWord = "" + keyboard.nextLine();
		StringOddOrEven theWord = new StringOddOrEven();
		theWord.setString(inputWord);
		if(inputWord.equals("Q")) {
		truu = false;
		
		}
		else {
			if(theWord.isEven()) {
				System.out.println(inputWord + " is even");
			}
			else {
				System.out.println(inputWord + "is odd");
			}
		}
		}
		
	}
}