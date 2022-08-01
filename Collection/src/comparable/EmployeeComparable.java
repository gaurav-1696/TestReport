package comparable;

import java.util.ArrayList;
import java.util.Collections;
public class EmployeeComparable {
public static void main(String[] args) {
	ArrayList<Employee> al=new ArrayList<>();
	
	al.add(new Employee(1, "Raj", "HR", 60000));
	al.add(new Employee(12, "Rahul", "sales", 70000));
	al.add(new Employee(22, "Riya", "HR", 60000));
	al.add(new Employee(17, "Ramesh", "Marketing", 50000));
	al.add(new Employee(6, "Anajali", "HR", 60000));
	al.add(new Employee(5, "Pooja", "HR executive", 65000));
	al.add(new Employee(7, "Mamta", "admin", 59000));
	
	Collections.sort(al);  //ascending sorting
//	Collections.reverse(al);  //descending 
	System.out.print(al);
	
}
}
