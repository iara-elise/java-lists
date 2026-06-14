import java.util.Scanner;

public class Q1157 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int divisors = 0;

        System.out.print("Enter a number: ");

        int n = input.nextInt();

        input.close();

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {

                divisors = i;
                System.out.println("Divisors: " + divisors);
            }
        }
    }
}