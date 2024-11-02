package az.edu.turing;

import java.util.Scanner;

public class scanner_task_calendar {
    public static void main(String[] args) {
              //input
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir rəqəm daxil edin:1-12 aralığında");
        int num = scan.nextInt();
             //proses
        switch (num) {
            case 1:
                System.out.println("january-winter");
                break;
            case 2:
                System.out.println("february-winter");
                break;
            case 3:
                System.out.println("mart-spring");
                break;
            case 4:
                System.out.println("aprel-spring");
                break;
            case 5:
                System.out.println("may-spring");
                break;
            case 6:
                System.out.println("june-summer");
                break;
            case 7:
                System.out.println("july-summer");
                break;
            case 8:
                System.out.println("august-summer");
            case 9:
                System.out.println("september-autumn");
            case 10:
                System.out.println("october-autumn");
            case 11:
                System.out.println("november-autumn");
            case 12:
                System.out.println("december-winter");
            default:
                System.out.println("yanlıș ədəd daxil etmisiniz");
        }
    }
}



