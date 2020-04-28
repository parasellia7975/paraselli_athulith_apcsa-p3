//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y) {
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h) {
		super(x,y,w,h);
		xSpeed = 3;
		ySpeed = 1;
		
	}
	public Ball(int x, int y, int w, int h, Color c) {
		super(x,y,w,h,c);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int w, int h, int xSP, int ySP) {
		super(x,y,w,h);
		xSpeed = xSP;
		ySpeed = ySP;
	}
	public Ball(int x, int y, int w, int h, Color c, int xSP, int ySP) {
		super(x,y,w,h,c);
		xSpeed = xSP;
		ySpeed = ySP;
		
	}
	
	
	
	
	
	
	
	   
   //add the set methods
	public void setXSpeed(int x) {
		xSpeed = x;
	}
	public void setYSpeed(int y) {
		ySpeed = y;
	}
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   
	   draw(window,Color.white);
      setX(getX()+xSpeed);
      setY(getY()+ySpeed);
		//setY
      
		//draw the ball at its new location
      draw(window, super.getCol());
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball)obj;
		if(super.equals(other)&&getXSpeed() == other.getXSpeed()&&getYSpeed() == other.getYSpeed())
			return true;
		return false;



		
	}   

   //add the get methods
	public int getXSpeed() {
		return xSpeed;
	}
	public int getYSpeed() {
		return ySpeed;
	}

   //add a toString() method
	public String toString() {
		return "" +xSpeed + " " + ySpeed;
	}
}