import java.util.*;

public class Incometax {
    public static void main(String[] args) {
        System.out.println("INCOME TAX CALCULATOR");

        System.out.println("Enter your income: ");
        Scanner sc = new Scanner(System.in);

        int income = sc.nextInt();

        if(income <= 500000) {
            System.out.println("Congratulations. You have no tax to pay");
        }
        else if(income >=500001 && income <= 1000000) {
            int twenty_p = ((income * 20) / 100);
            System.out.println("You have to pay 20% tax");
            System.out.println("Hence you have to pay: " + (twenty_p));
        }
        else {
            int thirty_p = ((income * 30) / 100);
            System.out.println("You have to pay 30% tax");
            System.out.println("Hence you have to pay: " + (thirty_p));
        }




    }
}
