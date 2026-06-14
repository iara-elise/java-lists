import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("How many numbers do you want to enter? ");

        int totalInputs = input.nextInt();
        int sum = 0;

        System.out.println("Enter " + totalInputs + " numbers: ");

        for(int i = 1; i <= totalInputs; i++) {
            int num = input.nextInt();

            if(num % 2 == 0) {
                sum += num;
            }
        }

        input.close();
        System.out.println("Sum of even numbers: " + sum);
    }
}
