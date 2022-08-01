package polymorphism;

public class AdditionofAdding {
 void add(int a,int b)
 {
	 System.out.println("Addition of 2 number is: "+(a+b));
 }
 void add(int a,int b,int c)
 {
	 System.out.println("Addition of 3 number is: "+(a+b+c));
 }
 void add(float a,float b)
 {
	 System.out.println("Addition of 2 number(float,int) is: "+(a+b));
 }
 public void add(float a,int  b)
 {
	 System.out.println("Addition of 2 number(float,int) is: "+(a+b));
 }
 void add(String a,String b)
 {
	 System.out.println("Addition of 2 String is: "+(a+b));
 }
 public static void main(String[] args) {
	 AdditionofAdding a1=new AdditionofAdding();
	a1.add(10, 20);
	a1.add(10, 20, 30);
	a1.add(2.5f, 3.5f);
	a1.add(1.2f, 6);
	a1.add("gj", "fj");
	//System.out.println(a1);
}
 

 
}
