package az.edu.turing;

public class ForExample {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
            }
        }
    }
