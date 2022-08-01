package practise;

import java.util.Arrays;

public class Employee {
 int id,salary;
 String name;
 MyDate d[];
 Dept s[];
 Employee(int salary,int id,String name,Dept s[])
 {
	 //,MyDate d[]
	 this.id=id;
	 this.name=name;
	// this.d=d;
	 this.s=s;
	 
 }
 public String toString() {
	 return id+" "+name+" "+Arrays.toString(s);
	 //+" "+Arrays.toString(d)
 }
}
