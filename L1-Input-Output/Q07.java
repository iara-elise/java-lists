import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weightedSum = 0;
        int weightsTotal = 0;

        System.out.println("GRADES AND WEIGHTS");

        for (int i = 1; i <= 4; i++) {
            System.out.print("Grade " + i + ": ");
            double grade = input.nextDouble();

            System.out.print("Weight " + i + ": ");
            int weight = input.nextInt();

            System.out.println();

            weightedSum += grade * weight;
            weightsTotal += weight;
        }

        input.close();
        System.out.println();

        double weightedAverage = weightedSum / weightsTotal;
        System.out.printf("WEIGHTED AVERAGE: %.1f", weightedAverage);
    }
}