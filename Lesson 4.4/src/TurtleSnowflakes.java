import java.util.*;
import java.awt.*;

public class TurtleSnowflakes
{
  public static void main(String[] args)
  {
      World world = new World(800,800);
      Turtle y = new Turtle(world);      
      y.setColor(Color.blue);

      // Use this variable in the loops
      int turnAmount = 30;
      Color[] colors = {Color.red,Color.orange,Color.yellow,Color.green,Color.blue,Color.pink};
      for (int i =0; i<=8; i++) {
    	  
    	  y.turn(45);
    	  for (int j =0; j<=4; j++ ) {
    		  y.setPenColor(colors[j%colors.length]);
    		  y.forward(10);
    		  y.turn(90);
    	  }
      }


  }
}
