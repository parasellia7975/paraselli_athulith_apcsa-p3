
public class RandomStringChooser {
	private String[] myWords;
	public RandomStringChooser(String[] words) {
		myWords = words;
	}
	
	public String getNext() {
		if(myWords.length == 0)
			return "NONE";
		int index = 0;
		String[] newMyWords = new String[0];
		int num = (int)(Math.random()*myWords.length);
		String returned = myWords[num];
		if(myWords.length>0) {
			newMyWords = new String[myWords.length-1];
		}
		
		for(int i = 0; i<myWords.length; i++) {
			if(!(myWords[i].equals(returned))) {
				newMyWords[index] = myWords[i];
				index += 1;
			}
		}
		myWords = newMyWords;
		return returned;
		
	}
	public void setWords(String[] words) {
		myWords = words;
	}

}
