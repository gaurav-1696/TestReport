package set;

public class Item {
	int qty,id;
	double price;
	String name;
	public Item(int id, String name, double price,int qty) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty=qty;
	}
	public String toString()
	{
		return id+" "+name+" "+price+" "+qty;
	}
}
