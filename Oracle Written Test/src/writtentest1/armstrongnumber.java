package writtentest1;

import java.util.Scanner;

public class armstrongnumber {
public static void main(String[] args) {
	int num, temp, cnt=0,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	 num=sc.nextInt();
	temp=num;
	while(temp!=0) {
		cnt++;
		temp=temp/10;
	}
	temp=num;
	while(temp!=0)
	{
		int r=temp%10;
		int power=1;
		for(int i=1;i<=cnt;i++)
		{
			power=power*r;
		}
		temp=temp/10;
		sum=sum+power;
	}
	if(sum==num)
	{
		System.out.println("armstrong number");
	}
	else
	{
		System.out.println("not a armstrong number");
	}
		sc.close();
	}
}

