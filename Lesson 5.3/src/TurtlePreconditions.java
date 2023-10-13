import java.util.*;
import java.awt.*;

public class TurtlePreconditions
{
  public static void main(String[] args)
  {
      World world = new World(300,300);
      // Change 0,0 to other values outside of 0-300 to break the preconditions and see what happens
      Turtle t = new Turtle(0,0,world);
      t.turnRight();
  }
}
