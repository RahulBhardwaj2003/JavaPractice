public class PostIncrementOperator {
    public static void main(String[] args) {
        int x = 8;
        int y = x++;
        System.out.println("y value is: " + y);
        System.out.println("new y value is: " + y++);
        System.out.println("new y value is: " + y++);
    }
}
