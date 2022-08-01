package abstractionEX3;

public class KidMain {

	public static void main(String[] args) {
		Kid k1=new BigKid();
		k1.readBook();
		Kid k2=new Teenager();
		k2.readBook();
	}

}
