package exception;

import java.util.Scanner;

public class EligibiltyMain {
	void check(double cgpa) throws Eligibility
	{
		if(cgpa<5.59)
		{
			throw new Eligibility("You are not eligible not for this job");
		}
		else
		{
			System.out.println("You are eligible for this job");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the CGPA Score");
		double cgpa=sc.nextDouble();
		EligibiltyMain a=new EligibiltyMain();
		try
		{
			a.check(cgpa);
		}
		catch(Eligibility e)
		{
			e.printStackTrace();
		}
		sc.close();
}
}
