import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = input.nextInt();

        input.close();

        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0) {
                System.out.println("PI");
            }
            else if (i % 7 == 0) {
                System.out.println("POW");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
