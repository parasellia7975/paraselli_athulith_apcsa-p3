//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	static Scanner keyboard = new Scanner(System.in);
	public static void main( String args[] )
	{
		boolean truu = true;
		while(truu) {
		System.out.println("Enter the first word :: ");
		String wordOne = "" + keyboard.nextLine();
		if(wordOne.equals("Q")) {
			truu = false;
		
		}
		else {
			System.out.println("Enter the second word :: ");
			String wordTwo = "" + keyboard.nextLine();
			StringEquality sameLetter = new StringEquality(wordOne, wordTwo);
			boolean areSameLetters = sameLetter.checkEquality();
			if(areSameLetters = true) {
				System.out.println(wordOne + " does have the same letters as " + wordTwo + "\n");
			}
			else {
				System.out.println(sameLetter);
			}
			
		}
		}
		
	}
}