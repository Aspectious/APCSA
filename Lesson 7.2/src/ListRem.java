import java.util.*;  // import all classes in this package.
public class ListRem
{
   public static void main(String[] arts)
   {
      ArrayList<Integer> list1 = new ArrayList<Integer>();
      list1.add(1);
      list1.add(2);
      list1.add(3);
      System.out.println(list1);
      list1.remove(1);
      System.out.println(list1);
   }
}