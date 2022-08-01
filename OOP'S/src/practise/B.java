package practise;

public class B extends A {
	int j;

	void display()

	{
		System.out.println(j);
	}
}

class inheritance_demo {
	public static void main(String args [])
			{
			B obj = new B();
			//obj.i=1;
			obj.j=2;
			obj.display();
}
}
