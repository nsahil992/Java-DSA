import java.util.*;

public class num1toN {
    public static void main(String[] args) {
        System.out.println("Enter the number to count upto: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int i = 1;
        while(i <= count) {
            System.out.println(i);
            i++;
        }


    }
    
}
