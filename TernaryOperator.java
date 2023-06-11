public class TernaryOperator {
    public static void main(String[] args) {
        int a = 85, b  = 96, res;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // performing ternary operation
        res = (a > b) ? (a + b) : (a - b);
        // printing result
        System.out.println("Result: " + res);
    }
    
}
