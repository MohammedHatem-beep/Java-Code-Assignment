package Day_3;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String word=sc.nextLine();
        sc.close();
        boolean letterFound=false;
        int position=0;
        for(int j=0;j<word.length();j++){
            char Currentletter=word.charAt(j);
            if(Currentletter=='a' ||Currentletter=='A'){
                letterFound=true;
                position=j+1;
                break;
            }
        }
        if(letterFound){
            System.out.println("Letter found in word in position: "+(position));
        }
        else{
            System.out.println("Letter not found in word");
        }
    }
}
