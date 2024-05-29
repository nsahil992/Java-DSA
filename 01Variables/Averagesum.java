// In a program, input 3 numbers: A, B and C. You have to output the average of these 3 numbers.
//(Hint : Average of N numbers is sum of those numbers divided by N)
 
import java.util.*;

public class Averagesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Enter the third number: ");
        int c = sc.nextInt();

        int average = (a + b + c)/3;

        System.out.println("The average of a, b and c is: " +(average));

    }
}

