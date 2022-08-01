import java.util.Scanner;

public class Employee {
	private int emp_id, salary;
	private String name;

	Employee() {
	}

	int getEmp_Id() {
		return emp_id;
	}

	void setEmp_Id(int emp_id) {
		this.emp_id = emp_id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getSalary() {
		return salary;
	}
	

	void setSalary(int salary) {
		this.salary = salary;
	}

	Employee(int emp_id, String name, int salary) {
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
		Employee e1 = new Employee();
		e1.setEmp_Id(emp_id);
		e1.setName(name);
		e1.setSalary(salary);
		System.out.println("Employee Detail(default):");
		System.out.println(e1);
		
		Scanner c = new Scanner(System.in);
		emp_id = c.nextInt();
		name = c.next();
		salary = c.nextInt();
		Employee e2  = new Employee(emp_id,name,salary);
		
		System.out.println("Employee Details using parameterized:");
		System.out.println(e2);
		sc.close();
		c.close();
	}

}
