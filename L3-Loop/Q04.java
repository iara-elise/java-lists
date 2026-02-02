/* QUESTÃO 04 */

/* Escreva um algoritmo que solicite do usuário 10 números e ao final imprima na tela o somatório desses números. */

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter 10 numbers:");

        for(int i = 1; i <=10; i++) {
            int num = input.nextInt();

            sum += num;
        }

        input.close();
        System.out.println("Sum of entered numbers: " + sum);
    }
}
