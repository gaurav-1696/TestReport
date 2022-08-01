package s_Static;

public class StudentStaticExample {
   int id,marks;
   String name;
   static String colgname="MIT";
   StudentStaticExample(int id,String name,int marks)
   {
	   this.id=id;
	   this.name=name;
	   this.marks=marks;
   }
   static
   {
	   System.out.println("static block 1 "+colgname);
   }
   static
   {
	   System.out.println("static block 2 "+colgname);
   }
   static void colgname()
   {
	   System.out.println("college name is:"+colgname);
   }
   void display()
   {
	   colgname="MIT";
	   System.out.println(id+" "+name+" "+marks);   
   }
   {
	   System.out.println("my name is gj");
   }
   public static void main(String[] args) {
	   System.out.println("Student Details:");
	   StudentStaticExample s1= new StudentStaticExample(101,"gj",85);
	      s1.display();
	      System.out.println(StudentStaticExample.colgname);
	   
	
}
   
}
