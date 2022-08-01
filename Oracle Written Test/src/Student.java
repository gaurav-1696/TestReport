
public class Student {
	int id;
	String stream;
	String name;

	Student(int i, String n, String a) {
		id = i;
		name = n;
		stream = a;
	}

	Student(Student s) {
		id = s.id;
		name = s.name;
		stream = s.stream;
	}

	void display() {
		System.out.println(id + " " + name + " " + stream);
	}

	public static void main(String[] args) {
		System.out.println("Details of Student:");
		Student std = new Student(51, "Hemant", "Science");
		Student std1 = new Student(std);

		std.display();
		std1.display();
	}
}
