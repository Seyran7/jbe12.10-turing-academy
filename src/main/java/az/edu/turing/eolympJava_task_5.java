package az.edu.turing;

import java.util.Scanner;

public class eolympJava_task_5 {
    public static void main(String[] args) {

        //input
        Scanner big = new Scanner(System.in);
        System.out.println("Enter a three digit positive number:");
        int num = big.nextInt();
        //proses 3 reqemli ededin reqemlerinin arasindan en boyuk olanini tap
        int a = num / 100;
        int b = (num / 10) % 10;
        int c = num % 10;

        int result;
        if (a == b && b == c) {
            System.out.println("=");
        }else if (a > b && a > c) {
            result = a;
        } else {
            if (b > c && b > a) {
                result = b;
            } if (c > a && c > b) {
                result = c;
            System.out.println(result);
            }
        }
    }
}