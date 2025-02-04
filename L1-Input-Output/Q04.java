
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Base do triângulo: ");
        double base = tec.nextDouble();

        System.out.print("Altura do triângulo: ");
        double altura = tec.nextDouble();

        tec.close();
        System.out.println();

        double areaTriangulo = base * altura / 2;
        System.out.print("Área do triângulo: " + areaTriangulo);


    }
    
}
