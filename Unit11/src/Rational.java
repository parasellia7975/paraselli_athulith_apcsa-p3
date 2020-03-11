//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	private int num;
	private int den;
	//add two instance variables

	
	//write two constructors
	public Rational() {
		setNum(0);
		setDen(0);
	}
	public Rational(int top, int bot) {
		setNum(top);
		setDen(bot);
	}


	//write a setRational method
	

	//write  a set method for numerator and denominator
	public void setNum(int top) {
		num = top;
	}
	public void setDen(int bot) {
		den = bot;
	}
	
	public void add(Rational  other)
	{
		
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		


		reduce();
	}

	private void reduce()
	{



	}

	private int gcd(int numOne, int numTwo)
	{


		return 1;
	}

	public Object clone ()
	{
		return "";
	}


	//ACCESSORS
	public int returnNum() {
		return num;
	}
	public int returnDen() {
		return den;
	}
	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{


		return false;
	}

	public int compareTo(Rational other)
	{


		return -1;
	}



	
	//write  toString() method
	
	
}