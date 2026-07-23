import java.util.Scanner;

public class Q1142 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int counter = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 4; j++) {

                if(j == 4) {
                    System.out.println("PUM");
                }
                else {
                    System.out.print(counter + " ");
                }

                counter++;
            }
        }

        input.close();
    }
}
