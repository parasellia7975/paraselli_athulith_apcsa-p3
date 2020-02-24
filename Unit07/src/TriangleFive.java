//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('A');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		char letterLocal = letter;
		int count = amount;
		char temp_letter = letter;
		int temp_count = count;
		String output="";
		for(int a = 0; a < count ; a++) {
			for(int i = 0; i < temp_count  ; i++) {
				for(int j = 0; j < count ; j++) {
					if(temp_letter == 'Z') {
						temp_letter = (char)('Z' - (26 * i));
					} else {
//						temp_letter = (char) (temp_letter + i);
					};
					output = output + ((char) (temp_letter + i));	
				};
				output = output + (" ");
				count = count - 1;
				
			};
			output = output + "\n";
			temp_count = temp_count - 1;
			count = amount;
			temp_letter = letterLocal;
		}
		return output;
	}
}