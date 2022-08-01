
public class minchar {
	int a;
       
	public static void main(String[] args) {
	char a[]= {'A','D','G','x','z'};
	char min=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min =a[i];
		}
		
	}
	System.out.println("min character is "+min);
	}

}
