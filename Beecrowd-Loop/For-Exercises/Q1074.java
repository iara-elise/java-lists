import java.util.Scanner;

public class Q1074 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            int x = input.nextInt();

            if (x % 2 == 0 && x > 0) {
                System.out.println(x + " is even and positive!");
            }
            else if (x % 2 == 0 && x < 0) {
                System.out.println( x + " is even and negative!");
            }
            else if (x % 2 != 0 && x > 0) {
                System.out.println(x + " is odd and positive!");
            }
            else if(x % 2 != 0 && x < 0) {
                System.out.println(x + " is odd and negative!");
            }
            else {
                System.out.println("Null!");
            }
        }

        input.close();
    }
}
