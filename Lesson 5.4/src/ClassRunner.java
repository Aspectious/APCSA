public class ClassRunner
{
   // main method for testing
   public static void main(String[] args)
   {
      Student s1 = new Student("Skyler", "skyler@sky.com", 123456);
      System.out.println("Name:" +  s1.getName() );
      // Fix the bug here!
      System.out.println("Email:" +  s1.email );
      System.out.println("ID: " + s1.getId() );
   }
 }
/** Class Student keeps track of name, email, and id of a Student. */

