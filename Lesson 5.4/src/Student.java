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

   // accessor methods - getters
   /** getName()  @return name */
   public String getName()
   {
      return name;
   }
   /** getEmail()  @return email */
   public String getEmail()
   {
      return email;
   }
   /** getName()  @return id */
   public int getId()
   {
      return id;
   }
}