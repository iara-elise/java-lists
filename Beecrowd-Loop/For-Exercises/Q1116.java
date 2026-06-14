import java.util.Scanner;

public class Q1116 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            double x = input.nextInt();
            double y = input.nextInt();

            double division = x / y;

            if (y == 0) {
                System.out.println("Impossible division!");
            }

            else {
                System.out.println(division);
            }
        }

        input.close();
    }
}
