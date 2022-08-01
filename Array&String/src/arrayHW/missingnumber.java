package arrayHW;

public class missingnumber {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,7};
		 int cnt=1;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]==cnt)
			 {
				 cnt++;
			 }
			 else
			 {
				 System.out.println("missing number= "+cnt);
				 cnt=cnt+2;
			 }
		 }
	}
 
}
