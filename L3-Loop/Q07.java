/* QUESTÃO 07 */

/* Escreva um algoritmo que solicite do usuário 5 valores e ao final apresente na tela o somatório dos valores pares que foram digitados. */

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");

        int sum = 0;

        for(int i = 1; i <= 5; i++) {
            int num = input.nextInt();

            if(num % 2 == 0) {
                sum += num;
            }
        }
        
        input.close();
        System.out.println("Sum of even numbers: " + sum);
        
    }
}
