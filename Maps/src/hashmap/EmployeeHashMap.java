package hashmap;
import java.util.HashMap;
import java.util.Map;
public class EmployeeHashMap {

	public static void main(String[] args) {
		
HashMap<Integer,Employee> hm=new HashMap<>();

hm.put(109, new Employee("gaurav","HR",75000));
hm.put(108, new Employee("vidya","Development",61000));
hm.put(101, new Employee("rahul","HR",36000));
hm.put(102, new Employee("garima","HR",89000));
hm.put(106, new Employee("gauri","Marketing",67000));
hm.put(105, new Employee("krishna","Sales",79000));
hm.put(110, new Employee("kalayani","Testing",50000));

System.out.println(hm);
System.out.println("-/-/-/-/-/-filtered/-/-/-/-");
for(Map.Entry<Integer, Employee> ent: hm.entrySet())
{
	if(ent.getValue().dept.equals("HR") && ent.getValue().salary>50000)
	{
		System.out.println(ent.getKey()+" "+ent.getValue().name+" "+ent.getValue().dept+" "+ent.getValue().salary);
	
	}
	
}
	}

}
