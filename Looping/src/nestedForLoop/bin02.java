package nestedForLoop;
import java.util.Scanner;
public class bin02 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int r=sc.nextInt();
	for(int i=1;i<=r;i++)
	{
		for(int j=i;j>=1;j--)
		{
			System.out.print(j+" ");
			
		}
		System.out.println();
	}
	sc.close();
}
}
