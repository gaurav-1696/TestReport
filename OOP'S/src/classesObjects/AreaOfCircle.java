package classesObjects;

import java.util.Scanner;

public class AreaOfCircle {
	
    int rsquare(int r)
    {
    	return r*r;
    }
    void area(int sqr)
    {
    	double area=3.14*sqr;
    	System.out.println("area of circle is:"+area);
    }
    
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of circle is:");
		int r=sc.nextInt();
		AreaOfCircle c1=new AreaOfCircle();
		  
		
		c1.area(r);
		
		
//		AreaOfCircle c2=new AreaOfCircle();
//		System.out.println("enter the radius of circle :");
//		r=sc.nextInt();
//		c2.area(r);
//		
//		AreaOfCircle c3=new AreaOfCircle();
//		System.out.println("enter the radius of circle: ");
//		r=sc.nextInt();
//		c3.area(r);
		sc.close();
	}
}
