import java.util.*;
import java.awt.*;

public class TurtleDrawSquare
{
  public static void main(String[] args)
  {
      World world = new World(300,300);
      Turtle yertle = new Turtle(world);

      // Change the following code to use a for loop to draw the square
      for (int i =0; i<=4; i++) {
    	  yertle.forward();
          yertle.turn(90);
      }
  }
}

