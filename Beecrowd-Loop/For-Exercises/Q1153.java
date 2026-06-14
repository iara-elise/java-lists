import java.util.Scanner;

public class Q1153 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = input.nextInt();

        input.close();

        int factorial = n;

        for (int i = 1; i < n; i++) {

            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);
    }
}