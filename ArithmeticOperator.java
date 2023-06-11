import java.util.Scanner;
public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double d1 = s.nextDouble();
        System.out.println("Enter second number: ");
        double d2 = s.nextDouble();
        double sum = d1 + d2;
        double subtraction = d1 - d2;
        double multiplication = d1 * d2;
        double division = d1 / d2;
        System.out.println("Sum is: " + sum);
        System.out.println("Subtraction is: " + subtraction);
        System.out.println("Multiplication is: " + multiplication);
        System.out.println("Division is: " + division);
    }
}

