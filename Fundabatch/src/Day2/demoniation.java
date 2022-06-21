package Day2;

import java.util.Scanner;

public class demoniation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter amount in rs");
	int amt=sc.nextInt();
	int n2000=amt/2000;
	amt=amt%2000;
	int n500=amt/500;
	amt=amt%500;
	int n200=amt/200;
	amt=amt%200;
	System.out.println("Notes of 2000="+n2000);
	System.out.println("Notes of 500="+n500);
	System.out.println("Notes of 200="+n200);
	System.out.println("Reamaining amt="+amt);
	sc.close();
}
}
