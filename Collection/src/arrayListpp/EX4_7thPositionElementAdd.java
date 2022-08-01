package arrayListpp;
import java.util.ArrayList;
public class EX4_7thPositionElementAdd {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	al.add(60);
	al.add(70);
	al.add(90);
	al.add(100);
	System.out.println(al.get(7));
	System.out.println("before adding element");
	System.out.println(al);
	System.out.println("after adding element in 7th position");
	al.add(7, 80);
	System.out.println(al);
	
}
}
