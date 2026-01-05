/* QUESTÃO 3 */

/* Escreva um programa que solicite um número entre 1 e 10. Caso o usuário digite um
valor dentro dessa faixa o programa deverá exibir a mensagem “O número digitado
está DENTRO da faixa solicitada.”, senão o programa deverá exibir a mensagem “O
número digitado está FORA da faixa solicitada.”. */

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        System.out.print("Insira um número entre 1 e 10: ");
        int num = tec.nextInt();

        tec.close();

        if (num >= 1 && num <= 10) {
            System.out.print("O número digitado está dentro da faixa selecionada.");
        }

        else {
            System.out.print("O número digitado está fora da faixa selecionada.");
        }

    }
}
