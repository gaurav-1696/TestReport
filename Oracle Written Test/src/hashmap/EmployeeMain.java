package hashmap;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		ArrayList <Employee> e=new ArrayList<>();
  e.add(new Employee(51,"satish","Sales",50000,new Profile("Goa","India")));
  e.add(new Employee(52,"lokesh","Developer",75000,new Profile("jammu","India")));
  e.add(new Employee(57,"satish","HR",91000,new Profile("Maharashtra","India")));
  e.add(new Employee(52,"monika","Automation",75800,new Profile("uttarakhand","India")));
  Collections.sort( e);
  System.out.println(e);
	}

}
