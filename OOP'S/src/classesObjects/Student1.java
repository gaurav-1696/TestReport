package classesObjects;

public class Student1 {
	int id,marks;
	String name,dpt;
	
	
	void setData(int i,String n,String d,int m)
	{
		id=i;
		name=n;
		dpt=d;
		marks=m;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+dpt+" "+marks);
	}
	
	/*public String toString()
	{
		returnid+" "+name+" "+dpt+" "+marks+" "
	}*/
	

	public static void main(String[] args) {
		
         Student1 s1=new Student1();
         s1.display();
       //  Student1 s2=new Student1();
         
        /* s1.setData(101, "Raj", "Computer", 70);	
         s1.display();
         
         s2.setData(102, "Riya", "it", 85);
         s2.display();
         }
*/
         
	}
}
