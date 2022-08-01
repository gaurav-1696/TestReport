
package inheritence;

public class Faculty extends Person {
	int id, salary, newsalary;
	String subject, perrating;

	void setFacultyData(int id, int salary, String subject, String perrating, int newsalary) {
		this.id = id;
		this.salary = salary;
		this.subject = subject;
		this.perrating = perrating;
	}

	void bonus() {
		if (perrating.equals("A")) {
			int newsalary = salary + salary * 15 / 100;
			System.out.println("New salary: " + newsalary);
		}
		if (perrating.equals("B")) {
			int newsalary = salary + salary * 10 / 100;
			System.out.println("New Salary: " + newsalary);
		}
		if (perrating.equals("C")) {
			int newsalary = salary + salary * 5 / 100;
			System.out.println("New salary: " + newsalary);
		}
		if (perrating.equals("D")) {
			int newsalary = salary + salary * 3 / 100;
			System.out.println("New salary: " + newsalary);
		}

	}

	public String toString() {
		return id + " " + name + " " + subject + " " + perrating + " " + salary;
	}
}
