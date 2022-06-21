package Day3;

import java.util.Scanner;

public class userschoice {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 System.out.println("Accept two no.");
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 System.out.println("press 1-add press 2-substract 3-multiplication 4-divide");
	 int c=sc.nextInt();
	 if (c==1)
		 System.out.println("add="+(a+b));
	 else if (c==2)
		 System.out.println("substract="+(a-b));
	 else if (c==3)
		 System.out.println("multiplication="+(a*b));
	 else if (c==4)
		 System.out.println("divide="+(a/b));
	 else 
		 System.out.println("invalid key");
}
}
