package string_WrittenTest;

public class EX2_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="acs@56fdg$#52@5vds";
		char ch[]=s1.toCharArray();
		int c=0,n=0,s=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				c++;
			}
			else if(ch[i]>='0' && ch[i]<='9')
			{
				n++;
			}		
			else
			{
				s++;
			}
		}
		System.out.println("total no. of Alphabet="+c);
		System.out.println("total no. of number="+n);
		System.out.println("total no. of symbol="+s);
	
	}
}
