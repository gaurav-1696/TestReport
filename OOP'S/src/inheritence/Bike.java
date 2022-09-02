package inheritence;

public class Bike {
	int price;
	String color, milage, brand;

	void setBikeData(int price, String color, String milage, String brand) {
		this.price = price;
		this.color = color;
		this.milage = milage;
		this.brand = brand;
	}

	public String toString() {
		return brand + " " + milage + " " + price + " " + color;
	}

	void wheelno() {
		System.out.println("2 wheel");
	}

	void seats() {
		System.out.println("2 seats");
	}
	
}
