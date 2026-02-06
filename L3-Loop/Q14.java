/* QUESTÃO 14 */

/* Escreva um algoritmo que solicite ao usuário um número inteiro e depois imprima uma sequência de caracteres que represente um triângulo.
Exemplo:

Entrada: 3

Saída:

*
* *
* * *
* *
*

*/

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        input.close();

        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
