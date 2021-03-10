package lista_02;

import java.util.Scanner;

public class Q_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Double nota1, nota2, media;

        System.out.print("Informe a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.print("Informe a segunda nota: ");
        nota2 = input.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media < 7) {
            System.out.println("Reprovado");
        } else if (media < 10) {
            System.out.println("Aprovado");
        } else if (media == 10) {
            System.out.println("Aprovado com Distinção");
        }

    }
}
