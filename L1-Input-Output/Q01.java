import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        System.out.println("Insira dois números: ");

        int num_01 = tec.nextInt();
        int num_02 = tec.nextInt();

        tec.close();
        System.out.println();

        /* SOMA */

        System.out.println("SOMA");

        int soma = num_01 + num_02;
        System.out.println("RESULTADO: " + soma + "\n");


        /* SUBTRAÇÃO */

        System.out.println("SUBTRAÇÃO");

        int subtracao = num_01 - num_02;
        System.out.println("RESULTADO: " + subtracao + "\n");


        /* MULTIPLICAÇÃO */

        System.out.println("MULTIPLICAÇÃO");

        int multiplicacao = num_01 * num_02;
        System.out.println("RESULTADO: " + multiplicacao + "\n");


        /* DIVISÃO */

        System.out.println("DIVISÃO");

        int divisao = num_01 / num_02;
        System.out.println("RESULTADO: " + divisao + "\n");

    }
}