//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		int[] ray = NumberShifter.makeLucky7Array(100);
		for(int i =0; i<ray.length; i++) {
			System.out.print(ray[i] + " ");
		}
		NumberShifter.shiftEm(ray);
		System.out.println("\n");
		for(int i =0; i<ray.length; i++) {
			System.out.print(ray[i] + " ");
		}
		
	}
}



