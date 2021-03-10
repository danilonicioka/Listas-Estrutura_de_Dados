package lista_01;

import java.util.Scanner;

public class Q_05 {

    public static void main(String[] args) {

        Scanner medida = new Scanner(System.in);
        System.out.print("Informe uma medida em metros: ");
        System.out.println("A medida informada em centimetros é: " + (100 * medida.nextDouble()) + " cm");
    }

}
