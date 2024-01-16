public class Test3
{
   public static void main(String[] args)
   {
     // declare, create, initialize arrays
	   String[] names = {"Jamal","Emily","Destiny","Mateo","Sofia"};
	   int[] highScores = {99,98,98,88,68};

     // Print corresponding names and scores
	 for (int i=0; i<names.length; i++) {
	     System.out.println(names[i] + " has a score of " + highScores[i]); 
	 }     
   }
}