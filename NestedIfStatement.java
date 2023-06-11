import java.util.Scanner;
public class NestedIfStatement {

   public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the value of x and y");
      int x = s.nextInt();
      int y = s.nextInt();

      if( x == 30 ) {
         if( y == 10 ) {
            System.out.print("X = 30 and Y = 10");
         } 
      } else {
          System.out.println("ERROR");
      }
   }
}
