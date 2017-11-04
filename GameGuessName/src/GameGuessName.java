import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Random;
import java.lang.Math;
import java.io.*;
import java.lang.*;
import java.util.*;


public class GameGuessName {

    public static void main(String[] args) {
        int TrysCount = 1;
        boolean iterated = false;
        String temp = "";
        String holder = "";
        String knownWord = "";

        Scanner keyboard = new Scanner(System.in);
        String unknownWord = "ANGELINA KUZNETSOVA";
        System.out.println("This is a guessing words game.");

        do {
            System.out.println("Enter your letter guess or full word");
            String guess = keyboard.nextLine();
            guess=guess.toUpperCase();

            String names[] = unknownWord.split(" ");
            String fName = names[0];
            String lName = names[1];
            String reverseName = names[1] + " " + names[0];

            if ((guess.equals(unknownWord) || (guess.equals(reverseName))))
            {
                System.out.println("Congrats! Correct full name is " + unknownWord + ". Number of tries: " + TrysCount);
                break;
            }

            if (guess.equals(fName) ) {
                System.out.println("You`ve guessed correctly Fist name. First name is " + fName + ". Number of tries: " + TrysCount + ".");
               int len = lName.length();
                holder = "";
                knownWord = fName + " " + knownWord;
                int a = 0;
                while(a < len) {
                    holder = (holder + "*");
                    a++;
                }
                if (knownWord. contains (lName))
                {
                    System.out.println (knownWord);
                    System.out.println("You`ve got it! Correct full name is " + unknownWord + ". Number of tries: " + TrysCount);
                    break;
                }
                else {
                    System.out.println(fName + " " + holder);
                }

            }

          else  if (guess.equals(lName) )
            {
                System.out.println("You`ve guessed correct Last name. Last name is " + lName + ". Number of tries: " + TrysCount + ".");
                int len = fName.length();
                knownWord = knownWord + " "+ lName;
                temp = (lName + " ");
                int a = 0;
                holder = "";
                while(a < len) {

                    holder = (holder + "*");
                    a++;
                }
                if (knownWord. contains (fName))
                {
                    System.out.println (knownWord);
                    System.out.println("You`ve got it! Correct full name is " + unknownWord + ". Number of tries: " + TrysCount);
                    break;
                }
                else {
                    System.out.println(holder + " " + lName);
                }
            }

           for(int i = 0; i < unknownWord.length(); i ++) {
                if (guess.equals(Character.toString(unknownWord.charAt(i)))) {
                    if (!iterated)
                        temp = temp + Character.toString(unknownWord.charAt(i));
                    else {
                        holder = Character.toString(temp.charAt(i)).replace("*", guess);
                        temp = temp.substring(0, i) + holder + temp.substring(i + 1, temp.length());
                    }
                } else {
                    if(!iterated) {
                        temp = temp + "*";
                    }
                }
            }

            TrysCount++;
            iterated = true;
            System.out.println(temp);
            if(temp.equals(unknownWord)) {
                System.out.println("Congrats! You guessed correctly! Number of tries: " + TrysCount);
                break;
            }
        }while (TrysCount < 1000);

    }
}



