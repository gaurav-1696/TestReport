package practise;

public class A {
	void add(int a)
	{
		System.out.println("11");
	}
	void add(int a,int b)
	{
		System.out.println("2");
	}
	void add(int a,int b,int c)
	{
		System.out.println("3");
	}
	public static void main(String[] args) {
		A a=new A();
		a.add(10);
		a.add(45, 10);
		
	}

}


	
