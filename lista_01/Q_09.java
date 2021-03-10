package lista_01;

import java.util.Scanner;

public class Q_09 {

    public static void main(String[] args) {

        float Tf;
        Scanner T = new Scanner(System.in);
        System.out.print("Informe uma temperatura em Farenheit: ");
        Tf = T.nextFloat();
        System.out.printf("A temperatura informada é equivalente a %.2f em graus Celsius\n", 5 * (Tf - 32) / 9);
    }

}
