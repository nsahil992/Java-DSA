public class productAandB {
    public static int Product(int a, int b) {
        int product = a * b;
        return product;
    }    

    public static void main(String[] args) {
        System.out.print("The product of A and B is: ");
        int a = 99;
        int b = 1;
        int ans = Product(a, b);
        System.out.println(ans);
    }
}
