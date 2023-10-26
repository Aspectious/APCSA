public class Test3 {
	public static void main(String[] args) {
		String s1 = new String("test").intern(); // Makes a string object and makes it "Canonical", whatever that means
		String s2 = "test"; // Different memory location than s1
		String s3 = "test2"; // Different object entirey than s1.
		System.out.println("Result of s1 == s2: " + (s1 == s2));// I have been told this should be false. Nope. Java Disagrees.
		System.out.println("Result of s1 == \"test\": " + (s1 == "test")); // Same here
		System.out.println("Result of s1.equals(s2): " + (s1.equals(s2))); // I was told this was the "Right way" to do this. Sure. Totally.
		System.out.println("Result of s1 == \"test2\": " + (s1 == "test2"));
		System.out.println("Result of s1.equals(s3" + (s1.equals(s3)));
	}
}