import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double gradesSum = 0;
        int gradesCount = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Grade " + i + ": ");
            double grade = input.nextDouble();

            gradesSum += grade;
            gradesCount++;
        }

        input.close();
        System.out.println();

        double average = gradesSum / gradesCount;
        System.out.printf("ARITHMETIC MEAN: %.1f", average);
        
    }
}