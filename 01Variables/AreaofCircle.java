import java.util.*;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of pi: ");
        float pi = sc.nextFloat();

        System.out.println("Entet the radius of the circle: ");
        int radius = sc.nextInt();

        float areaofCircle = (pi * radius * radius);
        System.out.println("The area of circle is: " + (areaofCircle));
    }
}
