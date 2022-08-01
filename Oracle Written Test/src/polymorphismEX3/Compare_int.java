package polymorphismEX3;

public class Compare_int{
public void compare(int a, int b) {
        
        if (a > b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
        
    }
public void compare(char a, char b) {
    int x = (int)a;
    int z = (int)b;
    
    if (x > z) {
        System.out.println(a);
    }
    else {
        System.out.println(b);
    }
    
}

}
