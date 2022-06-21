package Day4;

import java.util.Scanner;

public class percentagecomission {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("total sale");
	int sale=sc.nextInt();
	int comm=sale*10/100;
	System.out.println("net sale ="+(sale-comm));
}
}
