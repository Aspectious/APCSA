import java.util.*;
import java.awt.*;

public class TurtleDraw8
{
  public static void main(String[] args)
  {
      World habitat = new World(500,500);
      Turtle yertle = new Turtle(habitat);
      // Make yertle draw an 8 with 2 squares
      yertle.forward();
  }
}
