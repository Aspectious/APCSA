import java.util.Arrays;

public class InsertionSort
{
   public static void insertionSort(int[] elements)
   {
	   int iterations = 0;
	   int comparisions =0;
      for (int j = 1; j < elements.length; j++)
      {
         int temp = elements[j];
         int possibleIndex = j;
         iterations++;
         while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
         {
        	 comparisions++;
            elements[possibleIndex] = elements[possibleIndex - 1];
            possibleIndex--;
         }
         elements[possibleIndex] = temp;
      }
      System.out.println("iterations: " + iterations);
      System.out.println("comparisions: " + comparisions);
  }

   public static void main(String[] args)
   {
	   int[] arr1 = {1,2,3,5,4};
      System.out.println(Arrays.toString(arr1));
      insertionSort(arr1);
      System.out.println(Arrays.toString(arr1));
   }
}
