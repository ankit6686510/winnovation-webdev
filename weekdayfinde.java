
import java.util.Scanner;

public class weekdayfinde {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number (1-7): ");
        int day = scn.nextInt();

        // Using switch statement to determine the day
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        // Closing the scanner
        scn.close();
    }
}
