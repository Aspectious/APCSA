public class NullTest
{
   public static void main(String[] args)
   {
     String s = null;   
     try {
    	 if (s.indexOf("a") >= 0)
         {
             System.out.println(s + " contains an a");
         }
     } catch (Exception e) {System.out.println(e);}
     if (s != null && s.indexOf("a") >= 0)
     {
         System.out.println(s + " contains an a");
     }
   }
}