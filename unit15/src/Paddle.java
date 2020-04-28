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
   public Paddle(int x, int y, int w, int h, int mySpeed) {
	   super(x,y,w,h);
	   speed = mySpeed;
   }
  



public Paddle(int x, int y, int w, int h, Color green, int mySpeed) {
	 super(x,y,w,h,green);
	   speed = mySpeed;
}


public void moveUpAndDraw(Graphics window)
   {
		draw(window,Color.white);
		setY(getY()-getSpeed());
		draw(window, super.getCol());

   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window,Color.white);
	   setY(getY()+getSpeed());
	   draw(window, super.getCol());

   }

   //add get methods
   public int getSpeed() {
	   return speed;
   }
   public int getX() {
	   return super.getX();
   }
   public int getY() {
	   return super.getY();
   }
   public int getW() {
	   return super.getWidth();
   }
   public int getH() {
	   return super.getHeight();
   }
   public Color getColor() {
	   return super.getCol();
   }
   public String toString() {
	   String output = "" + getX() + " " + getY() + " " + getW() + " " + getH() + " " + getColor() + " " + speed;
	   return output;
   }
   
   //add a toString() method
}