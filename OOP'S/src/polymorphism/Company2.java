package polymorphism;

public class Company2 {
	int idc;
	String cname,year;
	Car2 e;
	
	public int getIdc() {
		return idc;
	}

	public void setIdc(int idc) {
		this.idc = idc;
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

	public Car2 getE() {
		return e;
	}

	public void setE(Car2 e) {
		this.e=e;
	}

	public String toString()
	{
		return idc+" "+cname+" "+year+" "+e;
	}
}
