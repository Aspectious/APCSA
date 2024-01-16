
public class grr {
	public static void main(String[] args) {
		Event[] evs = new Event[3];
		evs[0] = new Event("Gym crunchers meet", "gym", 30, "public", false);
		evs[1] = new Event("Book club meeting", "School", 10, "private", false);
		evs[2] = new Event("Readers' Annual contest", "Library", 300, "public", false);
		
		for (int i=0; i<evs.length; i++) {
			System.out.println(evs[i]);
		}
	}
}
