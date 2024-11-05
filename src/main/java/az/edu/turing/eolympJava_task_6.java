package az.edu.turing;

import java.util.Scanner;

public class eolympJava_task_6 {
    public static void main(String[] args) {
        //input
        Scanner con = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = con.nextInt();
        int b = con.nextInt();
        int c = con.nextInt();

        //proses Üçbucağın duzbucaqlı üçbucaq olub olmamasını yoxla
        int temp;
        if(a<b) {
            temp = a;
            a = b;
            b=temp;
        }
         if(a<c) {
             temp = a;
             a = c;
             c = temp;
         }
         if(a*a==b*b+c*c) {
             System.out.println("Yes");
         }else
             System.out.println("No");

    }
}


