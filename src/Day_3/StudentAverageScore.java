package Day_3;

import java.util.Scanner;

public class StudentAverageScore {
    public static void main(String[] args) {

        int numberOfStudents=3;
        int numberOfCourses=4;
        Scanner sc=new Scanner(System.in);


        for(int j=0;j<numberOfStudents;j++){
            double total=0;
            for(int k=0;k<numberOfCourses;k++){
                System.out.println("Enter Student "+(j+1)+" Course "+(k+1));
                double score=sc.nextDouble();
                total+=score;
            }
            System.out.println("The average score is "+total/numberOfStudents);
        }
    }
}
