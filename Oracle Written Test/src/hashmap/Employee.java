package hashmap;



public  class Employee implements Comparable<Employee> {
int id,salary; 
String name,dept;
Profile p;
public Employee(int id, String dept, String name, int salary, Profile p) {
	
	this.id = id;
	this.salary = salary;
	this.name = name;
	this.dept = dept;
	this.p = p;
}

public String toString() {
	return  id + " " + salary + " " + name + " " + dept + " " + p ;
}

public int compareTo(Employee s) {

	if(this.p.country.equals(s.p.country))
	 
		return this.p.state.compareTo(s.p.state);
	
	else
	
		return this.p.country.compareTo(s.p.country);
	
}



}



