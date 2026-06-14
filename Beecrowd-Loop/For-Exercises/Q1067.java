import java.util.Scanner;

public class Q1067 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
