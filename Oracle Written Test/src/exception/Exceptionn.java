package exception;

public class Exceptionn {

	public static void main(String[] args) {
		System.out.println("This statement will be executed");
		String s="String";
		char str[]=s.toCharArray();
		
		try
		{	
			System.out.println(s.charAt(9));
			str[10]=45;
			System.out.println(str);
			 
		}
		catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			
		}
		
		System.out.println("my name is gaurav");
	
	}
}
