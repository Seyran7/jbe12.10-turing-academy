package az.edu.turing;

import java.util.Scanner;

public class findLastCharacter {
    public static void main(String[]args){
        //input
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=scan.nextLine();
        //proses
        char lastCh=word.charAt(word.length()-1);
        System.out.println(lastCh);
    }
}
