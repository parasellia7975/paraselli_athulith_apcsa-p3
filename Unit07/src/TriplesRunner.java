//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.Scanner;

public class TriplesRunner
{
   public static void main(String args[])
   {
	   Scanner keyboard = new Scanner(System.in);
	   System.out.println("Enter an integer :: ");
	   int num = keyboard.nextInt();
	   Triples test = new Triples(num);
	   System.out.println(test);
	}
}