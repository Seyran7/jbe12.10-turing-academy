package az.edu.turing;

import java.util.Scanner;

public class eolympJava_task_10 {
    public static void main(String[] args) {
        //input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer between 1 and 12: ");
        int num = scan.nextInt();
        //proses Ayların hansı neçenci fesil olduğunu tap
        if (num < 1 || num > 12) {
            System.out.println("wrong number:please enter a number between 1 and 12");
        }else if(num>=3&&num<=5) {
            System.out.println("Second");
        }else if(num>=6&&num<=8) {
            System.out.println("Third");
        }else if(num>=9&&num<=11) {
            System.out.println("Fourth");
        }else{
            System.out.println("First");
        }
    }
}