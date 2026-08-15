package Day_2;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        boolean response;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter the first number");

            int first=sc.nextInt();
            System.out.println("Enter the second number");
            int second=sc.nextInt();
            System.out.println("the sum is : "+(first+second));
            System.out.println("do you want to continue? 1. true 2.false ");
             response =sc.nextBoolean();


        } while (response);
        sc.close();




    }
}
