
public class RandomLetterChooser extends RandomStringChooser{

	public RandomLetterChooser(String str) {
		
		super(getSingleLetter(str));
		
	}
	
	public static String[] getSingleLetter(String str) {
		String[] wordList = new String[str.length()];
		for(int i = 0; i<str.length(); i++) {
			wordList[i] = "" + str.charAt(i);
			
		}
		return wordList;
	}

	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String[] wordArray = {"wheels", "on" ,"the" , "bus"};
		RandomStringChooser sChooser = new RandomStringChooser(wordArray);
		for(int i = 0; i < 6; i++) {
			System.out.print(sChooser.getNext() + " ");
		}
	}
	

}



