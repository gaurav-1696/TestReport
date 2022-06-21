package Day2;

import java.util.Scanner;

public class passingpercentage {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the percentage");
	float per=sc.nextFloat();
	if(per>=50)
	{
		System.out.println("Congrulation you are Pass");
		
	}
	else
	{
		System.out.println("Sorry you are Fail");
	}
	sc.close();
}
}
