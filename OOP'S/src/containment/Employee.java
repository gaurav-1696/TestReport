package containment;

public class Employee {
  int id,salary;
  String name,cdept,contact,address;
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
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCdept() {
	return cdept;
}
public void setCdept(String cdept) {
	this.cdept = cdept;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
  public String toString()
  {
	  return id+" "+name+" "+cdept+" "+salary+" "+contact+" "+address;
  }
}
