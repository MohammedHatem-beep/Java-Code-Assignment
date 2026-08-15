package Day_2;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args)
{
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number of items");
    int numberofitems=scanner.nextInt();
    double totalprice=0.0;
    for (int i=0;i<numberofitems;i++){
        System.out.println("Enter the "+(i+1)+" item Price: ");
        double itemprice=scanner.nextDouble();
        totalprice=totalprice+itemprice;
    }
    System.out.println("The total price is "+totalprice);
}
}
