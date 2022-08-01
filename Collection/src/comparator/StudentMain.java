package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student1> d=new ArrayList<>();
		d.add(new Student1(1,"Gaurav","mech",78));
		d.add(new Student1(2,"Ganesh","computer",75));
		d.add(new Student1(3,"Gauri","computer",75));
		d.add(new Student1(4,"madhura","it",85));
		d.add(new Student1(5,"pramod","mech",65));
		d.add(new Student1(4,"riya","computer",86));
		
		Collections.sort(d, new StudentComparator());
System.out.println(d);
	}

}
