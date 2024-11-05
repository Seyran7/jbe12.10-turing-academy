package az.edu.turing;

import java.util.Scanner;

public class eolympJava {
    public static void main(String[] args) {
        //input
                Scanner in = new Scanner(System.in);
                System.out.println("Enter a number:");
                int number = in.nextInt();
       //proses iki reqemli ededin reqemlerini bir-birinden ayri cap et
                System.out.printf("%d %d\n", number/10, number%10);
    }
}


