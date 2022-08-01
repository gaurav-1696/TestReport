package hashmap;

import java.util.Comparator;

public class StudentComparator2 implements Comparator<Student> {

	@Override
	public int compare(Student x1, Student x2) {
		// TODO Auto-generated method stub
		return x1.name.compareTo(x2.name);
	}

}
