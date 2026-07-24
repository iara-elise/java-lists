import java.util.Scanner;

public class Q1144 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++) {

            int square = i * i;
            int cube = square * i;

            System.out.println(i + " " + square + " " + cube);
            System.out.println(i + " " + (square + 1) + " " + (cube + 1));

        }

        input.close();
    }
}
