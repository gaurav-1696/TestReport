package hashmap;

public class Order {
int id,total;
String city,status;
public Order(int id, int total, String city, String status) {
	
	this.id = id;
	this.total = total;
	this.city = city;
	this.status = status;
}

public String toString() {
	return id + " " + total + " " + city + " " + status;
}


}
