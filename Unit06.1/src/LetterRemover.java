//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("",'a');
		//call set
	}
	
	public LetterRemover(String s, char rem) {
		setRemover(s, rem);
	}

	//add in second constructor
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		boolean notDone = true;
		String cleaned = sentence;
		while(notDone) {
			int loc = cleaned.indexOf(lookFor);
			if(loc == -1) {
				notDone = false;
			} else if(loc > -1) {
				cleaned= cleaned.substring(0,loc) + cleaned.substring(loc + 1);
			};
		};
		return cleaned;
		
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}