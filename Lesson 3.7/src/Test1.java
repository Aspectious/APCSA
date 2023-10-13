public class Test1
{
   public static void main(String[] args)
   {
     String s1 = new String("Hello");
     String s2 = new String("Bye");
     String s3 = s2;   // s3 is now an alias for s2
     System.out.println(s3);
     System.out.println(s2 == s3);
     System.out.println(s2.equals(s3));
   }
}
