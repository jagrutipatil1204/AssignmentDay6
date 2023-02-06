
package AssignmentDay5;

import java.util.Scanner;

public class harmonicno{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        double harmonicNumber = 0.0;
        for (int i = 1; i <= n; i++) {
            harmonicNumber += 1.0 / i;
        }

        System.out.println("The " + n + "th harmonic number is: " + harmonicNumber);
    }
}
