package basic.programs;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = s.nextInt();
        System.out.println("Enter the second number");
        int b = s.nextInt();
        System.out.println("Enter the third number");
        int c = s.nextInt();

        //Logic
        if(a > b){
            if(a > c){
                System.out.println("Largest among the three numbers is "+a);
            }else{
                System.out.println("Largest among the three numbers is "+c);
            }
        }else if(b > c){
            System.out.println("Largest among the three numbers is "+b);
            }else{
                System.out.println("Largest among the three numbers is "+c);
            }
        }
        }

