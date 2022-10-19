package basic.programs;
import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Alphabet: ");
        ch = scanner.next().charAt(0);
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        System.out.println("It is a Vowel");
        else
            System.out.println("It is a Consonant");

    }
}
