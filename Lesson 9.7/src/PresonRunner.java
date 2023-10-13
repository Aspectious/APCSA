
public class PresonRunner {
    public static void main(String[] args)
    {
        Person p = new Person("Sila");
        Student s = new Student("Tully", 1001);
        System.out.println(p); // call Person toString
        System.out.println(s); // call Student toString
        // Uncomment the code below to test the APStudent class
        /*
        APStudent ap = new APStudent("Ayanna", 1002, 5);
        System.out.println(ap);
        */
    }
}
