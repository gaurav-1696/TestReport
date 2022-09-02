package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Java is a programming language";
		//String s="HELLO$ WORLD";
		String str[] = s.split(" ");
		for (int i = 0; i < str.length / 2; i++) {
			String temp = str[i];
			str[i] = str[str.length - i - 1];     //sorting
			str[str.length - i -1] = temp;
		}
		for(int i=str.length-1;i>=0;i--)
		{                                     //regular method
			System.out.print(str[i]+" ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(str));
		char ch[] = s.toCharArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char c = sc.next().charAt(0);
		int cnt = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == c) {
				cnt++;
			}
		}
		System.out.println("count: " + cnt);
		sc.close();
	}
}
