package getter_Setter;

public class Student {
	int id;
	String name, dept, city, contact,contact1;
	double percentage;
	Student() {
	}

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setMarks(double percentage) {
		this.percentage = percentage;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getcontact1()
	{
		return contact1;
	}
	public void setContact1(String contact1)
	{
		this.contact1=contact1;
	}

	public String toString() {
		return id + " " + name + " " + percentage + " " + dept + " " + city + " " + contact;

	}
	
	void percentage()
	{
		if (percentage >= 80) {
			System.out.println("Grade A");
		} else if (percentage >= 60) {
			System.out.println("Grade B");
		} else if (percentage >= 50) {
			System.out.println("Grade C");
		}
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("Details of Student:");
		s1.setId(102);
		s1.setName("rio");
		s1.setDept("mech");
		s1.setMarks(60);
		s1.setCity("nashik");
		s1.setContact("9145786555");
		System.out.println(s1);
		s1.percentage();
		}
}
