import java.util.Stack;

public class StackMethods {
public static void main(String[] args) {
	Stack<Integer> s=new Stack<Integer>();
	s.push(10);
	s.push(52);
	s.push(120);
	s.push(89);
	s.push(85);
	s.push(102);
	s.push(960);
	
	System.out.println(s);
	s.pop(); //it removes last element like 960
	System.out.println(s);
	
	System.out.println(s.contains(120));
	System.out.println(s.peek());  //top elements in your stack
	
	System.out.println(s.empty());
	System.out.println(s.search(89));
}
}
