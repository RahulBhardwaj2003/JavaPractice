import java.util.Scanner;
public class IfStatement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = s.nextInt();
        if(a < 0) {
            System.out.println("It is a negative number.");
        }
    }
}
