public class LogicalOperatorOR {
    public static void main(String[] args) {
        int a = 15, b = 8, c = 6, d = 15;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        // using logical OR Operator
        if(a > b || c == d)
        System.out.println("One or both the conditions are true");
        else
        System.out.println("Both the conditions are false");
    }
}
