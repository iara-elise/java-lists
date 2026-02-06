/* QUESTÃO 15 */

/* Escreva um algoritmo que solicite números ao usuário e conte quantos desses são pares e quantos são ímpares,
até que seja digitado um número negativo. Ao final imprima na tela quantos números pares e ímpares foram digitados. */

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter some numbers:");

        int num = 0;
        int evenCount = 0;
        int oddCount = 0;

        while (num >= 0) {
            num = input.nextInt();

            if (num < 0) {
                break;
            }
            else if (num % 2 == 0) {
                evenCount += 1;
            }
            else {
                oddCount += 1;
            }

        }

        input.close();

        System.out.println("Total number of even numbers entered: " + evenCount);
        System.out.println("Total number of odd numbers entered: " + oddCount);

    }
}
