package set;

import java.util.HashMap;
import java.util.Map;

public class EX3_ElectionVotes {
public static void main(String[] args) {
	HashMap<String , String	> hm=new HashMap<String, String>();
	hm.put("395345968154", "BJP");
	hm.put("5263512566", "NCP");
	hm.put("784512212666", "Congress");
	hm.put("895612255", "Shivsena");
	hm.put("8569965252", "NCP");
	hm.put("652345128975", "BJP");
	hm.put("235689561254", "Shivsena");
	HashMap<String, Integer> h=new HashMap<String, Integer>();
	for(Map.Entry<String, String> e:hm.entrySet())
	{
		String s=e.getValue();
		if(h.containsKey(s))
		{
			int v=h.get(s)+1;
			h.put(s, v);
		}
		else
		{
			h.put(s, 1);
		}
	}
	System.out.println(h);
	
}
}
