import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("I calculate the sum of a sequence of numbers. Enter the total numbers of values to be summed: ");
        int values = input.nextInt();

        int num = 0;
        int sum = 0;
        String enteredNumber = "";

        for(int i = 1; i <= values; i++) {
            num = input.nextInt();

            if(i == values) {
                enteredNumber += num + " = ";
            }
            else {
                enteredNumber += num + " + ";
            }

            sum += num;
        }

        input.close();

        System.out.println(enteredNumber + sum);
    }
}
