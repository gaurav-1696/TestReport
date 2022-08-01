package practise;

import java.util.Scanner;

public class StudenttDepartmentt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Departmentt d[] = new Departmentt[2];
		for (int i = 0; i < 2; i++) {
			System.out.println("enter department details: ");
			int sid = sc.nextInt();
			String sname = sc.next();

			Studentt t[] = new Studentt[2];
			for (int j = 0; j < 2; j++) {
				System.out.println("enter the student details: ");
				int id = sc.nextInt();
				String name = sc.next();
				int marks = sc.nextInt();
				String contact = sc.next();
				t[j] = new Studentt(id, name, marks, contact);
			}
			d[i]=new Departmentt(sid,sname,t);
			for(Departmentt d1:d)
			{
				for(Studentt s:d1.t)
				{
					if(s.marks>60)
						System.out.println(d1.sname+" "+s.name+" "+s.marks);
				}
			}
			sc.close();
		}

	}
}
