
public class StudentToString {
	private String name;
	   private String email;
	   private int id;

	   public StudentToString(String initName, String initEmail, int initId)
	   {
	      name = initName;
	      email = initEmail;
	      id = initId;
	   }

	   // toString() method
	   public String toString()
	   {
	     return id + ": " + name + ", " + email;
	   }
}
