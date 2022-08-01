package practise;

public class Companys {
 int idv;
 String cname,year;
 Cars s;
public int getIdv() {
	return idv;
}
public void setIdv(int idv) {
	this.idv = idv;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
public Cars getS() {
	return s;
}
public void setS(Cars s) {
	this.s = s;
}
 public String toString()
 {
	 return idv+" "+cname+" "+year+" "+s;
 }
}
