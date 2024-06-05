import java.util.*;

public class returnType {
    public static int egReturnType(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = egReturnType(num1, num2);
        System.out.println("The sum is: " + (num1 + num2));
    }
}
