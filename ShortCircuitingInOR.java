public class ShortCircuitingInOR {
    public static void main(String[] args) {
        int a = 50, b = 75, c = 100;
        // displaying b
        System.out.println("Value of b: " + b);
        // Using logical OR
        /*
        short circuiting effect as the first condition is true so the
        ssecond condition is never reached and so ++b (pre increment) doesn't take place and 
        value of b remains unchanged
         */
        if((a < c) || (++b < c))
        System.out.println("Inside if");
        // displaying b
        System.out.println("Value of b: " + b);
    }
    
}
