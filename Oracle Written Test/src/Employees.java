import java.util.Scanner;

public class Employees {
	int emp_id, salary;
	String name;

	Employees(int emp_id, String name, int salary) {
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return emp_id + " " + name + " " + salary;
	}

	public static void main(String[] args) {

		int emp_id, salary;
		String name;

		System.out.println("enter emp_id,name,salary");
		Scanner sc = new Scanner(System.in);
		emp_id = sc.nextInt();
		name = sc.next();
		salary = sc.nextInt();

		Employee e = new Employee(emp_id, name, salary);
		System.out.println(" employee");
		System.out.println(e);
    sc.close();
	}
}