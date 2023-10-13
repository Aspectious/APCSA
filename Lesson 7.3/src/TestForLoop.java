import java.util.*;
public class TestForLoop
{
    public static void main(String[] args)
    {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(50);
        myList.add(30);
        myList.add(20);
        int total = 0;
        for (int i=0; i <= myList.size(); i++)
        {
            total = total + myList.get(i);
        }
        System.out.println(total);
    }
}