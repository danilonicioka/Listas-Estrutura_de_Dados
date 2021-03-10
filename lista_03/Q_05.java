package lista_03;

import java.util.Scanner;

public class Q_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o salário inicial do funcionário: ");
        double salario = input.nextDouble();
        double taxa = 0.015;
        for (int i = 0; i < 25; i++) {
            salario += salario * taxa;
            taxa = taxa * 2;
        }

        System.out.printf("Salário atual: R$ %.2f\n", salario);
    }
}
