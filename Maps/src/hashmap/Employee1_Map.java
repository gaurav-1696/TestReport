package hashmap;


import java.util.HashMap;

public class Employee1_Map {
public static void main(String[] args) {

	HashMap<Employee1, Integer> entry=new HashMap<>();
	entry.put(new Employee1("gaurav","Developer",10),60000);
	entry.put(new Employee1("HR","madhavan",125), 50000);
	entry.put(new Employee1("gaurav","Developer",10),60000);
	entry.put(new Employee1("keshav","Sales",9), 45000);
	entry.put(new Employee1("HR","madhavan",125), 50000);
	System.out.println(entry);
	
}

}