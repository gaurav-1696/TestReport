package practise;

import java.util.Arrays;

public class Departmentt {
   int sid;
   String sname;
   Studentt t[];
   Departmentt(int sid,String sname, Studentt t[])
   {
	   this.sid=sid;
	   this.sname=sname;
	   this.t=t;
   }
   public String toString()
   {
	   return sid+" "+sname+" "+Arrays.toString(t);
   }
   
}
