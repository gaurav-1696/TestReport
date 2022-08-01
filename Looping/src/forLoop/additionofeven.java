package forLoop;


public class additionofeven {
public static void main(String[] args) {
	int sum=0;
	for(int i=400;i>=300;i--) 
	{
		if(i%2==0)
		{
			sum=sum+1;
		}
	}
	System.out.println("Sum of even number "+sum);
}
}
