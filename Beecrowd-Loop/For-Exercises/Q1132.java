import java.util.Scanner;

public class Q1132 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter two numbers:");

        int x = input.nextInt();
        int y = input.nextInt();

        input.close();

        for(int i = x; i <= y; i++) {

            if(i % 13 != 0) {
                sum += i;
            }
        }

        System.out.println("Sum of numbers not divisible by 13: " + sum);
    }
}