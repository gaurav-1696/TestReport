package hashmap;

import java.util.ArrayList;
import java.util.Collections;



public class EX2_StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> d=new ArrayList<>();
		d.add(new Student(7,21,"professor"));
		d.add(new Student(1,23,"rio"));
		d.add(new Student(2,20,"tokiyo"));
		d.add(new Student(3,21,"bogodha"));
		d.add(new Student(5,22,"helsenky"));
		d.add(new Student(4,23,"rakel"));
		Collections.sort(d,new StudentComparator1());
		System.out.println(d);
		Collections.sort(d,new StudentComparator2());
		System.out.println(d);
		Collections.sort(d,new StudentComparator3());
		System.out.println(d);
	}

}
