package Day_2;

import java.util.Scanner;

public class ConditionalStatements_3 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the first number : ");
            int number1=sc.nextInt();
            System.out.println("Enter the second number : ");
            int number2=sc.nextInt();
            System.out.println("Enter the third number : ");
            int number3=sc.nextInt();
            if(number1>number2 && number1>number3)
                System.out.println(" the first number  is greater");
            else if ( number2>number1 && number2>number3)
                System.out.println(" the second number  is greater");
            else
                System.out.println(" the third number  is greater");

            sc.close();
        }
    }
