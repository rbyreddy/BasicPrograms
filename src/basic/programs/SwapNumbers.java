package basic.programs;
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int c;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        int a= s.nextInt();
        int b= s.nextInt();
        System.out.println("Before Swapping the Numbers"+a+" "+b);

        c=a;
        a=b;
        b=c;
        System.out.println("After Swapping the Numbers "+a+" "+b);

    }

}
