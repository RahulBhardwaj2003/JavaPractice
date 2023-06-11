import java.util.Scanner;
public class IfElseIfStatement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the week number: ");
        int a = s.nextInt();
        if(a == 1) {
            System.out.println("It's MONDAY");
        } else if(a == 2) {
            System.out.println("It's TUESDAY");
        } else if(a == 3) {
            System.out.println("It's WEDNESDAY");
        } else if(a == 4) {
            System.out.println("It's THRUSDAY");
        } else if(a == 5) {
            System.out.println("It's FRIDAY");
        } else if(a == 6) {
            System.out.println("It's SATURDAY");
        } else if(a == 7) {
            System.out.println("It's SUNDAY");
        } else {
            System.out.println("ERROR");
        }
    }
    
}
