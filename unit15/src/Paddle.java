//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
      speed =5;
   }


   //add the other Paddle constructors

   public Paddle(int x, int y)
   {
		super(x,y);
      speed =5;
   }

   public Paddle(int x, int y, int mySpeed)
   {
		super(x,y);
      speed =mySpeed;
   }







   public void moveUpAndDraw(Graphics window)
   {


   }

   public void moveDownAndDraw(Graphics window)
   {


   }

   //add get methods
   public int getSpeed() {
	   return speed;
   }
   
   //add a toString() method
}