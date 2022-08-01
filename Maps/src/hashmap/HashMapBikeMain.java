package hashmap;

import java.util.HashMap;

public class HashMapBikeMain {
public static void main(String[] args) {
	HashMap<Bike, Integer> hm=new HashMap<>();
	hm.put(new Bike(1018,"Bajaj Pulsor","black"), 125000);
	hm.put(new Bike(2015,"Hero splendor","Grey"), 85000);
	hm.put(new Bike(3121,"KTM Duke","Black"), 250000);
	hm.put(new Bike(5021,"Royal Enfield","Silver"), 275000);
	System.out.println(hm);
}
}
