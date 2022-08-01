package practise;

import java.util.Scanner;

public class Addition {
  public void add(int a,int b)
  {
	  System.out.println("addition of 2 number is: "+(a+b));
  }
  public void add(int d,int e,int f)
  {
	  System.out.println("addition of 3 number is: "+(d+e+f));
  }
  public void add(float g,float h)
  {
	  System.out.println("addition 2 number is: "+(g+h));
  }
  public void add(String i,String j)
  {
	  System.out.println("addition of 2 number is: "+(i+j));
  }
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the numbers: ");
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  Addition w=new Addition();
	  w.add(a, b);
	  System.out.println("enter three number: ");
	  int d=sc.nextInt();
	  int e=sc.nextInt();
	  int f=sc.nextInt();
	  Addition w2=new Addition();
	  w2.add(d, e, f);
	  System.out.println("enter foat number: ");
	  float g=sc.nextFloat();
	  float h=sc.nextFloat();
	  Addition w3=new Addition();
	  w3.add(g, h);
	  System.out.println("enter String: ");
	  String i=sc.next();
	  String j=sc.next();
	  Addition w4=new Addition();
	  w4.add(i, j);
	  
	  w.add(d, e, f);
	  w.add(g, h);
	  w.add(i, j);
	sc.close();

}
}
