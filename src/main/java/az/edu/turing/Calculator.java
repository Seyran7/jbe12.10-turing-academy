package az.edu.turing;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Double a=0.0;
        Double b=0.0;
        char operation;

        System.out.println("Enter  a number:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        System.out.println("Choose an operation:");
        Scanner sc1=new Scanner(System.in);
        operation=sc1.next().charAt(0);
        System.out.println("Enter a number");
        Scanner sc2=new Scanner(System.in);
        b=sc2.nextDouble();
        Double result=0.0;
        if(operation=='+'){
            result=a+b;
        }else if(operation=='-'){
            result=a-b;
        }else if(operation=='*'){
            result=a*b;
        }
        else if(operation=='/'){
            result=a/b;
        }
        else{
            System.out.println("Invalid operation");
        }
        System.out.println(result);

    }
}
