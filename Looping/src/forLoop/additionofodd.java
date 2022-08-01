
package forLoop;


public class additionofodd {
public static void main(String[] args) {
	int sum=0;
	for(int i=1;i<=10;i++) 
	{
		if(i%2==1)
		{
			sum=sum+1;
		}
	}
	System.out.println("Sum of odd number "+sum);
}
}
