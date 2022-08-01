package treeSet;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
int id,salary;
String name,dept;
public Employee(int id,  String name, String dept,int salary) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.salary = salary;
}
@Override
public String toString() {
	return id + " " + salary + " " +name + " " + dept ;
}
@Override
public int compare(Employee o1, Employee o2) {
	
	return 0;
}

}
