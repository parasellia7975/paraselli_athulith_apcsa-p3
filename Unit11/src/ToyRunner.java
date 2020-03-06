//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy sorri = new Toy("sorry");
		sorri.setCount(1);
		System.out.println(sorri);
		Toy joe = new Toy("gi joe");
		joe.setCount(5);
		System.out.println(joe);
	}
}