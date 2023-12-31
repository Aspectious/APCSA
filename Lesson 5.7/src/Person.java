public class Person
{
   // instance variables
   private String name;
   private String email;
   private String phoneNumber;

   // Static counter variable
   public static int personCounter = 0;

   // static method to print out counter
   public static void printPersonCounter() {
        System.out.println("Person counter: " + personCounter);
   }

   // constructor: construct a Person copying in the data into the instance variables
   public Person(String initName, String initEmail, String initPhone)
   {
      name = initName;
      email = initEmail;
      phoneNumber = initPhone;
      personCounter++;
   }

   // toString() method
   public String toString()
   {
     return  name + ": " + email + " " + phoneNumber;
   }

}