import java.util.Scanner;

public class Q1154 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter some ages:");

        int ages = input.nextInt();

        int count = 0;
        double sum = 0;

        while (ages >= 0) {

            count++;
            sum += ages;

            ages = input.nextInt();
        }

        input.close();

        System.out.printf("Average age: %.2f%n", sum / count);
    }
}
