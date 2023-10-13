import java.util.*;

public class ArrayListLoop
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i < 5; i++)
        {
            arr.add(i);

        }
        for(int i=0; i < arr.size(); i++)
        {
            if (i % 2 == 0)
            {
                System.out.println("Removing element " + i + " : " + arr.get(i));
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }
}