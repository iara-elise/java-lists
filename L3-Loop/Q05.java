/* QUESTÃO 05 */

/* Escreva um algoritmo que solicite do usuário 5 valores e ao final apresente na tela o somatório dos valores menores que 10. */

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter 5 numbers: ");

        for(int i = 1; i <= 5; i++) {
            int num = input.nextInt();

            if (num < 10) {
                sum += num;
            }
         }

         input.close();
         System.out.println("Sum of numbers less than 10: " + sum);
    }
}
