/* QUESTÃO 06 */

/* Escreva um algoritmo que solicite do usuário 5 valores e ao final apresente na tela o somatório dos valores
maiores ou igual a 10 e menor do que 20. */

import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter 5 numbers: ");

        for(int i = 1; i <= 5; i++) {
            int num = input.nextInt();

            if(num >= 10 && num < 20) {
                sum += num;
            }
        }

        input.close();
        System.out.println("Sum of numbers greater than or equal to 10 and less than 20: " + sum);
        
    }
    
}
