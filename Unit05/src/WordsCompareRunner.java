//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
	static Scanner keyboard = new Scanner(System.in);
   public static void main( String args[] )
   {
	   boolean truu = true;
	   while(truu) {
		   
		System.out.println("Enter the first word :: ");
		String wordOne = "" + keyboard.nextLine();
		if(wordOne.contentEquals("Q")){
			truu = false;
		}
		else{
		System.out.println("Enter the second word :: ");
		String wordTwo = "" + keyboard.nextLine();
		WordsCompare twoWords = new WordsCompare(wordOne, wordTwo);
		twoWords.compare();
		System.out.println(twoWords);
		}
		
		
	   }
		

	}
}