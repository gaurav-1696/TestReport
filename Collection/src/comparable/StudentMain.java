package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

public static void main(String[] args) {
		
ArrayList<Student> s=new ArrayList<>();
s.add(new Student(1,"Gaurav","mech",78));
s.add(new Student(2,"Ganesh","computer",75));
s.add(new Student(3,"pravin","computer",75));
s.add(new Student(4,"madhura","it",85));
s.add(new Student(5,"pramod","mech",65));

Collections.sort(s);
System.out.println(s);
	}

}
