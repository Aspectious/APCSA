import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		System.out.print("Enter A String: ");
		Scanner scan = new Scanner(System.in);
;		longestStreak(scan.nextLine());
	}
	public static void longestStreak(String str) {
		int longest = 0;
		String longestLetter = "";
		int index = 0;
		String letter = "";
		
		for (int i = 0; i<str.length(); i++) {
			String c = str.substring(i,i+1);
			if (!(c.equals(letter))||(i==str.length()-1)) {
				String streak = str.substring(index,i+1);
				if (i==str.length()-1) streak += letter;
				if (streak.length() > longest) {
					longestLetter = letter;
					longest = streak.length()-1;
				}
				index = i;
				letter = str.substring(i,i+1);
			}
		}
		System.out.println(longestLetter +" "+ longest);
	}
}
