import java.util.*;

public class StudentList
{
   // main method for testing
   public static void main(String[] args)
   {
       ArrayList<Student> roster = new ArrayList<Student>();
       roster.add(new Student("Skyler", "skyler@sky.com", 123456));
       roster.add(new Student("Ayanna", "ayanna@gmail.com", 789012));
       // Replace this with a for each loop that prints out each student on a separate line
       for (Student stu : roster) {
    	   System.out.println(stu);
       }
   }
 }

class Student
{
   private String name;
   private String email;
   private int id;

   public Student(String initName, String initEmail, int initId)
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

