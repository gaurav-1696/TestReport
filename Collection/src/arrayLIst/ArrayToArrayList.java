package arrayLIst;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayToArrayList {
public static void main(String[] args) {
	Integer arr[]= {10,20,30,40,50,60,70,80,90,100};
	ArrayList<Integer> al=new ArrayList<>(Arrays.asList(arr));
	System.out.println(al);
}
}
