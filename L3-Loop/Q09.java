/* QUESTÃO 09 */

/* Escreva um algoritmo que solicite do usuário 10 valores. O algoritmo deverá calcular a soma da sequência de valores pares
e dos valores ímpares, ou seja, somar o 1° número digitado com o 3°, 5°, 7° e 9° e o mesmo para os números pares.
Após, informar se o somatório dos números ímpares é maior, igual ou menor do que o dos números pares. */

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 1; i <= 10; i++) {
            int num = input.nextInt();

            if (i % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        input.close();

        System.out.println("Sum of a sequence of even numbers in even positions: " + evenSum);
        System.out.println("Sum of sequence of odd numbers in odd positions: " + oddSum);

        if(oddSum > evenSum) {
            System.out.println("The sum of numbers in odd positions is GREATER than the sum of numbers in even positions.");
        }
        else if(oddSum < evenSum) {
            System.out.println("The sum of numbers in odd positions is LESS than the sum of numbers in even positions.");
        }
        else {
            System.out.println("The sum of numbers in odd positions and even positions is equal.");
        }

    }
}
