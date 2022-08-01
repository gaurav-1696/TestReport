package classesObjects;

public class Student {
void javaCourse() {
	System.out.println("J2SE+J2EE");
}
void pythonCourse() {
	System.out.println("Python+Database");
}
void frontEndCourse() {
	System.out.println("HTML+CSS+Angular");
}
void instituteName() {
	System.out.println("ThinkQuotient");
}


public static void main(String [] args) {
	Student s1=new Student();
	/*
	 * Student s2=new Student(); Student s3=new Student(); Student s4=new Student();
	 */
	s1.javaCourse();
	s1.pythonCourse();
	s1.frontEndCourse();
	s1.instituteName();
	/*
	 * s2.pythonCourse(); s3.frontEndCourse(); s4.instituteName();
	 */
	
}
}
