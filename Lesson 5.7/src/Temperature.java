public class Temperature
{
	  private double temperature;
	  public static double maxTemp = 0;

	  public Temperature(double t)
	  {
	      temperature = t;
	      if (t > maxTemp)
	         maxTemp = t;
	  }

	  public static void printMax()
	  {
	     System.out.println(maxTemp);
	  }
 }
 