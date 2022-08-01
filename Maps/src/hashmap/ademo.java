package hashmap;

public interface ademo {
void printing();

}
interface adms extends ademo {
	void printing();
	
}
class ad implements adms,ademo{

	@Override
	public void printing() {
		// TODO Auto-generated method stub
		System.out.println("1 2 ka 4");
	}
	
	

}

