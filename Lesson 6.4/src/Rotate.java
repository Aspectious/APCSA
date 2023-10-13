public class Rotate
{
   public static void main(String[] args)
   {
     int[ ] values = {6, 2, 1, 7, 12, 5};
     int first = values[0];
     for (int i = 0; i < values.length; i++)
     {
        // if it's not the last element, copy the next one over
       if (i < values.length - 1)
       {
           values[i] = values[i+1];
       }
       else {
          // last element gets first
          values[i] = first;
         }
     }
     // print them out to see the results
     for (int val : values)
     {
        System.out.print(val + " ");
     }
 }
}
