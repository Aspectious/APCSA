
public class StudentToString {
	private String name;
	   private String email;
	   private int id;
	   private int age;

	   public StudentToString(String initName, String initEmail, int initId, int iage)
	   {
	      name = initName;
	      email = initEmail;
	      id = initId;
	      age=iage;
	   }

	   // toString() method
	   public String toString()
	   {
	     return id + ": " + name + ", " + email + ", age " + age;
	   }
}
