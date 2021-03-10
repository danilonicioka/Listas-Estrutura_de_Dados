package lista_01;

import java.util.Scanner;

public class Q_12 {

    public static void main(String[] args) {

        Scanner h = new Scanner(System.in);
        System.out.print("Informe sua altura em metros: ");
        System.out.printf("Seu \"peso\" ideal é, aproximadamente, de: %.2f kg\n", 72.7 * h.nextFloat() - 58);
    }

}
