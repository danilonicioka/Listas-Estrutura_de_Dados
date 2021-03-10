package lista_01;

import java.util.Scanner;

public class Q_10 {

    public static void main(String[] args) {

        float Tc;
        Scanner T = new Scanner(System.in);
        System.out.print("Informe uma temperatura em Celsius: ");
        Tc = T.nextFloat();
        System.out.printf("A temperatura informada é equivalente a %.2f em graus Farenheit\n", 9 * Tc / 5 + 32);
    }

}
