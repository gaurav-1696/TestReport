package com.string;

public class AlphabeticalIndex {

	public static void main(String[] args) {
		
		String a = "my name is gaurav";
		char ch[] = a.toCharArray();
		for (char i = 'a'; i < 'z'; i++) {
			for (int j= 0; j < ch.length; j++) {
				if (i == ch[j]) {
					System.out.println(i + " " + j);
				}
			}
		}
	}

}