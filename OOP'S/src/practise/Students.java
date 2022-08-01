package practise;

import java.util.Scanner;

public class Students {
  int id;String name,dept,city,contact;
  double percentage;
  char grade;
  Students()
  {}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
public char getGrade() {
	return grade;
}
public void setGrade(char grade) {
	this.grade = grade;
}
  public String toString()
  {
	  return id+" "+name+" "+percentage+" "+dept+" "+city+" "+contact;
  }
  void percentage()
  {
	  if(percentage>=80)
	  {
		  System.out.println("A Grade");
	  }
	  else if(percentage>=60)
	  {
		  System.out.println("B Grade");
	  }
	  else if(percentage>=50)
	  {
		  System.out.println("C Grade");
	  }
	
  }
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the id,name,percentage,dept,city,contact");
	int id=sc.nextInt();
	String name=sc.next();
	int percentagr=sc.nextInt();
	String dept=sc.next();
	String city=sc.next();
	String contact=sc.next();
	  Students s=new Students();
	  s.setId(id);
	  s.setName(name);
	  s.setPercentage(percentagr);
	  s.setDept(dept);
	  s.setCity(city);
	  s.setContact(contact);
	  System.out.println(s.getId()+" "+s.getName()+" "+s.getPercentage()+" "+s.getDept()+" "+s.getCity()+" "+s.getContact());
	  System.out.println(s);
	   s.percentage();
	 sc.close();   
}
}
