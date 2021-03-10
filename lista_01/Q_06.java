package lista_01;

import java.util.Scanner;

public class Q_06 {

    public static void main(String[] args) {

        double raio;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a medida do raio de uma cricunferência: ");
        raio = input.nextDouble();
        System.out.printf("A medida da área dessa circunferência é: " + (Math.PI * Math.pow(raio, 2)));
    }

}
