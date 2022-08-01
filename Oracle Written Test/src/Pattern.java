
public class Pattern {
	public static void main(String[] args) {
		  
		int n=5;
  for(int i=n;i>=-n;i--)
  {
	   for(int j=0;j<=Math.abs(i);j++)
	   {
		   System.out.print((char)(j+65)+" ");
		   }
	   System.out.println();
	   }
	}
}
