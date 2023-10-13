public class People
{
    private String name;

    public People(String theName)
    {
        this.name = theName;
    }

    public static void main(String[] args)
    {
        People p1 = new People("Kairen");
        People p2 = new People("Jewel");
        People p3 = new People("Kairen");
        People p4 = p3;
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p3));
        System.out.println(p3.equals(p4));
    }
}