
import java.util.Scanner;

public class Tomjerry {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();  /* Accepts number */

        tomandjerry(number);
    }

    private static void tomandjerry(int number)
    {

        if((number>20)&&(number<30)&&(number%2!=0))
            System.out.println("Tom");

        if((number>20)&&(number<30)&&(number%2==0))
            System.out.println("Jerry");

    }
}

