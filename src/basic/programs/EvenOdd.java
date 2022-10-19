package basic.programs;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Value");
        int num= s.nextInt();

        //Logic
        if (num%2==0)
        System.out.println("It is a Even Number");
        else
                System.out.println("It is a Odd number");
    }

}
