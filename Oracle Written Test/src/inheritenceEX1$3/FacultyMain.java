package inheritenceEX1$3;

public class FacultyMain {

	public static void main(String[] args) {
		System.out.println("enter the id,name,subject,salary");
		Faculty f = new Faculty();

		f.setPersonData("Mr.GJ", "914574298", "Nashik", "Male");
		f.setFacultyData(10, 56000, "MATH");
		System.out.println(f);

	}

}
