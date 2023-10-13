
public class StudentRunner {
	public static void main(String[] args)
    {
        Student s1 = new Student("Skyler", "skyler@sky.com", 123456);
        System.out.println(s1);
        s1.setName("Skyler 2");
        // Main doesn't have access to email, use set method!
        s1.email = "skyler2@gmail.com";
        System.out.println(s1);
     }
}
