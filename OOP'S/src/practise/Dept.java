package practise;

public class Dept {
int dept_id;
String dept_name;
Dept(int dept_id,String dept_name)
{
	this.dept_id=dept_id;
	this.dept_name=dept_name;
}
public String toString() {
	return dept_id+" "+dept_name;
}
}
