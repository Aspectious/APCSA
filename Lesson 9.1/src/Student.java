public class Student extends Person {
	private int id;
	private double gpa;

	public Student(int studentID, double GPA, String name) {
		super(name);
		this.gpa = GPA;
		this.id = studentID;
	}

	public static void main(String[] args) {
		Student s = new Student(998306736, 3.4d, "Griffn");
		System.out.println(s instanceof Student);
		System.out.println(s instanceof Person);
		System.out.println(s);
	}

	public String toString() {

		return "" + super.toString() + " - " + id + " - gpa: " + gpa;
	}
}