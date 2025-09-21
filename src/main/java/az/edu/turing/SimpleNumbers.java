package az.edu.turing;
import java.util.Scanner;

public class SimpleNumbers {
    public static void main(String[] args) {

        int n = 3;
        int count=0;
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j : arr) {
            if (detect(j)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean detect(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}