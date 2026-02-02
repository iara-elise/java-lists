/* QUESTÃO 03 */

/* Escreva um algoritmo que solicite ao usuário dois valores para determinação de um intervalo.
Ao final o algoritmo deverá imprimir todos os números desse intervalo e o somatório deles. */

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        System.out.println("Enter 2 numbers: ");

        Scanner input = new Scanner(System.in);

        int num_01 = input.nextInt();
        int num_02 = input.nextInt();

        input.close();

        int sum = 0;

        for (int i = num_01; i <= num_02; i++) {
            System.out.println(i);

            sum += i;
        }

        System.out.println("Sum of entered numbers: " + sum);

    }
}
