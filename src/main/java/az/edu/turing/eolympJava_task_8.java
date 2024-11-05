package az.edu.turing;

import java.util.Scanner;

public class eolympJava_task_8 {
    public static void main (String[]args){
        //input
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a three digits number");
       int num=scan.nextInt();
        //proses Üçreqemli ededin reqemleri ceminin kvadrat kökünü tap
        int a=num/100;
        int b=num/10%10;
        int c=num%10;
        int sum=a+b+c;

        double squareRoot=Math.sqrt(sum);
        System.out.printf("%.3f" ,squareRoot);


    }
}
