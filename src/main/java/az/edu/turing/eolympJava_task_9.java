package az.edu.turing;

import java.util.Scanner;

public class eolympJava_task_9 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a four digits number: ");
        int num=scan.nextInt();
        //proses Dördreqemli ededin ilk ve son reqeminin cemini çap et
        int a=num/1000;
        int b=num%10;
        int sum=a+b;
        System.out.println("Sum of digits is: "+sum);
    }
}
