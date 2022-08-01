package treeSet;

import java.util.TreeSet;

public class EmployeeTreeSet {
public static void main(String[] args) {
	TreeSet<Employee >  ts=new TreeSet<Employee>();
	
	ts.add(new Employee(121,"Gaurav","Developer",84500));
	ts.add(new Employee(154,"madhav","HR",85000));
	ts.add(new Employee(120,"Rohini","Developer",54000));
	ts.add(new Employee(45,"Kalpana","HR",45000));
	ts.add(new Employee(658,"Tokiyo","tester",60000));
	ts.add(new Employee(236,"Gauri","Developer",59000));
	System.out.println(ts);
}
}
