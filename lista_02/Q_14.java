package lista_02;

import java.util.Scanner;

public class Q_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double lado[] = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("%dº lado: ", i + 1);
            lado[i] = input.nextDouble();
        }

        if (lado[0] + lado[1] > lado[2] && lado[1] + lado[2] > lado[0] && lado[0] + lado[2] > lado[1]) {
            System.out.print("Os valores podem formar um Triângulo ");
            if (lado[0] == lado[1] && lado[0] == lado[2]) {
                System.out.println("Equilátero");
            } else if (lado[0] == lado[1] || lado[0] == lado[2] || lado[1] == lado[2]) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("Os valores não podem formar um triândulo");
        }
    }
}
