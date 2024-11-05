package az.edu.turing;

import java.sql.SQLOutput;
import java.util.Scanner;

public class eolympJava_task_2 {
    public static void main(String[]args){
                   // input
                Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
                  //proses uc reqemli ededin reqemleri arasindan orta reqemi tap
        int med;
        if ((a > b && a < c) || (a < b && a > c)) {
            med = a;
        } else if ((b > a && b< c) || (b< a && b > c)) {
            med = b;
        } else {
            med = c;
        }
        System.out.println(med);

    }
}
