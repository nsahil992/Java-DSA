import java.util.*;

public class Largestnum {
    public static void main(String[] args) {
        System.out.println("Enter your first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();

        if(a > b) {
            System.out.println("The largest number is: " + (a));
        } else {
            System.out.println("The largest number is: " + (b));
        }
    }
    
}
