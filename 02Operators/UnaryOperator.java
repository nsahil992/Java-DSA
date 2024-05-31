import java.util.*;

public class UnaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;       // a = 11, b = 11

        // Unary ++a 
        System.out.println(a);
        System.out.println(b);

        // Unary a++
        int c = 20;
        int d = c++;           // c = 21, d = 20
        System.out.println(c);
        System.out.println(d);
    }
}
