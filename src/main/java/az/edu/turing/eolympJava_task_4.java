package az.edu.turing;

import java.util.Scanner;

public class eolympJava_task_4 {
    public static void main(String[]args){
              //input
        Scanner sqw=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        long a=sqw.nextLong();
        long b=sqw.nextLong();
              //proses daxil edilmis iki ededin kvatratlari cemini tap
        long res;
        res=a*a+b*b;
        System.out.println(res);



    }

}
