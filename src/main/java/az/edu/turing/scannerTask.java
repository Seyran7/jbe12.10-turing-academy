package az.edu.turing;

import java.util.Scanner;

public class scannerTask {
    public static void main (String[]args){
        //input
    Scanner scan=new Scanner(System.in);
    System.out.println("Bir rəqəm daxil edin:");
    int num = scan.nextInt();

        //proses
    if(num==0) {
        System.out.println("Ədəd sıfıra bərabərdir");
    } else {
        if (num % 2 == 0) {
            System.out.println("Ədəd cütdür");
        } else {
            System.out.println("Ədəd təkdir");
        }

        if (num < 0) {
            System.out.println("Ədəd mənfidir");
        } else {
            System.out.println("Ədəd müsbətdir");
        }
      }
    }
}
