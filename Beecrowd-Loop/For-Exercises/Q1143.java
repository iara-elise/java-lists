import java.util.Scanner;

public class Q1143 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            int square = i * i;
            int cube = i * i * i;

            System.out.print(i + " ");
            System.out.print(square + " ");
            System.out.print(cube + "\n");

        }

        input.close();
    }
}
