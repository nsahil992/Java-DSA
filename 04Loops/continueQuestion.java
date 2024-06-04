import java.util.*;

public class continueQuestion {
    public static void main(String[] args) {
        System.out.println("Enter the numbers: ");
        Scanner sc = new Scanner(System.in);

        while(true) {
            int i = sc.nextInt();
            if(i % 10 == 0) {
                continue;
            }
            System.out.println("Your number was: "+ i);
        }
    }
}
