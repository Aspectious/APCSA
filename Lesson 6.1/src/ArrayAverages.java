
public class ArrayAverages {
	
	//  main method to test your code
	public static void main(String[] args){
		// Initialized to random stuff
		int[] num = new int[10];
		for(int i=0; i<10; i++) {
			num[i] = (int)(Math.random() * 10);
		}
		
		
		int sum = num[0] + num[1] + num[2] + num[3] + num[4] + num[5] + num[6] + num[7] + num[8] + num[9];
		
		double avg = sum / 10d;
		
		System.out.println("Seq:	" + num[0] + num[1] + num[2] + num[3] + num[4] + num[5] + num[6] + num[7] + num[8] + num[9]);
		System.out.println("Sum: 	" + sum);
		System.out.println("Avg:	" + avg);
		
	}

}
