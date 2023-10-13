import java.util.*;
import java.awt.*;

public class TurtleConstructorTest
{
  public static void main(String[] args)
  {
      // Change the World constructor to 300x400
      World world1 = new World(300,300);

      // Change the Turtle constructor to put the turtle in the top right corner
      Turtle t1 = new Turtle(world1);

      t1.turnLeft();
  }
}
