package abstraction;

public class CarMain {
public static void main(String[] args) {
	Car i=new Innova();
	i.setData(2300000, "Toyota");
	System.out.println(i);
	i.wheelno();
	i.gears();
	i.dashBoard();
	i.engine();

	Fortuner f=new Fortuner();
	f.setData(4500000, "toyota");
	f.dashBoard();
	f.engine();
	System.out.println(f);
}
}
