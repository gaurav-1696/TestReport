package getter_Setter;
import java.util.Scanner;
public class Employee {
	int id, salary;
	String firstname, lastname, dept, design;
	Employee() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public String toString() {
		return id + " " + firstname + " " + lastname + " " + dept + " " + design + " " + salary + " ";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee details:");
		int id = sc.nextInt();
		String firstname = sc.next();
		String lastname = sc.next();
		String dept = sc.next();
		String design = sc.next();
		Employee e1 = new Employee();
		e1.setId(id);
		e1.setFirstname(firstname);
		e1.setLastname(lastname);
		e1.setDept(dept);
		e1.setDesign(design);
		e1.setSalary(id);
		System.out.println(e1);
		sc.close();
	}
}
