public class ShortCircuitingInAND {
    public static void main(String[] args) {
        int a = 80, b = 85, c = 99;
        // displaying b
        System.out.println("Value of b: " + b);
        // using logical AND
        /*
        short circuiting effect as the first condition is false so the second condition is never checked
        and so ++b(pre increment) doesn't take place and value of b remains unchanged.
         */
        if((a > c) && (++b > c)) {
            System.out.println("Inside if block");
        }
        // displaying b
        System.out.println("Value of b: " + b);
    }
    
}
