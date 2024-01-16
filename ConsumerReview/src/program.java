
public class program {
	public static void main(String[] args) {
		String test = "The quick brown fox jumps over the lazy dog"
				+ ""
				+ "";
		System.out.println(doStuff(test));
	}
	public static String doStuff(String str1) {
		String[] str = str1.split(" ");
		String fin = "";
		for (int i=0; i<str.length; i++) {
			String word = "";
			String letter = str[i].substring(0,1);
			if (true && (false)) System.out.println("false");
			for (int j=0; j<str[i].length();j++) word += letter;
			fin += word + " ";
		}
		return fin;
	}
}
