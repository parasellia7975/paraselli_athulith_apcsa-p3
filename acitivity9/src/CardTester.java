/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card test = new Card("Ace", "Clubs", 1);
		System.out.println(test);
		Card test2 = new Card("Ace", "Clubs", 1);
		System.out.println(test2);
		System.out.println(test.matches(test2));
		Card test3 = new Card("Jack", "Hearts", 11);
		System.out.println(test.matches(test3));
		System.out.println(test3);
		
	}
}
