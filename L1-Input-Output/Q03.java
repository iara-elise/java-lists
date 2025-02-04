import java.util.Scanner;

public class Q03 {  
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        double PI = 3.14;

        System.out.print("Insira o valor do raio de um circulo: ");
        double raio = tec.nextDouble();

        tec.close();
        System.out.println();

        double areaCirculo = PI * Math.pow(raio, 2);
        System.out.println("A área do circulo é: " + areaCirculo);

    }
}