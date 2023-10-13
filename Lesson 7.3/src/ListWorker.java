import java.util.*;
public class ListWorker
{
   private ArrayList<String> nameList;

   public ListWorker(ArrayList<String> theNames)
   {
       nameList = theNames;
   }

   public boolean removeName(String name)
   {
       boolean found =   // true or false?
       int index = 0;
       while (index < nameList.size())
       {
           if (name.equals(nameList.get(index)))
           {
               nameList.remove(index);
               found =    // true or false?
           }
           else index++;
       }
       return found;
    }

    public static void main(String[] args)
    {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Amun");
        myList.add("Ethan");
        myList.add("Donnie");
        myList.add("Ethan");
        ListWorker listWorker = new ListWorker(myList);
        System.out.println(listWorker.nameList);
        listWorker.removeName("Ethan");
        System.out.println("After removing Ethan: "
                  + listWorker.nameList);
    }
}
