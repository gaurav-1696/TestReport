package comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student1> {

	@Override
	public int compare(Student1 o1, Student1 o2) {
		
		//return o1.dept.compareTo(o2.dept);
		//return o1.name.compareTo(o2.name);
		//return o1.marks=o2.marks;
		if(o1.marks>o2.marks)
			return 1;
		else if(o1.marks<o2.marks)
			return -1;
		else
			return 0;
		
	}

}
