/**
    Pet class (complete comments)
    @author Griffin D. Siebert (Aspectious)
    @since 12/1/23

*/
class Pet
{
   // keep track of the name, age, weight, type of animal, and breed of the pet
	private String name;
	private String breed;
	private String type;
	private int age;
	private double weight;

   // Write a constructor, accessor (get) methods, and a toString method. Use good commenting.
	
	// Defaults
	public Pet() {
		name = "Unknown";
		breed = "Unknown";
		type = "Unknown";
		age = -1;
		weight = -1;
	}
	
	// Constructor for pet
	public Pet(String iname,String ibreed,String itype, int iage, double iweight) {
		name = iname;
		breed = ibreed;
		type = itype;
		age = iage;
		weight = iweight;
	}
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	// Accessor Methods for instance variables
	public String getName(){return name;}
	public String getBreed(){return breed;}
	public String getType(){return type;}
	public int getAge() { return age;}
	public double getWeight() {return weight;}
	
	// Mutator Methods for instance variables
	public void setName(String newName) {name = newName;}
	public void setBreed (String newBreed) {breed = newBreed;}
	public void setType (String newType) {type = newType;}
	public void setAge(int newAge) {age = newAge;}
	public void setWeight(double newWeight) {weight = newWeight;}
	
	public String toString() {
		return "== Pet Entry ==" + "\n" +
				"Name:	" + name + "\n" +
				"Breed:	" + breed + "\n"+
				"Type:	" + type + "\n" +
				"Age:	" + age + "\n"  +
				"Weight:	" + weight + "\n" +
				"===============";
	}
	
	
   // Don't forget to complete the main method in the TesterClass below!
}