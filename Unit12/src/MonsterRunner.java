//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		String name = "";
		int size = 0;
		System.out.println("Enter a name ");
		name = keyboard.nextLine();
		System.out.println("Enter a size ");
		size = keyboard.nextInt();
		//instantiate monster one
		Skeleton monsterOne = new Skeleton(name, size);
		
		//ask for name and size
		System.out.println("Enter a name ");
		name = keyboard.nextLine();
		System.out.println("Enter a size ");
		size = keyboard.nextInt();
		
		//instantiate monster two
		Skeleton monsterTwo = new Skeleton(name, size);
		
		System.out.println(monsterOne);
		System.out.println(monsterTwo);
	}
}