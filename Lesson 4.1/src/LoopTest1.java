public class LoopTest1
{
   public static void main(String[] args)
   {
     int n = 17;
     // METHOD 1
     for (int i =(-n); i <=n; i++) if (Math.abs(i%2) == 1) System.out.println(i);
     
     
     // METHOD 2
     /*
     int i = (-n);
     while (i <= n) {
    	 if (Math.abs(i%2) == 1) System.out.println(i);
    	 i++;
     }
     */
   }
}
