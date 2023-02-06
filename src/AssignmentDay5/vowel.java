package AssignmentDay5;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args){
        char ch;

        Scanner r=new Scanner(System.in);
        System.out.println("Enter any character :");
        ch=r.next().charAt(0);
        if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'
         || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("character is vowel");
        }
        else {
            System.out.println("character is Consonant");
        }
    }
}
