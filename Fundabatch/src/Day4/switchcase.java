package Day4;

import java.util.Scanner;

public class switchcase {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("press 1-addition 2-subtract 3-multiplication 4-division");
	int choice=sc.nextInt();
	switch (choice)
	{
	case 1:int sum=a+b;
	System.out.println("sum"+sum);
	break;
	case 2:int sub=a-b;
	System.out.println("substraction"+sub);
	break;
	case 3:int mul=a*b;
	System.out.println("multiplicaion"+mul);
	break;
	case 4:int div=a/b;
	System.out.println("division"+div);
	default:System.out.println("invalid choice");
	}
}
}
