package mycode2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=2;
int num=4;
int mid=num/2;
while(i<=mid)
{
	if(num%i==0) {
		break;
	}
	i++;
	if(i>mid)
	{
		System.out.println("given number is prime");
	}
	
	  else { 
		  System.out.println("given number is not a prime"); }
	 
}
	}

}
