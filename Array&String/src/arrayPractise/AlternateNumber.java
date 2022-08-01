package arrayPractise;

public class AlternateNumber {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50,60,70,80,90,100};
	int size=a.length;
	for(int i=0;i<size;i=i+2)
	{
		System.out.println(a[i]);
	}
}
}
