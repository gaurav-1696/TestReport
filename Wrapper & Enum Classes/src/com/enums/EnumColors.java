package com.enums;

import java.util.Arrays;

public class EnumColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Colors.BLACK);
Colors c1=Colors.BLACK;
Colors c2=Colors.GREEN;
System.out.println(c2.ordinal());
System.out.println(c1.ordinal());

Colors cr[]=Colors.values();
for(Colors c:cr) {
	System.out.println(c);
}
System.out.println(Arrays.toString(cr));
}

}
