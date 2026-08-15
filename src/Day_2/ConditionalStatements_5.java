package Day_2;

import java.util.Scanner;

public class ConditionalStatements_5 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Day number : ");
            int DayNumber=sc.nextInt();
            switch(DayNumber){
                case 1:
                    System.out.println("Today is Saturday ");break;
                case 2:
                        System.out.println("Today is Sunday ");
                        break;
                case 3:
                    System.out.println("Today is Monday ");
                    break;
                case 4:
                    System.out.println("Today is Tuesday ");
                    break;
                case 5:
                    System.out.println("Today is Wednesday ");
                    break;
                case 6:
                    System.out.println("Today is Thursday ");
                    break;
                case 7:
                    System.out.println("Today is Friday ");
                    break;
                default:
                        System.out.println("Invalid Day Number");
            }

            sc.close();
        }
    }
