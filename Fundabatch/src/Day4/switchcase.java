package Day4;

import java.util.Scanner;

public class switchcase {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("press 1-addition 2-subtract 3-multiplication 4-division");
	char choice=sc.next().charAt(0);
	switch (choice)
	{
	case 'a':
		int sum=a+b;
	System.out.println("sum"+sum);
	break;
	case 'b':int sub=a-b;
	System.out.println("substraction"+sub);
	break;
	case 'c':int mul=a*b;
	System.out.println("multiplicaion"+mul);
	break;
	case 'd':int div=a/b;
	System.out.println("division"+div);
	default:System.out.println("invalid choice");
	}
	sc.close();
}
}
