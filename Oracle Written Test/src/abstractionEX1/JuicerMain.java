package abstractionEX1;

public class JuicerMain {

	public static void main(String[] args) {
//a) using object
		Juicer j = new Juicer();
		j.crush();
		j.rotate();
		j.filter();
		System.out.println("------------------------------ ");
// b)using reference variable
		Machine m = new Juicer();
		m.crush();
		m.rotate();

	}

}
