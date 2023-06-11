public class LogicalOperatorNOT {
    public static void main(String[] args) {
        /* NOT Operator ( ! ) – !(a<b) [returns false if a is smaller than b] */
           int a = 55, b = 80;
           System.out.println("a = " + a);
           System.out.println("b = " + b);
        // using logical NOT Operator
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b)); 
    }
}
