/* QUESTÃO 6 */

/*  Escreva um programa que solicita ao usuário 3 valores inteiros. Em seguida o pro-
grama deverá exibir os 3 valores digitados pelo usuário em ordem crescente. */

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        
        System.out.println("Insira três números inteiros: ");

        int num_01 = tec.nextInt();
        int num_02 = tec.nextInt();
        int num_03 = tec.nextInt();

        tec.close();
        
        if (num_01 <= num_02 && num_01 <= num_03) {

            if(num_02 <= num_03) {
                System.out.println("Números em ordem em crescente: " + num_01 + ", " + num_02 + ", " + num_03 + ".");
            }
            else {
                System.out.println("Números em ordem em crescente: " + num_01 + ", " + num_03 + ", " + num_02 + ".");
            }
        }

        else if (num_02 <= num_01 && num_02 <= num_03) {

            if(num_01 <= num_03) {
                System.out.println("Números em ordem em crescente: " + num_02 + ", " + num_01 + ", " + num_03 + ".");
            }
            else {
                System.out.println("Números em ordem em crescente: " + num_02 + ", " + num_03 + ", " + num_01 + ".");
            }
        }
        
        else {
            if(num_01 <= num_02) {
                System.out.println("Números em ordem em crescente: " + num_03 + ", " + num_01 + ", " + num_02 + ".");
            }
            else {
                System.out.println("Números em ordem em crescente: " + num_03 + ", " + num_02 + ", " + num_01 + ".");
            }
        }

    }
}
