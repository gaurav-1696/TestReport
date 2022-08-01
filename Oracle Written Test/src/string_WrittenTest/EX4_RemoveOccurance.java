package string_WrittenTest;

import java.util.Arrays;

public class EX4_RemoveOccurance {

	public static void main(String[] args) {
		
		String s1="the sun is bright the sun is red";

String str[]=s1.split(" ");
for(int i=0;i<str.length;i++)
{
	if(str[i].equals("sun"))
	{
		str[i]=" ";
	}
}
System.out.println(Arrays.toString(str));
	}

}
