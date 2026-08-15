package Day_2;

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        int rate = 15;
        int MaxWeeklyHours=40;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of working hours ");
        double workingHours=sc.nextDouble();
        while(workingHours>MaxWeeklyHours){
            System.out.println("Enter the number of working hours between 1 and 40 ");
            workingHours=sc.nextDouble();
        }
        double Grosssalary=workingHours*rate;
        System.out.println("The Gross salary is : "+Grosssalary +"$");

    }

    }
