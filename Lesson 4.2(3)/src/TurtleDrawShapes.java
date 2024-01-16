import java.util.*;
import java.awt.*;

public class TurtleDrawShapes
{
  public static void main(String[] args)
  {
	  World world = new World(500,500);
	  Turtle yertle = new Turtle(world);
	  yertle.penUp();
	  yertle.moveTo(250, 250);
	  yertle.penDown();
	  yertle.turnRight();
	  Color[] colors = {Color.red,Color.orange,Color.yellow,Color.green,Color.blue,Color.pink};
	  for (int s = 3; s<=1000;s++) {
		  yertle.setPenColor(colors[s%colors.length]);
		  for (int i=0; i<=s; i++) {
			  yertle.forward(s/80);
			  yertle.turn((2*((double)180/(double)(s/(double)(Math.random()+30)))));
		  }  
	  }
	  
 }
}