public class TernaryOperatorLargestAmongTwo {
    public static void main(String[] args) {
        int a = 8, b = 56, max;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // largest among a and b
        max = (a > b) ? a:b;
        // display largest
        System.out.println("Maximum is: " + max);
    }
}
