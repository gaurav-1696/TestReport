package com.collection;

import java.util.ArrayList;

public class StudentContainment {

	public static void main(String[] args) {
		ArrayList<Integer> sm1=new ArrayList<>();
		sm1.add(60);
		sm1.add(70);
		sm1.add(65);
		sm1.add(65);
		sm1.add(55);
		
		ArrayList<Integer> sm2=new ArrayList<>();
		sm1.add(60);
		sm1.add(70);
		sm1.add(84);
		sm1.add(65);
		sm1.add(61);
		
		ArrayList<Integer> sm3=new ArrayList<>();
		sm1.add(69);
		sm1.add(80);
		sm1.add(84);
		sm1.add(69);
		sm1.add(61);
       ArrayList<Students> aa=new ArrayList<>();
		  aa.add(new Students(101,"Ramkrushna","ENTC",sm1)); 
		  aa.add(new Students(101,"Ragunath","computer",sm2));
		  aa.add(new Students(101,"Rajesh","ENTC",sm3));
	
	}

}
