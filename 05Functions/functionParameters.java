import java.util.*;

public class functionParameters {
    public static void calculateSum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is: " + (a + b));
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b);
    }
}
