import java.util.Scanner;

public class Romb {
        public static void main(String[] args)
        {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter size of the Romb : ");
            int size=input.nextInt();

            for(int i=1;i<=size;i++)
            {
               for(int j=1;j<=size-i;j++)

               {
                    System.out.print(" ");
                }

                for(int j=1;j<=i*2-1;j++)

                {
                    System.out.print("*");
                }
                System.out.println();

            }

            for(int i=size-1;i>0;i--)
            {
                for(int j=1;j<=size-i;j++)

                {
                    System.out.print(" ");
                }
                for(int j=1;j<=i*2-1;j++)

                {
                    System.out.print("*");
                }
                System.out.println();
            }


        }
    }