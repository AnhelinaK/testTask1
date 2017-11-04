import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] arguments) {
        Scanner input = new Scanner(System.in);
        int someText;
        //Allows user to enter number of week day
        Scanner one = new Scanner(System.in);
        System.out.println("Enter number of current day of the week (number from 1 to 7):");
        someText = one.nextInt();
        if (someText > 7 || someText < 1) {
            System.out.println("Not valid number. Please enter number from 1 to 7");
            someText = one.nextInt();
        }
        String [] smallPrimes = {"","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(smallPrimes[someText]);
    }
}
