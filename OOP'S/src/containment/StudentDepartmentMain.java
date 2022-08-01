package containment;
import java.util.Scanner;
public class StudentDepartmentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Department dept[]=new Department[3];
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter id,name,student list: of the "+(i+1)+" Department: ");
			int did=sc.nextInt();
			String dname=sc.next();
			Student stud[]=new Student[5];
		
		for(int j=0;j<5;j++)
		{
			System.out.println("enter id,name,marks,contact of the "+(j+1)+" Student: ");
			int id=sc.nextInt();
			String name=sc.next();
			int marks=sc.nextInt();
			String contact=sc.next();
			stud[j]=new Student(id,name,marks,contact);
			
		}
		dept[i]=new Department(did,dname,stud);
		for(Department d:dept)
		{
			for(Student s:d.stud)
			{
				if(s.marks>60)
					System.out.println(d.name+" "+" "+s.name+" "+s.marks);
			}
		}
			
	}
//	System.out.println(Arrays.toString(dept));
	
sc.close();

	}
	}



