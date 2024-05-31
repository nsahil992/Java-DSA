import java.util.*;
public class Ifelse {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int user_age = sc.nextInt();

        if (user_age >= 18) {
            System.out.println("You are eligible to vote. Welcome");
        } else {
            System.out.println("Sorry, You are not eligible enough");
        }

    }
    
}
