import java.util.Scanner;

public class calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = sc.nextInt();
        switch (num) {
            case 1:
                int add = a + b;
                System.out.println(add);
                break;
            case 2:
                int sub = a - b;
                System.out.println(sub);
                break;
            case 3:
                int mul = a * b;
                System.out.println(mul);
                break;
            case 4:
                int div = a / b;
                System.out.println(div);
                break;
            default:
                break;
        }

    }

}
