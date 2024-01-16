
public class Song {
	  // Add a public static variable called numVerses
	public static int numVerses;

	  // Change the method(s) to be static
	public static void Chorus(String num, String action) {
		numVerses++;
		System.out.println("(Verse " + numVerses + ")");
		System.out.println("The ants go marching " + num + " by " + num + ", hurrah, hurrah");
		System.out.println("The ants go marching " + num + " by " + num + ", hurrah, hurrah");
		System.out.println("The ants go marching " + num + " by " + num);
		System.out.println("The little one stops to " + action);
		System.out.println("And they all go marching down to the ground");
		System.out.println("To get out of the rain, BOOM! BOOM! BOOM! BOOM!");
		System.out.println();

	}
}
