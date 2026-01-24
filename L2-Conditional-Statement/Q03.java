/* QUESTÃO 3 */

/* Escreva um programa que solicite um número entre 1 e 10. Caso o usuário digite um
valor dentro dessa faixa o programa deverá exibir a mensagem “O número digitado
está DENTRO da faixa solicitada.”, senão o programa deverá exibir a mensagem “O
número digitado está FORA da faixa solicitada.”. */

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");
        int number = input.nextInt();

        input.close();

        if (number >= 1 && number <= 10) {
            System.out.print("The number entered is within the selected range.");
        }

        else {
            System.out.print("The number entered is outside the selected range.");
        }

    }
}