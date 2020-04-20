//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		int tempnum = number;
		
		for(int i = number; i>=number; i++) {
			number = number/10;
			count +=1;
			if(number == 0)
				break;
			
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int smallest = number%10;
		int tempNum = number;
		int index = 0;
		int count = 0;
		int pow = 1;
		int[] sorted = new int[getNumDigits(number)];
		for(int i = getNumDigits(number); i > 0; i--) {
			tempNum = number;
		for(int a = getNumDigits(number); a>0; a--) {
			
			if(tempNum%10<smallest)
				smallest = tempNum%10;
			tempNum = tempNum/10;
			
		}
		tempNum = number;
		for(int b = getNumDigits(number); b > 0; b--) {
			if(tempNum%10 == smallest) {
				sorted[index] = smallest;
				index++;
			}
			tempNum = tempNum/10;
		}
		tempNum = number;
		number = 0;
		for(int c =getNumDigits(tempNum); c > 0 ; c--) {
			if(tempNum%10 != smallest) {
				number = (int) (number + (tempNum%10 * Math.pow(pow,i)));
				pow += 1;
			}
			tempNum = tempNum/10;
		}
		pow = 1;
	}
		
		
		return sorted;
	}
	
}