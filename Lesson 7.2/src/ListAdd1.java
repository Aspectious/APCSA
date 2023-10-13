import java.util.*;  // import all classes in this package.
public class ListAdd1
{
   public static void main(String[] args)
   {
       ArrayList<String> nameList = new ArrayList<String>();
       nameList.add("Diego");
       System.out.println(nameList);
       nameList.add("Grace");
       System.out.println(nameList);
       nameList.add("Diego");
       System.out.println(nameList);
       System.out.println(nameList.size());
   }
}