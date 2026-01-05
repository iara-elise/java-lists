/* QUESTÃO 4 */

/* Escreva um programa que dado dois valores informe qual deles é o maior. */

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        System.out.println("Insira dois números:");

        int num_01 = tec.nextInt();
        int num_02 = tec.nextInt();

        tec.close();

        if (num_01 > num_02) {
            System.out.print(num_01 + " é maior que " + num_02 + ".");
        }
        
        else {
            System.out.print(num_02 + " é maior que " + num_01 + ".");
        }
    }
}
