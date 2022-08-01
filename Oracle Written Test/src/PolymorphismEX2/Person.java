package PolymorphismEX2;

public class Person {
	int age;
	String name,gender;
	Address s;
	

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}
      Address gets()
      {
    	  return s;
      }
      void sets(Address s)
      {
    	  this.s=s;
      }


	public String toString() 
		
	
	{
		return name+" "+gender+" "+age+" "+s ;
	}
}
