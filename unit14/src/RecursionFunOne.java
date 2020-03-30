//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	//Take a number and recursively determine how many of its digits are even. Return
	//the count of the even digits in each number.
	
	public static int countOddDigits(int num)
	{
		 if (num == 0) 
			 return 0;
		    int lastDigit = num % 10;
		   
		    if (lastDigit % 2 == 0) {
		        return 1 + countOddDigits(num/10);
		    } else {
		        return 0 + countOddDigits(num/10);
		    }
}
}