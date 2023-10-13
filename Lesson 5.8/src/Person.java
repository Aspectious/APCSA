public class Person
{
   private String name;
   private String email;

   public Person(String initName, String initEmail)
   {
      name = initName;
      email = initEmail;
   }

   public String toString()
   {
     for (int i=0; i < 5; i++) {
        int id = i;
     }
     // Can you access the blockScope variables i or id?
     System.out.println("i at the end of the loop is " + i);
     System.out.println("The last id is " + id);

     // Can toString() access parameter variables in Person()?
     return  initName + ": " + initEmail;
   }

   
}
