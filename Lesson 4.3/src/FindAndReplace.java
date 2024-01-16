public class FindAndReplace
{
   public static void main(String[] args)
   {
     String message = "11Ha11ve1 a1 11lo1n11g a1n1d 1ha11pp11y 1l11i111f1e";
     int index = 0;
     int counter = 0;
     // while more 1's in the message
     while (message.indexOf("1") >= 0)
     {
    	try {
			Thread.sleep((long) (Math.random()*1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // Find the next index for 1
        index = message.indexOf("1");
        counter++;
        System.out.println("Found a 1 at index: " + index);
        // Replace the 1 with a l at index by concatenating substring up to index and then the rest of the string.
        String firstpart = message.substring(0,index);
        String lastpart = message.substring(index+1);
        message = firstpart + "" + lastpart;
        System.out.println("Replaced 1 with '' at index " + index);
        System.out.println("The message is currently " + message + " but we aren't done looping yet!");
     }
     System.out.println("Cleaned text: " + message + "; Counts: " + counter);
   }
}
