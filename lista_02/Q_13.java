package lista_02;

import java.util.Scanner;

public class Q_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double media = 0, notas[] = new double[2];
        char conceito;

        for (int i = 0; i < 2; i++) {
            System.out.printf("Informe a %dª nota: ", i + 1);
            notas[i] = input.nextDouble();
            media += notas[i] / 2;
        }

        if (media >= 9) {
            conceito = 'A';
        } else if (media >= 7.5) {
            conceito = 'B';
        } else if (media >= 6) {
            conceito = 'C';
        } else if (media >= 4) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        System.out.println("Nota 1: " + notas[0] + "\n"
                + "Nota 2: " + notas[1] + "\n"
                + "Média: " + media + "\n"
                + "Conceito: " + conceito);

        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }

}
