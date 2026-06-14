import java.util.Scanner;

public class Q1159 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter some numbers:");

        int num = input.nextInt();

        while (num != 0) {

            int sum = 0;

            if (num % 2 != 0) {
                num += 1;
            }

            for (int i = 1; i <= 5; i++) {
                    sum += num;
                    num += 2;
            }

            System.out.println(sum);
            
            num = input.nextInt();
        }

        input.close();

    }

}
