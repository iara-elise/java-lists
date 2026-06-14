import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;
        
        System.out.println("Enter 10 numbers:");

        for(int i = 1; i <= 10; i++) {
            int num = input.nextInt();

            if(num % 2 == 0) {
                evenSum += num;
            }
            else {
                oddSum += num;
            }

        }

        input.close();

        if(oddSum > evenSum) {
            System.out.println("The sum of odd numbers is GREATER than the sum of even nummbers.");
        }
        else if(oddSum < evenSum) {
            System.out.println("The sum of odd numbers is LESS than the sum of even numbers.");
        }
        else {
            System.out.println("The sum of odd numbers and even numbers is equal.");
        }
    }
}
