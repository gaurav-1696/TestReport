package polymorphism;

public class Car {
	int id;
	String name, brand;
	Driver d;

	Car(int id, String name, String brand, int did, String dname, String contact) {
		this.id = id;
		this.name = name;
		this.brand = brand; // composition
		this.d = new Driver(did, dname, contact);

	}

	public String toString()

	{
		return id + " " + name + " " + brand + " " + d;
	}

}
