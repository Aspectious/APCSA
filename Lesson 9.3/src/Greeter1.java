public class Greeter1
{
   public String greet()
   {
      return "Hi";
   }

   public String greet(String who)
   {
      return "Hello " + who;
   }

   public static void main(String[] args)
   {
      Greeter1 g1 = new Greeter1();
      System.out.println(g1.greet("Sam"));
      Greeter1 g2 = new MeanGreeter1();      
      System.out.println(g2.greet("Nimish"));
   }
}