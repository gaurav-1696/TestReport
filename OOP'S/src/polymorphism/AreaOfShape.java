package polymorphism;

public class AreaOfShape {
void area(float a)
{
	double c=3.14*a*a;
	System.out.println("area of circle is : "+ c+" mm2");
}
void area(int a )
{
	System.out.println("area of square is :"+(a*a)+" mm2");
}
void area(int a, int b)
{
	System.out.println("area of the rectangle is :"+(a*b)+" mm2");
}
void area(float a, float b)      
{
	System.out.println("Area of triangle is :"+(0.5*a*b)+" mm2");
}
public static void main(String[] args) {
	AreaOfShape s=new AreaOfShape();
	s.area(5.0f);                
	s.area(50);
	s.area(40, 30);
	s.area(10f, 3f);
	
}
}
