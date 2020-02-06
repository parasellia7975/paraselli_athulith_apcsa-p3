//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String firstLetter = "" + a.charAt(0);
	   String lastLetter = "" + a.charAt(a.length()-1);
	   firstLetter = firstLetter.toUpperCase();
	   lastLetter = lastLetter.toUpperCase();
	   
	   if(firstLetter.equals("A") || firstLetter.equals("E") || firstLetter.equals("I") || firstLetter.equals("O") || firstLetter.equals("I")){
		   return "yes";
	   }
	   if(lastLetter.equals("A") || lastLetter.equals("E") || lastLetter.equals("I") || lastLetter.equals("O") || lastLetter.equals("I")){
		   return "yes";
	   }
		return "no";
	}
}