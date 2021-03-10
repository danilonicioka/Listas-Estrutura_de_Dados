package lista_01;

import java.util.Scanner;

public class Q_07 {

    public static void main(String[] args) {

        double area;
        Scanner lado = new Scanner(System.in);
        System.out.print("Informe a medida do lado de um quadrado: ");
        area = Math.pow(lado.nextDouble(), 2);
        System.out.println("O dobro da medida da área desse quadrado é: " + (2 * area));
    }
}
