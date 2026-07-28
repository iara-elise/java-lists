import java.util.Scanner;

public class Q1158 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            int sum = 0;

            int x = input.nextInt();
            int y = input.nextInt();

            if (x % 2 == 0) {
                x++;

                for (int j = 1; j <= y; j++) {
                    sum += x;
                    x += 2;
                }

                System.out.println(sum);

            } else {
                for (int j = 1; j <= y; j++) {
                    sum += x;
                    x += 2;
                }

                System.out.println(sum);
            }
        }
        input.close();
    }
}
