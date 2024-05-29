// Enter cost of 3 items from the user (using float datatype)- a pencil, a pen and an eraser. 
// You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.*;

public class itemsgst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost of pencil: ");
        float pencil = sc.nextFloat();

        System.out.println("Enter the cost of Pen: ");
        float pen = sc.nextFloat();

        System.out.println("Enter the cost of eraser: ");
        float eraser = sc.nextFloat();

        float total = (pencil + pen + eraser);
        System.out.println("The total cost of your items is: " + (total));

        System.out.println("18% GST is applicable to your total");

        float onlyGST = (total * 18)/100;
        float GST = total + (total * 18)/100;

        System.out.println("You have to pay GST in Rs." + (onlyGST));

        System.out.println("So the final amount that needs to be paid is: Rs." + (GST));

    }
}
