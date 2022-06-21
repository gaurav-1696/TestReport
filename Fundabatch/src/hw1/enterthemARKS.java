package hw1;

import java.util.Scanner;

public class enterthemARKS {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the marks");
	int marathi=sc.nextInt();
	int hindi=sc.nextInt();
	int english=sc.nextInt();
	int science=sc.nextInt();
	int mathematics=sc.nextInt();
	
	int add=marathi+hindi+english+science+mathematics;
	double avg=add/5.0;
	double per=add*100/500.0;
	System.out.println("average of five subject is "+avg);
	System.out.println("percentage of five subject is "+per+"%.");
}
}
