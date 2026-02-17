/* Beecrowd - Questão 1072 */

/* Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações. */

import java.util.Scanner;

public class Q1072 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numbers of values to be read: ");
        int n = input.nextInt();

        int inCount = 0;
        int outCount = 0;

        for (int i = 1; i <= n; i++) {

            int x = input.nextInt();

            if (x >= 10 && x <= 20) {
                inCount++;
            }
            else {
                outCount++;
            }
        }

        System.out.println("Numbers within the range: " + inCount);
        System.out.println("Numbers outside the range: " + outCount);

        input.close();

    }
}
