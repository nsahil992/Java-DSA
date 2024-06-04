import java.util.*;

public class breakQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        while(true) {
            int i = sc.nextInt();

            if(i % 10 == 0) {
                System.out.println("You have entered multiple of 10, hence loop ended");
                break;
            }
        }
    }
}
