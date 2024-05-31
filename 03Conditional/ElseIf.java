import java.util.*;

public class ElseIf {
    public static void main(String[] args) {
        System.out.println("Enter your percentage: ");

        Scanner sc = new Scanner(System.in);

        int percentage = sc.nextInt();

        if(percentage >= 90 && percentage <= 100) {
            System.out.println("Congratulations! You have scored A+ grade");
        }
        else if(percentage >= 80 && percentage <= 89) {
            System.out.println("Congratulations, You have score A grade");
        }
        else if(percentage >= 70 && percentage <= 79) {
            System.out.println("You have scored a B grade");
        }
        else if(percentage >= 35 && percentage <=69) {
            System.out.println("You have scored a C grade");
        } else {
            System.out.println("Try hard next time. You have one more opportunity");
        }

    }
}
