import java.util.Scanner;

public class Q1101 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers: ");

        int m = input.nextInt();
        int n = input.nextInt();

        while (m > 0 && n > 0) {

            int sum = 0;
            
            if(m < n) {
                for(int i = m; i <= n; i++) {
                    sum += i;
                    System.out.print(i + " ");
                }

                System.out.println("Sum: " + sum);
            }
            else {
                for(int i = n; i <= m; i++) {
                    sum += i;
                    System.out.print(i + " ");
                }

                System.out.println("Sum: " + sum);
            }

            m = input.nextInt();
            n = input.nextInt();
        }
        
        input.close();
    }
}
