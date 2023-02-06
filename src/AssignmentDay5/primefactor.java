package AssignmentDay5;

import java.util.Scanner;

public class primefactor {
    public static void main(String[] args){
        int num,temp,i=2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any no :");
        num= sc.nextInt();
        temp=num;
        System.out.println("prime factor of Number :");
        while (temp>1)
        {
            if(temp%i==0){
                System.out.println(i+",");
                temp=temp/i;
            }
            else {
                i++;
            }
        }
    }
}
