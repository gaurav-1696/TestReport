package array.Linked.List;
import java.util.ArrayList;
public class DuplicateElement {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("Sun");
	al.add("Mon");
	al.add("Sat");
	al.add("Sun");
	al.add("Sat");
	al.add("Mon");
	al.add("sat");
	al.add("Sun");
	System.out.println(al);
	ArrayList<String> al1 = new ArrayList<String>();
	
	
	  for(int i=0; i<al.size(); i++) {
		  int cnt=0; 
		  for(int j=0; j<al.size(); j++) {
	  if(al.get(i)==al.get(i)&&j<i) 
	  {  
		  break;
	  } 
	  else if(al.get(i)==al.get(j)&&j>=i)
	  { 
		  cnt++; 
		  }
	  }
		  if(cnt!=0) {
			  al1.add(al.get(i)); 
			  }
		  }
	 
    System.out.println(al1);
    for(String s:al)
    {
    	if(al1.contains(s))
    	{
    		al1.add(s);
    	}
    }
    System.out.println(al1 );

}
}
