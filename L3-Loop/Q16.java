/* QUESTÃO 16 */

/*Escreva um algoritmo que solicite ao usuário um valor e em seguida apresente na tela uma sequência
começando em 1 e indo até o valor fornecido pelo usuário. Porém, se nessa sequência houver um número que
seja múltiplo de 3 escreva PI, e se houver um número que seja múltiplo de 7 escreva PA.
Caso haja um número que seja múltiplo de 3 e 7 escreva POW. */

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter one number: ");

        int num = input.nextInt();

        input.close();

        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0) {
                System.out.println("PI");
            }
            else if (i % 7 == 0) {
                System.out.println("POW");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
