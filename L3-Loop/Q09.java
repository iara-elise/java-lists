import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 1; i <= 10; i++) {
            int num = input.nextInt();

            if (i % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        input.close();

        System.out.println("Sum of a sequence of even numbers in even positions: " + evenSum);
        System.out.println("Sum of sequence of odd numbers in odd positions: " + oddSum);

        if(oddSum > evenSum) {
            System.out.println("The sum of numbers in odd positions is GREATER than the sum of numbers in even positions.");
        }
        else if(oddSum < evenSum) {
            System.out.println("The sum of numbers in odd positions is LESS than the sum of numbers in even positions.");
        }
        else {
            System.out.println("The sum of numbers in odd positions and even positions is equal.");
        }
    }
}
