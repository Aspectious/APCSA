public class APCourse extends Course{
	private String APexamDate;
	public static void main(String[] args){
        APCourse csa = new APCourse();
        System.out.print("Is an APcourse a Course? ");
        System.out.println(csa instanceof Course);
     }
  }