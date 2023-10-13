import java.util.*;
import java.awt.*;

public class BoolTestRef
{
   public static void main(String[] args)
   {
       World world = new World(300,300);
       Turtle juan = new Turtle(world);
       Turtle mia = new Turtle(world);

       // Will these print true or false?
       System.out.println(juan == mia);
       Turtle friend = mia; // set friend to be an alias for mia
       System.out.println(friend == mia);
   }
 }
 