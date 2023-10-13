public class TestFormat
{
   public static void main(String[] args)
   {
     double number = 10 / 3;
     System.out.println(number);
     System.out.println( String.format("%.02f", number) );
   }
}