package AssignmentDay5;

import java.util.Scanner;

public class even {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any no :");
        int n;
        n= sc.nextInt();
        if(n%2==0){
            System.out.println("no is Even");
        }
        else {
            System.out.println("no is odd");
        }
    }
}
