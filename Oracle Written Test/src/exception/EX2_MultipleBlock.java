package exception;

public class EX2_MultipleBlock {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	String s=null;
	try
	{		
		int a=arr[5]/0;
		System.out.println(a);
		System.out.println(s.length());
	}
	catch(ArithmeticException e)
	{
		e.printStackTrace();
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		e.printStackTrace();
	}
	catch(NullPointerException e)
	{
		e.printStackTrace();
	}
	System.out.println("Execution Complete ");
}

}
