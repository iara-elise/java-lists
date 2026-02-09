/* Beecrowd - Questão 1114 */

/* Escreva um programa que repita a leitura de uma senha até que ela seja válida.
Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
Considere que a senha correta é o valor 2002.*/

import java.util.Scanner;

public class Q1114 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the password: ");

        int password = input.nextInt();

        while (password != 2002) {
            System.out.print("Invalid password. Try again: ");

            password = input.nextInt();
        }

        input.close();

        System.out.println("Correct password!");
    }
}