import java.util.Scanner;

public class Q1079 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            double grade1 = input.nextDouble();
            double grade2 = input.nextDouble();
            double grade3 = input.nextDouble();

            double average = (( grade1 * 2) + (grade2 * 3) +  grade3 * 5) / 10;

            System.out.printf("Average:  %.1f", average);
        }
        
        input.close();
    }
}
