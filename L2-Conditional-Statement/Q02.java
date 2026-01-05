/* QUESTÃO 2 */

/* Escreva um programa que solicita o valor de um ano ao usuário, em seguida informa
se o ano fornecido é ou não bissexto. [Dica: um ano é bissexto se é divisível por 4,
mas não por 100. Para que um número X seja considerado divisível por um número
Y é preciso que o resto da divisão de X por Y seja igual a ZERO]. */

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        System.out.print("Insira um ano: ");
        int ano = tec.nextInt();

        tec.close();

        if (ano % 4 == 0 && ano % 100 != 0) {
            System.out.print(ano + " é um ano bissexto.");
        }

        else {
            System.out.print(ano + " não é um ano bissexto.");
        }
    }
    
}
