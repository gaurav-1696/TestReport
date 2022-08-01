package hashmap;

import java.util.Comparator;

public class StudentComparator1 implements Comparator<Student> {

	public int compare(Student x1, Student x2) {
		// TODO Auto-generated method stub
		return x1.age-x2.age;
	}

}
