package lista_03;

import java.util.Scanner;

public class Q_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double nota = 0;
        do {
            if (nota < 0 || nota > 10) {
                System.out.println("Valor Inválido");
            }
            System.out.print("Digite uma nota entre 0 (zero) e 10 (dez): ");
            nota = input.nextDouble();
        } while (nota < 0 || nota > 10);
    }

}
