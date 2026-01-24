/* QUESTÃO 2 */

/* Escreva um programa que solicita o valor de um ano ao usuário, em seguida informa
se o ano fornecido é ou não bissexto. [Dica: um ano é bissexto se é divisível por 4,
mas não por 100. Para que um número X seja considerado divisível por um número
Y é preciso que o resto da divisão de X por Y seja igual a ZERO]. */

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        input.close();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.print(year + " is a leap year.");
        }

        else {
            System.out.print(year + " is not a leap year.");
        }
    }
}