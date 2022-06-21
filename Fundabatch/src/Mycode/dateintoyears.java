package Mycode;

import java.util.Scanner;

public class dateintoyears {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the days");
  int day=sc.nextInt();
  int year=day/365;
  int month=day/30;
  int week=day/7;

 System.out.println("Year="+year + " month="+month + " week="+week);
 
 
}
}
