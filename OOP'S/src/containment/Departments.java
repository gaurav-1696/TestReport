package containment;

import java.util.Arrays;

public class Departments {
	int id;
	String name;
	Student stud[];
	
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

	public Student[] getStud() {
		return stud;
	}

	public void setStud(Student[] stud) {
		this.stud = stud;
	}

	public String toString()
	{
		return id+" "+name+" "+Arrays.toString(stud)+"\n\n";
	}
}
