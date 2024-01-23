public class DivideBy10
{
   public static void main(String[] args)
   {
      int number = 154;
      while (number > 0) {
          System.out.println(number % 10);
          number /= 10;
      }
   }
}
