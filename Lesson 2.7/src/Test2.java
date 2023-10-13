public class Test2
{
   public static void main(String[] args)
   {
     String message = "Hello!";

     System.out.println(message.compareTo("Hello!"));
     System.out.println(message.compareTo("And"));
     System.out.println(message.compareTo("Zoo"));

     System.out.println(message.equals("Hello!"));
     System.out.println(message.equals("hello!"));
   }
}