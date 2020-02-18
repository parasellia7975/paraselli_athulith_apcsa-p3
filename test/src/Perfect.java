//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

   public Perfect() {
	   setNums(0);
   }
   public Perfect(int num) {
	   setNums(num);
   }
   
   public void setNums(int num) {
	  number = num;
   }
	//add constructors

	//add a set method

	public boolean isPerfect()
	{
		int sum = 0;
		for(int i = 0; i<=number; i++) {
			if(number%i = 0) {
				sum += i;
			}
			
		}
		if(number == sum)
			return true;
		return false;
	}
	
	public string toString() {
		if(isPerfect()) {
			return number + " is perfect";
		}
		return number " is not perfect";
	}

	//add a toString	
	
}