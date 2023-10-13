public class Greeter
{
   public String greet()
   {
      return "Hi";
   }

   public static void main(String[] args)
   {
      Greeter g1 = new Greeter();
      System.out.println(g1.greet());
      Greeter g2 = new MeanGreeter();
      System.out.println(g2.greet());
   }
}