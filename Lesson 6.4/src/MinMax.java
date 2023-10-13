public class MinMax
{
   public static void main(String[] args)
   {
     int[ ] values = {6, 2, 1, 7, 12, 5};
     int min = values[0]; // initialize min to the first element
     for (int val : values)
     {
       if (val < min) // found a new min!
           min = val;
     }
     System.out.println("Min is " + min );
   }
}