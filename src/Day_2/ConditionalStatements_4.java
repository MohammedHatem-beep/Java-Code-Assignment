package Day_2;

import java.util.Scanner;

public class ConditionalStatements_4 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Day number : ");
            int DayNumber=sc.nextInt();
            if(DayNumber==1)
                System.out.println("Today is Saturday");
            else if(DayNumber==2)
                System.out.println("Today is Sunday");
            else if(DayNumber==3)
                System.out.println("Today is Monday");
            else if(DayNumber==4)
                System.out.println("Today is Tuesday");
            else if(DayNumber==5)
                System.out.println("Today is Wednesday");
            else if(DayNumber==6)
                System.out.println("Today is Thursday");
            else if(DayNumber==7)
                System.out.println("Today is Friday");
            sc.close();
        }
    }
