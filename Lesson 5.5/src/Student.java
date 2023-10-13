
public class Student {
	private String name;
    private String email;
    private int id;

    public Student(String initName, String initEmail, int initId)
    {
       name = initName;
       email = initEmail;
       id = initId;
    }

    // Setters

    public void setName(String newName)
    {
        name = newName;
    }

    public void setEmail(String newEmail)
    {
        email = newEmail;
    }

    // Getters

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public int getId()
    {
        return id;
    }

    public String toString()
    {
        return id + ": " + name + ", " + email;
    }
}
