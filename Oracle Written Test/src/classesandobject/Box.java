package classesandobject;

import java.util.Scanner;

public class Box {
	int length,width,height;
	void setdata(int l,int w,int h)
	{
		length=l;
		width=w;
		height=h;
		
	}
	void volume()
	{
		int volume=length*width*height;
		System.out.println("valume of box :"+volume);
		
		
	}
	
	public String toString()
	{
		return length+" "+width+" "+height+"";
	}
	public static void main(String[] args) {
	
		int length,width,height;
		System.out.println("enter the length ,width and height  ");
		Scanner sc=new Scanner(System.in);
		Box  b=new Box();
		
		length=sc.nextInt();
		width =sc.nextInt();
		height=sc.nextInt();
		b.setdata(length,width,height);
		System.out.println(b);
		b.volume();
		sc.close();
}
}
