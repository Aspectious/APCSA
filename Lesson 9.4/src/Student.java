class Student extends Person
{
    private int id;
    private static int nextId = 0;

    public Student(String theName)
    {
        super(theName);
        id = nextId;
        nextId++;
    }

    public String getFood()
    {
        String output = super.getFood();
        return output + " and Pizza";
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int theId)
    {
        this.id = theId;
    }
}