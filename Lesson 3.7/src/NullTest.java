public class NullTest
{
   public static void main(String[] args)
   {
     String s = null;   
     if (s.indexOf("a") >= 0)
     {
         System.out.println(s + " contains an a");
     }    
     if (s != null && s.indexOf("a") >= 0)
     {
         System.out.println(s + " contains an a");
     }
   }
}