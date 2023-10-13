public class TestFinal
{
   public static void main(String[] args)
   {
     final double PI = 3.14;
     System.out.println(PI);
     PI = 4.2; // This will cause a syntax error
   }
}
