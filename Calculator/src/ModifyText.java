import java.util.Scanner;

public class ModifyText {
    public static void main(String[] arguments) {
        Scanner input = new Scanner(System.in);
        String someText;
        // Allows a person to enter his/her text to modify
        Scanner one = new Scanner(System.in);
        System.out.println("Enter some text:");
        someText = one.nextLine();

//Reverses text
                String reversedString = new StringBuffer(someText).reverse().toString();
        System.out.println("Reversed text is: " + reversedString);

        //Splits the text by space
        System.out.println("Splitted text: ");
        for (String splittedText : someText.split(" ")) {
            System.out.println(splittedText);

        }
//Replaces all spaces into *
        System.out.print("Text with replaced spaces to *: " );
        System.out.println(someText.replace(' ', '*'));

        // Changes the text into UpperCase
        String upperCaseText;
        upperCaseText = someText.toUpperCase();
        System.out.println("Changed text to UpperCase: " + upperCaseText);
        if
                (someText.length()<10)
        {           System.out.println("Text should be 10+ symbols. Please enter more longer text:");
            someText = one.nextLine();}

        //Cuts text from 5 to 10 symbol
        String cutString;
        cutString = someText.substring(5, 10);
        System.out.println("Cut text: " + cutString);

    }
}
