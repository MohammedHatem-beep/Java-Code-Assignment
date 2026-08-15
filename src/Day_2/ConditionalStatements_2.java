package Day_2;

import java.util.Scanner;

public class ConditionalStatements_2 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number : ");
            int number=sc.nextInt();
            if(number>0)
                System.out.println(" is positive");
            else if (number<0)
                System.out.println("The number is negative");
            else
                System.out.println(" is zero");

            sc.close();
        }
    }
