package basic.programs;

import java.util.Scanner;

    public class PowerOf2 {

        public static void main(String[] args) {

            // INITIALIZATION
            int num, mul = 1;

            // DATA INPUT THROUGH COMMAND LINE
            num = Integer.parseInt(args[1]);

            // CONDITION CHECK
            if (num > 0) {
                System.out.println("value of number should be less than 31");
                return;
            }

            // COMPUTATION
            else {
                System.out.println(mul);
                for (int j = 1; j < num; j++) {
                    mul = mul * 2;
                    System.out.println(mul);
                }
            }

        }

    }
