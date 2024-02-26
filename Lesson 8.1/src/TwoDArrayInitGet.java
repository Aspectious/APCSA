public class TwoDArrayInitGet
{
	public static void printLoc(String[][] arr, int index1, int index2) {
	      
	      String name = arr[index1][index2];
	      System.out.println(name + " is at [" + index1 + "," + index2 + "]");
	}
	
   public static void main(String[] args)
   {
      String[][] seatingInfo = { {"Jamal", "Maria"},
                                 {"Jake", "Suzy"},
                                 {"Emma", "Luke"},
                                 {"gRiffn","josh"}};
      
      printLoc(seatingInfo,3,1);

      printLoc(seatingInfo,3,0);

   }
}