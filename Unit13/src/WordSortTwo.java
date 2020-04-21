//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		int start = 0; 
		int index = 0; 
		char[] strArray = sentence.toCharArray();
		for(int i = 0; i< strArray.length; i++) {
			if(strArray[i] == ' ') {
				wordRay[index] = sentence.substring(start,i);
				index += 1;
				start = i + 1;
			}
		}
		
	}

	public void sort()
	{
		String tempString;
		for(int i = 0; i<wordRay.length-1; i++) {
			for(int k = 0; k<wordRay.length; k++) {
				if(wordRay[k].compareTo(wordRay[k+1])<0) {
					tempString = wordRay[k];
					wordRay[k] = wordRay[k+1];
					wordRay[k+1] = tempString;
				}
			}
		}
	}

	public String toString()
	{
		String output="";
		for(int i = 0; i<wordRay.length; i ++) {
			output = output + " " + wordRay[i];
		}
		
		return output+"\n\n";
	}
}