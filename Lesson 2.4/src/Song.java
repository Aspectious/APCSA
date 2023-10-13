public class Song
{

    public void verse(String animal, String noise)
    {
        System.out.println("Old MacDonald had a farm");
        chorus();
        System.out.println("And on that farm he had a " + animal);
        chorus();
        System.out.println("With a " + noise + " " + noise + " here,");
        System.out.println("And a " + noise + " " + noise + " there,");
        System.out.println("Old MacDonald had a farm");
        chorus();
    }
    public void chorus()
    {
        System.out.println("E-I-E-I-O");
    }

    public static void main(String[] args)
    {
       Song s = new Song();
       s.verse("cow", "moo");
       s.verse("duck","quack");
    }
}
