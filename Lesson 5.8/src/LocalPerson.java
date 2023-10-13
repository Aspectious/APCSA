public class LocalPerson
{
   private String name;
   private String email;

   public LocalPerson(String initName, String initEmail)
   {
      name = initName;
      email = initEmail;
   }

   public String toString()
   {
     String name = "unknown";
     // The local variable name here will be used,
     //  not the instance variable name.
     return  name + ": " + email;
   }

}