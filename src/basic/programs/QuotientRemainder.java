package basic.programs;
import java.util.Scanner;

public class QuotientRemainder {

        public static void main(String[] args) {
            System.out.println("Enter the value of num1 and num2");
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int quotient, remainder;


            quotient = num1 / num2;

            remainder = num1 % num2;

            System.out.println("Quotient when " + num1 + "/" + num2 + " is: "

                    + quotient);
            System.out.println("Remainder when " + num1 + " is divided by "

                    + num2 + " is: " + remainder);
        }
}

//public class Main {
//    public static void main(String[] args) {
//        int firstNumber, secondNumber, quotient, remainder;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the first and the second number: ");
//        firstNumber = sc.nextInt();
//        secondNumber = sc.nextInt();
//
//        quotient = firstNumber / secondNumber;
//        remainder = firstNumber % secondNumber;
//
//        System.out.println("Quotient: " + quotient + ", Remainder: " + remainder);