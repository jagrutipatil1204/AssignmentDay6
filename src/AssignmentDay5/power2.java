package AssignmentDay5;

import java.util.Scanner;
public class power2 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of N: ");
            int n = sc.nextInt();

            if (n >= 0 && n < 31) {
                System.out.println("Powers of 2 that are less than or equal to 2^" + n + ":");
                int result = 1;
                for (int i = 0; i <= n; i++) {
                    System.out.println("2^" + i + " = " + result);
                    result *= 2;
                }
            } else {
                System.out.println("N should be between 0 and 30 (inclusive)");
            }
        }
    }

