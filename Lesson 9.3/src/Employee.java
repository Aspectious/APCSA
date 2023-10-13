public class Employee extends Person
{

   private static int nextId = 1;
   private int id;

   public Employee()
   {
      id = nextId;
      nextId++;
   }

   public int getId()
   {
      return id;
   }

   public static void main(String[] args)
   {
      Employee emp = new Employee();
      emp.setName("Dina");
      System.out.println(emp.getName());
      System.out.println(emp.getId());
   }
}
