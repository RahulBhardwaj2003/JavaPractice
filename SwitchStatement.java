import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
        String dayType;
        String dayString;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter week number: ");
        int d = s.nextInt();
        switch(d) {
            case 1:
            dayString = "MONDAY";
            break;
            case 2:
            dayString = "TUESDAY";
            break;
            case 3:
            dayString = "WEDNESDAY";
            break;
            case 4:
            dayString = "THRUSDAY";
            break;
            case 5:
            dayString = "FRIDAY";
            break;
            case 6:
            dayString = "SATURDAY";
            break;
            case 7:
            dayString = "SUNDAY";
            break;
            default:
            dayString = "INVALID DAY";
        }
        switch(d) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            dayType ="Weekday";
            break;
            case 6:
            case 7:
            dayType = "Weekend";
            break;
            default:
            dayType = "INVALID DAYTYPE";
        }
        System.out.println(dayString + " is a " + dayType);
    }
    
}
