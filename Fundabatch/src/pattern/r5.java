package pattern;

public class r5 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	System.out.println("*********//*********//***********");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(i);
		}
		System.out.println();
	}
	System.out.println("*********//**********//*********");
	
	for(int i=1;i<=5;i++)
	{
		int no=i;
		for(int j=1;j<=i;j++ )
		{
			System.out.print(no+" ");
			no=no+5-j;
		}
		System.out.println();
	}
}
}
