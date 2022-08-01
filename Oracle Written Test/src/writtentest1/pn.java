package writtentest1;

public class pn {
public static void main(String[] args) {
	int i, j, isPrime;
    System.out.println("All Prime Numbers Between 400 to 300");

    for (i = 400; i >= 300; i--) {
        isPrime = 0;
        
        for (j = 2; j <= i / 2; j++) {
            
            if (i % j == 0) {
                isPrime = 1;
                break;
            }
        }

        if (isPrime == 0)
            System.out.print(i + " ");
}
} 
}
