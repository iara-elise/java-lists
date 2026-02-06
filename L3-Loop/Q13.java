/* QUESTÃO 13 */

/* Escreva um algoritmo que imprima na tela a tabuada da multiplicação de um número
inteiro de 1 a 10. Exemplo:

Entrada: 9

Saída: 1x9=9; 2x9=18; 3x9=27; 4x9=36; 5x9=45; 6x9=54; 7x9=63; 8x9=72;
9x9=81; 10x9=90; */

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");
        int num = input.nextInt();

        input.close();

        for(int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + num * i);

        }
    }
    
}
