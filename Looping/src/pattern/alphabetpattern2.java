package pattern;



public class alphabetpattern2 {
  public static void main(String[] args) {
	int alphabet=65;
	System.out.println("pattern");

	for(int i=0;i<=3;i++)
	{
	  alphabet=65;
	  for(int j=0;j<=i;j++)
	  {
		  System.out.print((char)alphabet + "");
		  alphabet++;
	  }
	  alphabet++;
	  System.out.println();
	}
  }
}
	


