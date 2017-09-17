import java.util.Scanner;
public class Application {

    public static void main(String[] args) {

        int num1;
        int num2;
        String operation;

        Scanner input = new Scanner(System.in);

       // do {
            System.out.println("Please Enter The First Number");
            num1 = input.nextInt();

            System.out.println("Please Enter The Second Number");
            num2 = input.nextInt();

            Scanner op = new Scanner(System.in);

            System.out.println("Please Enter The Operation");
            operation = op.next();

            if (operation.equals("+")) {
                System.out.println("Your Answer is " + (num1 + num2));
            } else if (operation.equals("-")) {
                System.out.println("Your Answer is " + (num1 - num2));
            } else if (operation.equals("*")) {
                System.out.println("Your Answer is " + (num1 * num2));
            } else if (operation.equals("/")) {
                System.out.println("Your Answer is " + (num1 / num2));
            } else {
                System.out.println("Wrong selection. Please enter '-', '+', '*' or '/'");
            }
           // while (operation == ("exit")) ;
          //  break;
        }
    }
