package AssignmentDay5;

import java.util.Scanner;


    public class Leapyear {
        public static void main(String[] args) {
            int y;
            System.out.println("Enter any year : ");
            Scanner r = new Scanner(System.in);
            y = r.nextInt();
            if (y%100==0 && y%400==0 || y%100!=0 && y%4==0) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not Leap Year");
            }
        }
    }

