
public class PetRunner {
	   public static void main(String[] args)
	   {
	      // Create 2 Pet objects and test all your methods
		   var samantha = new Pet("Samantha","Golden Retriever","dog",10,22.51d);
		   var jerry = new Pet("Jerry","bat","bat", 3,10.43d);
		   
		   System.out.println(samantha);
		   System.out.println(jerry);
		   
		   jerry.setWeight(99.32d);
		   System.out.println(jerry);
	   }
}
