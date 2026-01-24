/* QUESTÃO 7 */

/*  Escreva um programa que solicita ao usuário 3 valores inteiros.
Em seguida o programa deverá perguntar ao usuário se deseja ver os valores impressos em ordem crescente ou decrescente.
Após a escolha, o programa deverá exibir os valores ordenados conforme indicação do usuário. */

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers: ");

        int num_01 = input.nextInt();
        int num_02 = input.nextInt();
        int num_03 = input.nextInt();

        System.out.println("How do you want to view the output?");
        System.out.println("1 - Ascending order | 2 - Descending order");

        int choice = input.nextInt();

        input.close();

        // Option 1: Ascending Order (Crescente)
        if (choice == 1) {
            if (num_01 <= num_02 && num_01 <= num_03) {
                if (num_02 <= num_03) {
                    System.out.println("Numbers in ascending order: " + num_01 + ", " + num_02 + ", " + num_03 + ".");
                } else {
                    System.out.println("Numbers in ascending order: " + num_01 + ", " + num_03 + ", " + num_02 + ".");
                }
            }
            else if (num_02 <= num_01 && num_02 <= num_03) {
                if (num_01 <= num_03) {
                    System.out.println("Numbers in ascending order: " + num_02 + ", " + num_01 + ", " + num_03 + ".");
                } else {
                    System.out.println("Numbers in ascending order: " + num_02 + ", " + num_03 + ", " + num_01 + ".");
                }
            }
            else {
                if (num_01 <= num_02) {
                    System.out.println("Numbers in ascending order: " + num_03 + ", " + num_01 + ", " + num_02 + ".");
                } else {
                    System.out.println("Numbers in ascending order: " + num_03 + ", " + num_02 + ", " + num_01 + ".");
                }
            }
        }

        // Option 2: Descending Order (Decrescente)
        else if (choice == 2) {
            if (num_01 >= num_02 && num_01 >= num_03) {
                if (num_02 >= num_03) {
                    System.out.println("Numbers in descending order: " + num_01 + ", " + num_02 + ", " + num_03 + ".");
                } else {
                    System.out.println("Numbers in descending order: " + num_01 + ", " + num_03 + ", " + num_02 + ".");
                }
            }
            else if (num_02 >= num_01 && num_02 >= num_03) {
                if (num_01 >= num_03) {
                    System.out.println("Numbers in descending order: " + num_02 + ", " + num_01 + ", " + num_03 + ".");
                } else {
                    System.out.println("Numbers in descending order: " + num_02 + ", " + num_03 + ", " + num_01 + ".");
                }
            }
            else {
                if (num_01 >= num_02) {
                    System.out.println("Numbers in descending order: " + num_03 + ", " + num_01 + ", " + num_02 + ".");
                } else {
                    System.out.println("Numbers in descending order: " + num_03 + ", " + num_02 + ", " + num_01 + ".");
                }
            }
        }
    }
}