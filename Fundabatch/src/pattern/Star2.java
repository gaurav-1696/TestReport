package pattern;

public class Star2 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print((i+j-1)+" ");
		}
		System.out.println();
	}
}
}