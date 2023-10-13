public class RecursiveBinarySearch
{
    public static int recursiveBinarySearch(
        int[] array, int start, int end, int target)
    {
        int middle = (start + end) / 2;
        // base case: check middle element
        if (target == array[middle])
        {
            return middle;
        }
        // base case: check if we've run out of elements
        if (end < start)
        {
            return -1; // not found
        }
        // recursive call: search start to middle
        if (target < array[middle])
        {
            return recursiveBinarySearch(array, start, middle - 1, target);
        }
        // recursive call: search middle to end
        if (target > array[middle])
        {
            return recursiveBinarySearch(array, middle + 1, end, target);
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] array = {3, 7, 12, 19, 22, 25, 29, 30};
        int target = 25;
        int foundIndex = recursiveBinarySearch(array, 0, array.length - 1, target);
        System.out.println(target + " was found at index " + foundIndex);
    }
}