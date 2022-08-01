package string_WrittenTest;

public class EX1_Split {
	public static void main(String[] args) {
		String s = "HELLO$WORLD";
		/*String arr[] = s.split("[$]");
		for (int i = 0; i < arr.length; i++)
		 {
			System.out.println(arr[i]);
		}*/
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='$')
			{
				arr[i]=' ';
			}
				
		}
		 String s1=new String(arr);
		 System.out.println(s1);
	}
}
