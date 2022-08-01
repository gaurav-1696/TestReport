package polymorphismEX1;

public class StudentDepartmentmain {
public static void main(String[] args) {
	Student s1=new Student(103,"Gaurav");
	Student s2=new Student(104,"Gauri");
	Department d1=new Department(30,"Physics",s1);
	Department d2=new Department(31,"Chemistry",s2);
	
	System.out.println(d1);
	System.out.println(d2);
}
}
