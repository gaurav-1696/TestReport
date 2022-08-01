package containment;

import java.util.Scanner;

public class DepartmentEmpmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentEmp dept[] = new DepartmentEmp[2];
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter the name, total emp department");
			String dname = sc.next();
			int totalemp = sc.nextInt();

			Employee emp[] = new Employee[2];

			for (int j = 0; j < 2; j++) {
				System.out.println("enter the id,name,dept,salary,contact,address" + (j + 1));
				int id = sc.nextInt();
				String name = sc.next();
				String cdept = sc.next();
				int salary = sc.nextInt();
				String contact = sc.next();
				String address = sc.next();
				Employee e = new Employee();
				e.setId(id);
				e.setName(name);
				e.setCdept(cdept);
				e.setSalary(salary);
				e.setContact(contact);
				e.setAddress(address);
				emp[j] = e;
			}
			DepartmentEmp d = new DepartmentEmp();
			d.setDname(dname);
			d.setTotalemp(totalemp);
			d.setEmp(emp);
			dept[i] = d;

		}
		// System.out.println(Arrays.toString(dept);
		for (DepartmentEmp t : dept) {
			for (Employee s : t.emp) {
//				if (s.getAddress().equals("pune") && s.getSalary() > 30000)
//					System.out.println(t.dname + " " + s.name + " " + s.salary + " " + s.contact + " " + s.address);
				int bonus = 0;
				if (s.getSalary() > 50000)
				{
					bonus = s.getSalary() * 15 / 100;
					System.out.println("Curent salary: " + t.dname + " " + s.name + " " + s.getSalary());
					System.out.println("new Salary: " + t.dname + " " + s.name + " " + (s.getSalary() + bonus));
				}
			}
		}

		sc.close();
	}

}

