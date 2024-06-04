import java.util.*;

public class SumNum {
    public static void main(String[] args) {
        System.out.println("Enter the number to find the sum of the numbers: ");
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int sum = 0;
        int count = sc.nextInt();

        while(i <= count) {
            sum += i;
            i++;
        }
        System.out.println("The sum is: " + (sum));
    }
}
