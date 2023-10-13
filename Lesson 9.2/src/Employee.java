public class Employee extends Person
{
   private int id;
   public static int nextId = 1;

   public Employee(String theName)
   {
      super(theName);
      id = nextId;
      nextId++;
   }

   public int getId()
   {
      return id;
   }

   public static void main(String[] args)
   {
      Employee emp = new Employee("Dani");
      System.out.println(emp.getName());
      System.out.println(emp.getId());
   }
}
