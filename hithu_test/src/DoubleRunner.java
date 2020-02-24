//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Athu P

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
//		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
//		System.out.println(run);
//		System.out.println("biggest = " + run.getBiggest() + "\n");

		//add more test cases
		
		char letter = 'Z';
		int count = 8;
		char temp_letter = letter;
		int temp_count = count;
		
		for(int a = 0; a < count ; a++) {
			for(int i = 0; i < temp_count  ; i++) {
				for(int j = 0; j < count ; j++) {
					if(temp_letter == 'Z') {
						temp_letter = (char)('Z' - (26 * i));
					} else {
//						temp_letter = (char) (temp_letter + i);
					};
					System.out.print((char) (temp_letter + i));	
				};
				System.out.print(" ");
				count = count - 1;
				
			};
			System.out.println();
			temp_count = temp_count - 1;
			count = 8;
			temp_letter = letter;
		}
			
				
	}
}