/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C:\\\\Users\\\\pathu\\\\Documents\\\\GitHub\\\\paraselli_athulith_apcsa-p3\\\\unit16\\\\src\\\\images\\\\temple.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue() {
	  Picture beach = new Picture("C:\\\\Users\\\\pathu\\\\Documents\\\\GitHub\\\\paraselli_athulith_apcsa-p3\\\\unit16\\\\src\\\\images\\\\temple.jpg");
	    beach.explore();
	    beach.zeroAllExceptBlue();
	    beach.explore();
  }
  
  public static void testKeepOnlyRed() {
	  Picture beach = new Picture("C:\\\\Users\\\\pathu\\\\Documents\\\\GitHub\\\\paraselli_athulith_apcsa-p3\\\\unit16\\\\src\\\\images\\\\temple.jpg");
	    beach.explore();
	    beach.zeroAllExceptRed();
	    beach.explore();
  }
  
  
  public static void testKeepOnlyGreen() {
	  Picture beach = new Picture("C:\\\\Users\\\\pathu\\\\Documents\\\\GitHub\\\\paraselli_athulith_apcsa-p3\\\\unit16\\\\src\\\\images\\\\temple.jpg");
	    beach.explore();
	    beach.zeroAllExceptGreen();
	    beach.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
	  Picture beach = new Picture("C:\\\\Users\\\\pathu\\\\Documents\\\\GitHub\\\\paraselli_athulith_apcsa-p3\\\\unit16\\\\src\\\\images\\\\temple.jpg");
	    beach.explore();
	    beach.mirrorVertical();
	    beach.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\\\Users\\\\pathu\\\\Documents\\\\GitHub\\\\paraselli_athulith_apcsa-p3\\\\unit16\\\\src\\\\images\\\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture temple = new Picture("C:\\Users\\pathu\\Documents\\GitHub\\paraselli_athulith_apcsa-p3\\unit16\\src\\images\\arch.jpg");
    temple.explore();
    temple.mirrorVertical();
    temple.explore();
  }
  
  
  public static void testNegate() {
	  Picture beach = new Picture("C:\\\\Users\\\\pathu\\\\Documents\\\\GitHub\\\\paraselli_athulith_apcsa-p3\\\\unit16\\\\src\\\\images\\\\temple.jpg");
	    beach.explore();
	    beach.negate();
	    beach.explore();  
  }
  
  public static void testGrayscale() {
	  
	  Picture beach = new Picture("C:\\\\Users\\\\pathu\\\\Documents\\\\GitHub\\\\paraselli_athulith_apcsa-p3\\\\unit16\\\\src\\\\images\\\\temple.jpg");
	    beach.explore();
	    beach.Grayscale();
	    beach.explore(); 
  }
  
  public static void testMirrorGull() {
	  
	  Picture beach = new Picture("C:\\Users\\pathu\\Documents\\GitHub\\paraselli_athulith_apcsa-p3\\unit16\\src\\images\\seagull.jpg");
	    beach.explore();
	    beach.mirrorVertical();
	    beach.explore(); 
  }
  
  public static void testMirrorDiagonal() {
	  Picture beach = new Picture("C:\\Users\\pathu\\Documents\\GitHub\\paraselli_athulith_apcsa-p3\\unit16\\src\\images\\seagull.jpg");
	    beach.explore();
	    beach.mirrorDiagonal();
	    beach.explore(); 
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("1000x1000.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testCopy() {
	  Picture canvas = new Picture("640x480.jpg");
	    canvas.createCollage();
	    canvas.explore();  
  }
  
 
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}