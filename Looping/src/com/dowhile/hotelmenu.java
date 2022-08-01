package com.dowhile;

import java.util.Scanner;

public class hotelmenu {
	public static void main(String[] args) {
	char c='n';
		do
		{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("select the Thali");
	System.out.println("1.Maharashtrain Thali  \n 2.Gujrati Thali \n 3.Rajasthani Tahli  \n 4.Punjabi Thali ");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("Maharashtraian Thali");
		int quantity=sc.nextInt();
		int price=quantity*120;
		System.out.println("price"+price);
		break;
	case 2:
		System.out.println("Gujrati Thali");
		int q=sc.nextInt();
		int r=q*150;
		System.out.println("price"+r);
		break;
	case 3:
		System.out.println("Rajastahani Thali");
		int d=sc.nextInt();
		int u=d*150;
		System.out.println("price"+u);
		break;
	case 4:
		System.out.println("Punjabi thali");
		int e=sc.nextInt();
		int w=e*200;
		System.out.println("price Rs."+w);
		break;
		default:
			System.out.println("welcome");
	}
	
	System.out.println("do you want to continue: (y/n)");
	c=sc.next().charAt(0);
	sc.close();
	}
		while(c=='y' || c=='Y');
		
}
}