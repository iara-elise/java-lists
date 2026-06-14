import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three integers: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        input.close();
        
        if (num1 <= num2 && num1 <= num3) {

            if(num2 <= num3) {
                System.out.println("Numbers in ascending order: " + num1 + ", " + num2 + ", " + num3 + ".");
            }
            else {
                System.out.println("Numbers in ascending order: " + num1 + ", " + num3 + ", " + num2 + ".");
            }
        }

        else if (num2 <= num1 && num2 <= num3) {

            if(num1 <= num3) {
                System.out.println("Numbers in ascending order: " + num2 + ", " + num1 + ", " + num3 + ".");
            }
            else {
                System.out.println("Numbers in ascending order: " + num2 + ", " + num3 + ", " + num1 + ".");
            }
        }
        
        else {
            if(num1 <= num2) {
                System.out.println("Numbers in ascending order: " + num3 + ", " + num1 + ", " + num2 + ".");
            }
            else {
                System.out.println("Numbers in ascending order: " + num3 + ", " + num2 + ", " + num1 + ".");
            }
        }
    }
}