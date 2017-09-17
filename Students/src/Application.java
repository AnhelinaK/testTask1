import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Students
{
    String lastName;
    String name;
    Integer result;
}

class Application
{
    public static void main (String args [])
    {
        Students student1=new Students ();
        Students student2=new Students();
        Students student3=new Students();
        Students student4=new Students();
        Students student5=new Students();

        student1.lastName = "Pupkin";
        student1.name = "Vasya";

        student2.lastName = "Koval";
        student2.name = "Nastya";

        student3.lastName = "Kuznetsov";
        student3.name = "Anton";

        student4.lastName = "Puntus";
        student4.name = "Alex";

        student5.lastName = "Zodz";
        student5.name = "Masha";

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter result for " + student1.lastName + " " + student1.name + ":");
        student1.result = in.nextInt();
        System.out.println("Please enter result for " + student2.lastName + " " + student2.name + ":");
        student2.result = in.nextInt();
        System.out.println("Please enter result for " + student3.lastName + " " + student3.name + ":");
        student3.result = in.nextInt();
        System.out.println("Please enter result for " + student4.lastName + " " + student4.name + ":");
        student4.result = in.nextInt();
        System.out.println("Please enter result for " + student5.lastName + " " + student5.name + ":");
        student5.result = in.nextInt();
        float commonResult = (student1.result+student2.result+student3.result+student4.result+student5.result)/5;
        System.out.println(commonResult);
    }
}