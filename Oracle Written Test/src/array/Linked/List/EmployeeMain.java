
package array.Linked.List;
import java.util.*;
public class EmployeeMain {

	public static void main(String[] args) {
		
LinkedList<Emp> e=new LinkedList<>();
  Scanner sc=new Scanner(System.in);
  System.out.println("enter id,name,dept");
  for(int i=0;i<10;i++)
  {
	  int id=sc.nextInt();
	  String name=sc.next();
	  String dept=sc.next();
	  e.add(new Emp(id,name,dept));
  }
  System.out.println(e);
  String dept=" ";
  for(Emp p:e)
  {
	  if(p.id==10)
	  {
		  dept=p.dept;
	  }
  }
  ListIterator<Emp> p=e.listIterator();
  while(p.hasNext())
  {
	  Emp m=p.next();
	  if(m.dept.equals(dept));
	  {
		  p.remove();
	  }
  }
  System.out.println(e);
  sc.close();
	}
}
