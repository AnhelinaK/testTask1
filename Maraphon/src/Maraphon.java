import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;


public class Maraphon {
    public static void main(String[] arguments) {
        String[] names = {" ", "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James",
                "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {0, 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
        HashMap newmap = new HashMap();
        int i;
        for (i = 0; i < times.length; ++i) {
            newmap.put(times[i], names[i]);
        }
        TreeMap<Integer, String> sorted = new TreeMap<>(newmap);
        System.out.println("Sorted names and times in Maraphon: " + sorted);
        System.out.println("The winner of the maraphon is: " + sorted.values().toArray()[1] + "!");
        System.out.println(sorted.values().toArray()[2] + " has taken 2nd place with time " + sorted.keySet().toArray()[2] + " (secs)");
        
        Scanner input = new Scanner(System.in);
        int userPlace;
        //Allows user to enter number of week day
        Scanner one = new Scanner(System.in);
        System.out.println("Enter place of the person to see the name and time");
        userPlace = one.nextInt();
        if (userPlace > times.length || userPlace < 1) {
            System.out.println("Not valid number. Please enter number again");
            userPlace = one.nextInt();
        }
        System.out.println(sorted.values().toArray()[userPlace] + " has taken " + userPlace + " place with time " + sorted.keySet().toArray()[userPlace] + " (secs)");
    }
}

