public class Test2
{
public static void main(String[] args)
{
        		int[][] array = {{1,2,3},{4,5,6}};
        		for (int row = array.length-1 ; row>=0; row--)
        		{
            		for (int col = array[row].length-1; col>=0; col--)
            		{
                 			System.out.println( array[row][col] );
            		}
         		}
   	}
}
