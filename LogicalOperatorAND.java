public class LogicalOperatorAND {
    public static void main(String[] args) {
        int a = 50, b = 80, c = 50, d = 0;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        // Using logical AND Operator
        if((a < b) && (b == c)) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        } else {
            System.out.println("False Conditions");
        }
    }
}
