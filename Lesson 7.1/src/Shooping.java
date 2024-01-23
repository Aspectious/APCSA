import java.util.*;
public class Shooping
{
   public static void main(String[] args)
   {
       ArrayList<String> shoopingList = new ArrayList<String>();
       System.out.println("Size: " + shoopingList.size());
       shoopingList.add("carrots");
       System.out.println(shoopingList);
       //add bread to your list
       shoopingList.add("bread");
       System.out.println(shoopingList);
       //add chocolate to your list
       shoopingList.add("Chocolate");
       System.out.println(shoopingList);
       System.out.println("Size: " + shoopingList.size());
       ArrayList<Integer> quantities = new ArrayList<Integer>();
       quantities.add(2);
       //add 4 to the quantities list
       
       System.out.println(quantities);
  }
}
