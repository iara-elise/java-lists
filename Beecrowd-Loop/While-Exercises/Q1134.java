/* Beecrowd - Questão 1134 */

/* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido).
O programa será encerrado quando o código informado for o número 4. */

import java.util.Scanner;

public class Q1134 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Which type of fuel did you use? \n");

        System.out.println("+-+-+-+-+-+-+-+-+-+");
        System.out.println("+ 1. Alcohol      +");
        System.out.println("+ 2. Gasoline     +");
        System.out.println("+ 3. Diesel       +");
        System.out.println("+ 4. Exit         +");
        System.out.println("+-+-+-+-+-+-+-+-+-+");

        int alcoholCount = 0;
        int gasolineCount = 0;
        int dieselCount = 0;
        int fuelType = 0;

        while (fuelType != 4) {

            fuelType = input.nextInt();

            if (fuelType == 1) {
                alcoholCount++;
            }
            else if (fuelType == 2) {
                gasolineCount++;
            }
            else if (fuelType == 3) {
                dieselCount++;
            }
        }

        System.out.println("Thanks!");
        System.out.println("+-+-+-+-+-+-+-+-+-+");
        System.out.println("+ Alcohol: " + alcoholCount + "      +");
        System.out.println("+ Gasoline: " + gasolineCount + "     +");
        System.out.println("+ Diesel: " + dieselCount + "       +");
        System.out.println("+-+-+-+-+-+-+-+-+-+");


        input.close();
    }
}
