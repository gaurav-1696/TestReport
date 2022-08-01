package encapsulation;

public class Customermain {

	public static void main(String[] args) {
		System.out.println("Account Details are: ");
		Customer c1 = new Customer();
		c1.setAccno(102365);
		c1.setName("Gaurav");
		c1.setBalance(8500000);
		c1.setContact("9145747297");
		c1.setBalance(154623000); 
		System.out.println(c1.getAccno() + " " + c1.getName() + " " + c1.getBalance() + " " + c1.getContact());
	}
}
