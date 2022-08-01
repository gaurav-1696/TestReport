package writtentest1;

public class primenum {
public static void main(String[] args) {

    int num =0;
   String  primeNumbers = "";

    for (int i = 400; i >=300; i--)         
    { 		  	  
       int counter=0; 	  
       for(num =i; num>=1; num--)
	  {
          if(i%num==0)
	     {
		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	    
	     primeNumbers = primeNumbers + i + " ";
	  }	
    }	
    System.out.println("Prime numbers from 400 to 300 are :");
    System.out.println(primeNumbers);
}
}
