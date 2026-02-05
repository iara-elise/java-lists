/* QUESTÃO 12 */

/* Escreva um algoritmo que imprima na tela todos os números divisíveis por 7 (separados por “;”),
mas que não sejam múltiplos de 5 no intervalo de 1000 a 3000. */

public class Q12 {
    public static void main(String[] args) {
        
        String num = "";

        for(int i = 1000; i <= 3000; i++) {

            if(i % 7 == 0 && i % 5 != 0) {
                num += i + "; ";
            }
        }

        System.out.println(num);
    }
}
