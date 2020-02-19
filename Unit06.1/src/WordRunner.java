//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	Scanner keyboard = new Scanner(System.in);  
	public static void main ( String[] args )
	{
		System.out.println("Enter a word :: ");
		String theWord = keyboard.nextLine();
		Word test = new Word(theWord);
		System.out.println(test.getFirstChar());
		System.out.println(test.getLastChar());
		System.out.println(test.getBackwards());
		System.out.println(test);
		
		System.out.println("Enter a word :: ");
		theWord = keyboard.nextLine();
		test.setWord(theString);
		System.out.println(test.getFirstChar());
		System.out.println(test.getLastChar());
		System.out.println(test.getBackwards());
		System.out.println(test);
		//add test cases		
	}
}