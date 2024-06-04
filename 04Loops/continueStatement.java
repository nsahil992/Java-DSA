public class continueStatement {
    public static void main(String[] args) {

        for(int i = 1; i <=5; i++) {
            if(i == 3) {
                continue;          // to skip a iteration
            }
            System.out.println(i);
        }
        
    }
}
