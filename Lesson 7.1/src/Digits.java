import java.util.*;

public class Digits
{
   /** A list of digits */
   private ArrayList<Integer> digitList;

   /** Constructs a list of digits from the given number */
   public Digits(int number)
   {
       // initialize digitList to an empty ArrayList of Integers
	   digitList = new ArrayList<Integer>();

       // Use a while loop to add each digit in number to digitList
       int num = number;
       while (num>0) {
       	digitList.add(num % 10);
       	num /= 10;
       }
   }

   /** returns the string representation of the digits list */
   public String toString()
   {
	   int[] finalList = new int[digitList.size()];
	for (int i=0; i<digitList.size(); i++) {
		finalList[i] = digitList.get(digitList.size()-1-i);
	}
      return digitList.toString();
   }

   public static void main(String[] args)
   {
      Digits d1 = new Digits(154);
      System.out.println(d1);
   }
}
