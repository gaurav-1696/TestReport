package multilevelInheritence;

public class Skoda extends Car {
	int id;
	String modelno;
	String modeOfPayment;
	int installment;

	void setData1(int id, String modelno, String modeOfPayment, int installment) {
		this.id = id;
		this.modelno = modelno;
		this.modeOfPayment = modeOfPayment;
		this.installment = installment;
	}

	void discount() {

		{
			if (modeOfPayment.equals("cash") && installment == 0) {
				int discount = price * 18 / 100;

				System.out.println("Discount= " + discount);
			} else if (modeOfPayment.equals("online") && installment == 0) {
				int discount = price * 12 / 100;

				System.out.println("Discount= " + discount);
			} else if (modeOfPayment.equals("online") && installment == 2|| modeOfPayment.equals("cash") && installment == 2) {
				int discount = price * 9 / 100;

				System.out.println("Discount= " + discount);

			} else {
				System.out.println("no discount");
			}
		}
	}
	void display() {
		super.display();
		System.out.println(id + " " + modelno + " " + modeOfPayment + " " + installment);
	}
}
