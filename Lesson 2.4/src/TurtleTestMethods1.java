import java.util.*;
import java.awt.*;

public class TurtleTestMethods1
{
  public static void main(String[] args)
  {
      World world = new World(300,300);
      Turtle yertle = new Turtle(world);

      yertle.forward(100);
      yertle.turnLeft();
      yertle.forward(75);

      world.show(true);
  }
}
