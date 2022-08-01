package multilevelInheritence;

public class BIkeMain {

	public static void main(String[] args) {
		PulsorRS p = new PulsorRS();
		p.setPulsarData("ff", 523, "220cc");
		p.setBikeData(125000, "black", "54", "bajaj");
		Pulsor d=new Pulsor();
		d.setPulsarData("PulsorRS", 140, "RS200");
		p.setPulsorRSData("BS-IV", 140);
		System.out.println(p);
		System.out.println(d);
		p.wheelno();
		p.seats();
		p.gears();
	}

}
