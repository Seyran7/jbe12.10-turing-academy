package az.edu.turing;

import java.util.Scanner;

public class eolympJava_task_7 {
    public static void main(String[]args){
        //input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers between 1 and 12");
        int num=scan.nextInt();
        //proses
        String calendar;
        switch (num){
            case 1:
                calendar=("january-winter");
                break;
            case 2:
                calendar=("february-winter");
                break;
            case 3:
                calendar=("march-spring");
                break;
            case 4:
                calendar=("april-spring");
                break;
            case 5:
                calendar=("may-spring");
                break;
            case 6:
                calendar=("june-summer");
                break;
            case 7:
                 calendar=("july-summer");
                 break;
            case 8:
                calendar=("august-summer");
                break;
            case 9:
                calendar=("september-autumn");
                break;
            case 10:
                calendar=("october-autumn");
                break;
            case 11:
                calendar=("november-autumn");
                break;
            case 12:
                calendar=("december-winter");
                break;
            default:
                calendar="Invalid number";
                break;
        }
        System.out.println(calendar);

    }
}
