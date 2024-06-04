import java.util.*;

public class reverseGiven {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to print in reverse");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n >  0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
        System.out.println();
    }
}
