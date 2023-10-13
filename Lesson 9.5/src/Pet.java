import java.util.*; // for ArrayList

public class Pet
{
    private String name;
    private String type;

    public Pet(String n, String t)
    {
        name = n;
        type = t;
    }

    public String toString()
    {
        return name + " is a " + type;
    }

    public static void main(String[] args)
    {
        ArrayList<Pet> petList = new ArrayList<Pet>();
        petList.add(new Pet("Sammy", "hamster"));
        petList.add(new Dog("Fido"));
        // This loop will work for all subclasses of Pet
        for (Pet p : petList)
        {
            System.out.println(p);
        }
    }
}