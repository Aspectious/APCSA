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
	 int id_f = 0;
     for (int i=0; i < 5; i++) {
        int id = i;
        id_f = id;
     }
     // Can you access the blockScope variables i or id?
     System.out.println("i at the end of the loop is " + id_f);
     System.out.println("The last id is " + id_f);

     // Can toString() access parameter variables in Person()?
     return  name + ": " + email;
   }

   
}
