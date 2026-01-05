/* QUESTÃO 7 */

/*  Escreva um programa que solicita ao usuário 3 valores inteiros.
Em seguida o programa deverá perguntar ao usuário se deseja ver os valores impressos em ordem crescente ou decrescente.
Após a escolha, o programa deverá exibir os valores ordenados conforme indicação do usuário. */

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Insira três números inteiros: ");

        int num_01 = tec.nextInt();
        int num_02 = tec.nextInt();
        int num_03 = tec.nextInt();

        System.out.println("Como você deseja vizualizar a saída?");
        System.out.println("1 - Ordem crescente | 2 - Ordem decrescente");

        int ordem = tec.nextInt();

        tec.close();

        if (ordem == 1) {
            if (num_01 <= num_02 && num_01 <= num_03) {

                if (num_02 <= num_03) {

                    System.out.println("Números em ordem em crescente: " + num_01 + ", " + num_02 + ", " + num_03 + ".");
                } else {
                    System.out.println("Números em ordem em crescente: " + num_01 + ", " + num_03 + ", " + num_02 + ".");
                }
            }

            else if (num_02 <= num_01 && num_02 <= num_03) {

                if (num_01 <= num_03) {
                    System.out.println("Números em ordem em crescente: " + num_02 + ", " + num_01 + ", " + num_03 + ".");
                } else {
                    System.out.println("Números em ordem em crescente: " + num_02 + ", " + num_03 + ", " + num_01 + ".");
                }
            }

            else {
                if (num_01 <= num_02) {
                    System.out.println("Números em ordem em crescente: " + num_03 + ", " + num_01 + ", " + num_02 + ".");
                } else {
                    System.out.println("Números em ordem em crescente: " + num_03 + ", " + num_02 + ", " + num_01 + ".");
                }
            }
        }


        if (ordem == 2) {
            if (num_01 >= num_02 && num_01 >= num_03) {

                if (num_02 >= num_03) {

                    System.out.println("Números em ordem em decrescente: " + num_01 + ", " + num_02 + ", " + num_03 + ".");
                } else {
                    System.out.println("Números em ordem em decrescente: " + num_01 + ", " + num_03 + ", " + num_02 + ".");
                }
            }

            else if (num_02 >= num_01 && num_02 >= num_03) {

                if (num_01 >= num_03) {
                    System.out.println("Números em ordem em decrescente: " + num_02 + ", " + num_01 + ", " + num_03 + ".");
                } else {
                    System.out.println("Números em ordem em decrescente: " + num_02 + ", " + num_03 + ", " + num_01 + ".");
                }
            }

            else {
                if (num_01 >= num_02) {
                    System.out.println("Números em ordem em decrescente: " + num_03 + ", " + num_01 + ", " + num_02 + ".");
                } else {
                    System.out.println("Números em ordem em decrescente: " + num_03 + ", " + num_02 + ", " + num_01 + ".");
                }
            }
        }

    }
}
