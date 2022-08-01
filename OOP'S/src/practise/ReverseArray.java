package practise;

import java.util.Arrays;

public class ReverseArray {
public static void main(String[] args) {
	int c[]= {1,2,3,4,5,6,7,8,9};
	int b=c.length;
	
		for(int j=0;j<c.length/2;j++)
		{
		int temp=c[j];
		c[j]=c[b-j-1];
		c[b-j-1]=temp;
		
		}
	
	System.out.println(Arrays.toString(c));
}

}