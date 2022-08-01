package containment;

import java.util.Arrays;

public class DepartmentEmp {
    String dname;
    int totalemp;
   Employee emp[];
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public int getTotalemp() {
	return totalemp;
}
public void setTotalemp(int totalemp) {
	this.totalemp = totalemp;
}
public Employee[] getEmp() {
	return emp;
}
public void setEmp(Employee[] emp) {
	this.emp = emp;
}
   public String toString()
   {
	   return dname+" "+totalemp+" "+Arrays.toString(emp);
   }
}
