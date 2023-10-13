import java.util.*;
import java.awt.*;

public class DancingTurtles
{
  public static void main(String[] args)
  {

      World world = new World(500,400);
      Turtle yertle = new Turtle(world);

      // This is a loop that runs 10 times (you will learn to write loops in Unit 4)
      for(int i=1; i <= 10; i++)
      {
       // Can you choose a randomX between 0-500?
       // Can you adjust for the 20 pixel width of the turtle,
       // so it doesn't get cut off at the edges?
       // Move the range from 20 to 480.
       int randomX =
       // Can you choose a randomY between 0-400?
       // Can you adjust for the 20 pixel height of the turtle,
       // so it doesn't get cut off at the edges?
       int randomY =

       yertle.moveTo(randomX, randomY);
       yertle.turnRight();

       // Can you choose a random red, green, and blue value between 0-255?
       int randomR =
       int randomG =
       int randomB =

       yertle.setColor(new Color(randomR, randomG, randomB));

      } // end of loop
      world.show(true);
  }
}
