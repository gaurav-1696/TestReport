package array;

public class ddff {
public static void main(String[] args) {
	int a[]= {1,2,0,0,3,5,6};
	int b[]=new int[a.length];
	int cnt=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==b[j])
			{
				cnt++;
			}
		}
		System.out.print(cnt);
	}
	
}
}
