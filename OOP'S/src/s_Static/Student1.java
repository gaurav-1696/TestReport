package s_Static;

public class Student1 {
   int id,marks;
   String name,dept,sports;
   {
	   id=0;
	   marks=81;
	   name="GJ";      //instance block 
	   dept="mech";
	   sports="hockey";
	   System.out.println("In instance block");
   }
   Student1()
   {
	   System.out.println("In default constructor");
   }
   void setData(int id,String name,String dept,int marks,String sports)
   {
	   this.id=id;
	   this.name=name;
	   this.dept=dept;
	   this.marks=marks;
	   this.sports=sports;
   }
   
}
