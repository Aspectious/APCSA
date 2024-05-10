
public class MeanGreeter1 extends Greeter1{
	   public String greet()
	   {
	      return "Go away";
	   }
	   public String greet(String who) {
		   return greet() + " " + who;
	   }
}
